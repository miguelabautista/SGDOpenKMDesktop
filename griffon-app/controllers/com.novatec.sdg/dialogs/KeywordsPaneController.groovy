package com.novatec.sdg.dialogs

import com.novatec.services.documentservice.Document
import com.novatec.services.documentservice.ItemExistsException_Exception
import com.novatec.utils.Utilidades
import griffon.transform.Threading
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.collections.ListChangeListener
import javafx.scene.control.ListView
import javafx.scene.control.TreeItem

class KeywordsPaneController {
    def model
    def view
    def documentService
    def propertyService

    void mvcGroupInit(Map args) {
        ListView d = view.BookmarksListView
        d.getItems().addListener(new ListChangeListener() {

            @Override
            void onChanged(ListChangeListener.Change change) {
                if (model.keywords.size() > 0) {
                    model.deleteButton = true
                } else {
                    model.deleteButton = false
                }
            }
        })
        view.agregarBookmark.textProperty().addListener({ ObservableValue observableValue, Object t, Object t1 ->
            if (t1.toString().size() != 0) {
                model.agregarButton = true
            } else {
                model.agregarButton = false
            }
        } as ChangeListener)

    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def deleteListItem = { evt = null ->
        def valor = view.BookmarksListView.getSelectionModel().getSelectedItem()
        model.keywords.remove(valor)
    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def agregarKeyword = { evt = null ->
        model.keywords.add(model.keyword)
        model.keyword = ""
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
            app.views.panelPrincipal.view.tabla.disable = false
            if (app.views.panelPrincipal.view.addTagsFileButton.isDisable()) {

                app.views.panelPrincipal.view.addTagsFileButton.disable = false

            }
            view.keywordsPanel.visible = false
        }

        destroyMVCGroup('keywordsPane')
        execOutsideUI {
            if (model.isOnlyKeywords) {
                TreeItem subDirectorio = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem();
                String direccion = null;

                if (model.selectedFile != null && subDirectorio != null) {
                    direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + model.selectedFile.getName();
                } else {
                    com.novatec.beans.Document item = (com.novatec.beans.Document) app.views.panelPrincipal.view.tabla.getSelectionModel().getSelectedItem();
                    if (subDirectorio != null) {
                        direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + item.getName();
                    } else {
                        for (Map.Entry<String, String> entry : app.models.panelPrincipal.subRoot.entrySet()) {
                            if (entry.getValue().equals(item.getName())) {
                                direccion = app.models.panelPrincipal.path + "/" + entry.getKey() + "/" + item.getName();
                            }
                        }
                    }
                }
                model.keywords.each { palabra ->
                    propertyService.addKeyword(app.models.panelPrincipal.token, direccion, palabra)
                }
            } else {
                execInsideUIAsync {
                    app.models.panelPrincipal.progressVisibility = true

                    app.views.panelPrincipal.view.arbol.disable = true
                    app.views.panelPrincipal.view.tabla.disable = true
                }
                Utilidades utilidades = new Utilidades()

                byte[] bytesFromFile = utilidades.getBytesFromFile(model.selectedFile)

                TreeItem item = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem();

                final Object hijo = item.getValue();

                String direccion = app.models.panelPrincipal.path + "/" + hijo + "/" + model.selectedFile.getName()

                Document doc = new Document()

                doc.path = direccion
                model.keywords.each { valor ->
                    doc.keywords.add(valor.toString())
                }
                def time1 = System.currentTimeMillis()
                execOutsideUI {
                    try {
                        documentService.createDocument(app.models.panelPrincipal.token, doc, bytesFromFile)


                        def time2 = System.currentTimeMillis()
                        println "tiempo transcurrido " + (time2 - time1)
                    } catch (ItemExistsException_Exception e) {
                        def message = "  Ya existe el documento"

                        def mvc = buildMVCGroup('informationDialog', [message: message])

                        def pantalla = mvc.view.informationPane

                        pantalla.setLayoutX((app.views.panelPrincipal.view.tabla.getWidth() / 2) * 1.5)
                        pantalla.setLayoutY((app.views.panelPrincipal.view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
                        execInsideUIAsync {
                            app.views.panelPrincipal.view.grupo.getChildren().add(pantalla)
                        }
                    }
                    execInsideUIAsync {
                        app.models.panelPrincipal.progressVisibility = false
                        app.views.panelPrincipal.view.view.arbol.disable = false
                        app.views.panelPrincipal.view.arbol.getFocusModel().focus(app.views.panelPrincipal.view.arbol.getFocusModel().getFocusedIndex())
                        app.views.panelPrincipal.view.arbol.getSelectionModel().select(app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem())
                        app.views.panelPrincipal.view.tabla.disable = false
                        app.controllers.panelPrincipal.treeMouse.call()
                    }
                }
            }
        }
    }

    def cancelar = { evt = null ->
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            app.views.panelPrincipal.view.tabla.disable = false
            if (app.views.panelPrincipal.view.addTagsFileButton.isDisable()) {

                app.views.panelPrincipal.view.addTagsFileButton.disable = false

            }
            view.keywordsPanel.visible = false
        }

        destroyMVCGroup('keywordsPane')

        if (!model.isOnlyKeywords) {
            execInsideUIAsync {
                app.models.panelPrincipal.progressVisibility = true

                app.views.panelPrincipal.view.arbol.disable = true
                app.views.panelPrincipal.view.tabla.disable = true
            }
            Utilidades utilidades = new Utilidades()

            byte[] bytesFromFile = utilidades.getBytesFromFile(model.selectedFile)

            TreeItem item = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem();

            final Object hijo = item.getValue();

            String direccion = app.models.panelPrincipal.path + "/" + hijo + "/" + model.selectedFile.getName()

            Document doc = new Document()

            doc.path = direccion
            execOutsideUI {
                try {
                    documentService.createDocument(app.models.panelPrincipal.token, doc, bytesFromFile)
                } catch (ItemExistsException_Exception e) {
                    def message = "  Ya existe el documento"

                    def mvc = buildMVCGroup('informationDialog', [message: message])

                    def pantalla = mvc.view.informationPane

                    pantalla.setLayoutX((app.views.panelPrincipal.view.tabla.getWidth() / 2) * 1.5)
                    pantalla.setLayoutY((app.views.panelPrincipal.view.tabla.getLayoutY() + app.views.panelPrincipal.view.tabla.getHeight()) + 100)
                    execInsideUIAsync {
                        app.views.panelPrincipal.view.grupo.getChildren().add(pantalla)
                    }
                }
                execInsideUIAsync {
                    app.models.panelPrincipal.progressVisibility = false
                    app.views.panelPrincipal.view.view.arbol.disable = false
                    app.views.panelPrincipal.view.arbol.getFocusModel().focus(app.views.panelPrincipal.view.arbol.getFocusModel().getFocusedIndex())
                    app.views.panelPrincipal.view.arbol.getSelectionModel().select(app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem())
                    app.views.panelPrincipal.view.tabla.disable = false
                    app.controllers.panelPrincipal.treeMouse.call()
                }
            }
        }
    }
}
