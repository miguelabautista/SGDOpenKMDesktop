package com.novatec.sdg.dialogs

import javafx.scene.control.TreeItem

class RenameFileController {
    def model
    def view
    def documentService

    // void mvcGroupInit(Map args) {
    //    // this method is called after model and view are injected
    // }

    def aceptar = {
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
        }
        view.renamePanel.visible = false
        if (app.views.panelPrincipal.view.renameFileButton.isDisable()) {

            app.views.panelPrincipal.view.renameFileButton.disable = false

        }
        app.views.panelPrincipal.view.tabla.disable = false
        destroyMVCGroup('renameFile')

        execOutsideUI {
            TreeItem subDirectorio = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem();
            model.doc;
            String direccion = null;
            if (subDirectorio != null) {
                direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + model.doc.getName();
            } else {
                for (Map.Entry<String, String> entry : app.models.panelPrincipal.subRoot.entrySet()) {
                    if (entry.getValue().equals(model.doc.getName())) {
                        direccion = app.models.panelPrincipal.path + "/" + entry.getKey() + "/" + model.doc.getName();
                    }
                }
            }
            execOutsideUI {
                if (model.message.contains(".")) {
                    documentService.renameDocument(app.models.panelPrincipal.token, direccion, model.message)
                } else {
                    documentService.renameDocument(app.models.panelPrincipal.token, direccion, model.message + model.extension)
                }
            }
            app.models.panelPrincipal.tablaItems.clear()
            app.controllers.panelPrincipal.treeMouse.call()
        }

    }

    def cancelar = {
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            app.views.panelPrincipal.view.tabla.disable = false
            if (app.views.panelPrincipal.view.renameFileButton.isDisable()) {

                app.views.panelPrincipal.view.renameFileButton.disable = false

            }
            view.renamePanel.visible = false
        }
        app.views.panelPrincipal.view.tabla.disable = false
        destroyMVCGroup('renameFile')
    }
}
