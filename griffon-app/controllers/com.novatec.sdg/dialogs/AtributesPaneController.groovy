package com.novatec.sdg.dialogs

import com.novatec.services.documentservice.Version
import com.novatec.services.searchservice.QueryResult
import javafx.collections.ListChangeListener
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.control.TreeItem
import org.apache.commons.io.FileUtils

class AtributesPaneController {
    def model
    def view
    def searchService
    def propertyService
    def documentService
    FileUtils uti = new FileUtils()
    Button[] boton

    void mvcGroupInit(Map args) {

        view.bookmarksList.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<>() {

            @Override
            void onChanged(ListChangeListener.Change change) {
                def item = view.bookmarksList.getSelectionModel().getSelectedItem()
                if (item != null) {
                    model.deleteButtonVisible = true
                } else {
                    model.deleteButtonVisible = false
                }
            }
        })
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def deleteItem = { evt = null ->
        def item = view.bookmarksList.getSelectionModel().getSelectedItem()
        execOutsideUI {
            propertyService.deleteKeyword(app.models.panelPrincipal.token, model.direccion, item)
        }
        execInsideUIAsync {
            model.keywordsLista.remove item
        }
    }


    def onDestroyPanel = {
        execInsideUIAsync {
            try {
                view.tran2.play()
            } catch (Exception e) {}
        }
        execOutsideUI {
            Thread.sleep(900)

            view.atributosPanel.visible = false
        }

        destroyMVCGroup('atributesPane')
    }

    def onChargeAtributes = {  com.novatec.beans.Document document ->
        model.keywordsLista.clear()
        model.historialLista.clear()
        view.nombreDocumentoText.text = document.name
        view.tamanoLabel.text = document.tamano
        view.checkoutLabel.text = document.checkout.toString()

        fillListKeywords(document)

        fillHistorial(document)
    }

    private void fillHistorial(com.novatec.beans.Document document) {

        TreeItem subDirectorio = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem()

        if (subDirectorio != null) {

            model.direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + document.name;

        } else {
            for (Map.Entry<String, String> entry : app.models.panelPrincipal.subRoot.entrySet()) {

                if (entry.getValue().equals(document.name)) {

                    model.direccion = app.models.panelPrincipal.path + "/" + entry.getKey() + "/" + document.name;

                }

            }
        }


        execOutsideUI {
            List<Version> historial = documentService.getVersionHistory(app.models.panelPrincipal.token, model.direccion)


            execInsideUIAsync {
                try {

                    boton = new Button[historial.size()]
                    def i = 0
                    historial.reverseEach { Version version ->

                        String fecha = version.getCreated().getDay() + "-" + version.getCreated().getMonth() + "-" + version.getCreated().getYear() + " " + version.getCreated().getHour() + ":" + version.getCreated().getMinute();
                        def actual

                        if (version.actual) {
                            actual = "Actual"
                        } else {
                            actual = ""
                        }

                        def b = new Button("Restautar")
                        b.setId(version.name)
                        b.onAction = restaurarAction()

                        boton[i] = b

                        def hayBoton = actual == "" ? boton[i] : null

                        model.historialLista.add(new com.novatec.beans.Version(actual: actual, created: fecha, checksum: version.checksum, name: version.name, comment: version.comment, size: uti.byteCountToDisplaySize(version.size), boton: hayBoton))

                        i++
                    }
                } catch (NullPointerException e) {}
            }
        }

    }

    private void fillListKeywords(com.novatec.beans.Document document) {

        TreeItem subDirectorio = (TreeItem) app.views.panelPrincipal.view.arbol.getSelectionModel().getSelectedItem()

        if (subDirectorio != null) {

            model.direccion = app.models.panelPrincipal.path + "/" + subDirectorio.getValue().toString() + "/" + document.name;

        } else {
            for (Map.Entry<String, String> entry : app.models.panelPrincipal.subRoot.entrySet()) {

                if (entry.getValue().equals(document.name)) {

                    model.direccion = app.models.panelPrincipal.path + "/" + entry.getKey() + "/" + document.name;

                }

            }
        }
        execOutsideUI {
            List<QueryResult> allDocuments = searchService.findByName(app.models.panelPrincipal.token, document.name)

            List<String> keywords = null;
            for (QueryResult documento : allDocuments) {
                if (documento.getDocument().getPath().equals(model.direccion)) {
                    keywords = documento.getDocument().getKeywords();
                }
            }
            execInsideUIAsync {
                try {
                    model.keywordsLista.addAll(keywords)
                } catch (NullPointerException e) {}
            }
        }
    }

    EventHandler<ActionEvent> restaurarAction() {
        new EventHandler<ActionEvent>() {

            @Override
            void handle(ActionEvent t) {
                Button boton = (Button) t.source
                restoreVersion(boton)
            }
        }
    }

    def restoreVersion(Button boton) {
        documentService.restoreVersion(app.models.panelPrincipal.token, model.direccion, boton.id)
        execInsideUIAsync {
            //  model.historialLista.clear()
            // fil

            app.models.panelPrincipal.tablaItems.clear()
            app.controllers.panelPrincipal.treeMouse.call()
        }
    }
}

