package com.novatec.sdg.dialogs

import com.novatec.beans.Document
import com.novatec.utils.Utilidades
import javafx.scene.control.TreeItem
import javafx.stage.DirectoryChooser

class DownloadPaneController {
    def model
    def view
    def documentService

    void mvcGroupInit(Map args) {

        /*  view.downloadPane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.mouseDragOffsetX = event.getX();
                model.mouseDragOffsetY = event.getY();
                println "${model.mouseDragOffsetX} ${model.mouseDragOffsetY}"
            }
        });
        view.downloadPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //if (!windowButtons.isMaximized())
                view.downloadPane.setTranslateX(event.getSceneX() - model.mouseDragOffsetX);
                view.downloadPane.setTranslateY(event.getSceneY() - model.mouseDragOffsetY);
                //}
            }
        });*/
    }

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
            view.downloadPane.visible = false
        }

        destroyMVCGroup('downloadPane')
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
            Utilidades util = new Utilidades();
            util.setRoot(model.rutaDescarga);
            byte[] contenido = null;

            contenido = documentService.getContentDocument(app.models.panelPrincipal.token, direccion, false)

            if(model.checkout){
                documentService.checkoutDocument(app.models.panelPrincipal.token, direccion)
            }

            app.models.panelPrincipal.tablaItems.each { com.novatec.beans.Document docu ->
                if (docu.is(archivo)) {
                    docu.checkout = true
                }
            }

            util.createNewFile(archivo.getName(), util.getRoot(), contenido);
        }
        execInsideUIAsync {
            app.models.panelPrincipal.progressVisibility = false

            app.views.panelPrincipal.view.arbol.disable = false
            app.views.panelPrincipal.view.tabla.disable = false
        }
        def message = "Archivo Descargado"
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
            view.downloadPane.visible = false
        }

        destroyMVCGroup('downloadPane')
        execInsideUIAsync {
            app.views.panelPrincipal.view.tabla.disable = false
        }
    }

    def modificarRuta = { evt = null ->
        DirectoryChooser chooser = new DirectoryChooser()
        File file = chooser.showDialog(app.views.panelPrincipal.view.stagePrincipal)
        model.rutaDescarga = file?.absolutePath
    }
}
