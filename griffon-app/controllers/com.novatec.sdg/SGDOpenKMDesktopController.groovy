package com.novatec.sdg

import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import com.novatec.services.authservice.AccessDeniedException_Exception

class SGDOpenKMDesktopController {
    def model
    def view
    def AuthService
    def token

    void mvcGroupInit(Map args) {

        view.user.textProperty().addListener(new ChangeListener() {

            @Override
            void changed(ObservableValue observableValue, Object t, Object t1) {
                String value = t1 as String
                if (value.isEmpty()) {
                    model.userValidation = true
                } else {
                    model.userValidation = false
                }
            }
        })
        view.password.textProperty().addListener(new ChangeListener() {

            @Override
            void changed(ObservableValue observableValue, Object t, Object t1) {
                String value = t1 as String
                if (value.isEmpty()) {
                    model.passwordValidation = true
                } else {
                    model.passwordValidation = false
                }
            }
        })
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def aceptar = { evt = null ->
        execInsideUIAsync {
            view.aceptar.setDisable(true)
        }
        def usuario = view.user.text
        def clave = view.password.text

        if (usuario.isEmpty()) {
            execInsideUIAsync {
                model.userValidation = true
                view.user.requestFocus()
                view.aceptar.setDisable(false)
            }
        } else if (clave.isEmpty()) {
            execInsideUIAsync {
                model.passwordValidation = true
                view.password.requestFocus()
                view.aceptar.setDisable(false)
            }
        } else {

            try {
                execOutsideUI {
                    token = AuthService.login(usuario, clave)
                }
            } catch (AccessDeniedException_Exception ex) {
                String message1 = ex.message;
                execInsideUIAsync {
                    model.message = message1
                    view.fadein.play()
                    view.fadein2.play()
                    view.aceptar.setDisable(false)
                }
            } catch (Exception exc) {
                execInsideUIAsync {
                    model.message = "no se puede conectar al servidor"
                    view.fadein.play()
                    view.fadein2.play()
                    view.aceptar.setDisable(false)
                }
            }
            println "valor del token ${token}"
            if (token) {
                def (m,v,c) = createMVCGroup("panelPrincipal", [token: token])
                def pantalla = v.stagePrincipal
                execInsideUIAsync {
                    app.windowManager.hide(view.stageWellcome)
                    pantalla.show()
                }
            }
            view.aceptar.setDisable(false)
            view.user.text = ""
            view.password.text = ""
        }
    }

    def salir = { evt = null ->
        System.exit(0)
    }
}
