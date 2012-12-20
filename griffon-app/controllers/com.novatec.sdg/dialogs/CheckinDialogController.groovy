package com.novatec.sdg.dialogs

import com.novatec.beans.Document
import javafx.scene.control.TreeItem
import javafx.stage.FileChooser

class CheckinDialogController {
    def model
    def view
    def documentService

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def aceptar = { evt = null ->
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.downloadFileButton.isDisable()) {
                app.views.panelPrincipal.view.downloadFileButton.disable = false
            }
            view.checkinPanel.visible = false
        }

        destroyMVCGroup('checkinDialog')
        execInsideUIAsync {
            app.models.panelPrincipal.progressVisibility = true

            app.views.panelPrincipal.view.arbol.disable = true
        }

        execOutsideUI {
            TreeItem subDirectorio = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem();
            Document archivo = (Document) model.item;
            String direccion = null;
            if (subDirectorio != null) {
                direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + archivo.getName();
            } else {
                for (Map.Entry<String, String> entry : app.models.panelPrincipal.subRoot.entrySet()) {
                    if (entry.getValue().equals(archivo.getName())) {
                        direccion = app.models.panelPrincipal.path + "/" + entry.getKey() + "/" + archivo.getName();
                    }
                }
            }

            byte[] contenido = model.file.getBytes();

            String comentario = model.comentario

            documentService.checkinDocument(app.models.panelPrincipal.token, direccion, contenido, comentario)

            app.models.panelPrincipal.tablaItems.each { com.novatec.beans.Document docu ->
                if (docu.is(archivo)) {
                    docu.checkout = false
                }
            }

        }
        execInsideUIAsync {
            app.models.panelPrincipal.progressVisibility = false

            app.views.panelPrincipal.view.arbol.disable = false
            app.views.panelPrincipal.view.tabla.disable = false
        }
        def message = "Archivo subido"
        def mvc = buildMVCGroup('informationDialog', [message: message])

        def pantalla = mvc.view.informationPane

        pantalla.setLayoutX((app.views.panelPrincipal.view.tabla.getWidth() / 2) * 1.5)
        pantalla.setLayoutY((app.views.panelPrincipal.view.tabla.getLayoutY() + app.views.panelPrincipal.view.tabla.getHeight()) + 100)
        execInsideUIAsync {
            app.views.panelPrincipal.view.grupo.getChildren().add(pantalla)
        }
    }

    def cancelar = { evt = null ->
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.downloadFileButton.isDisable()) {
                app.views.panelPrincipal.view.downloadFileButton.disable = false
            }
            view.checkinPanel.visible = false
        }

        destroyMVCGroup('chekinDialog')
        execInsideUIAsync {
            app.views.panelPrincipal.view.tabla.disable = false
        }
    }

    def modificarRuta = { evt = null ->
        FileChooser chooser = new FileChooser()
        File file = chooser.showOpenDialog(app.views.panelPrincipal.view.stagePrincipal)
        model.rutaDescarga = file?.absolutePath
        model.file = file
    }
}
