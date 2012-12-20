package com.novatec.sdg

import com.novatec.beans.Imag
import com.novatec.services.documentservice.Document
import com.novatec.utils.Utilidades
import com.sun.javafx.scene.control.skin.LabeledText
import griffon.transform.Threading
import javafx.collections.ListChangeListener
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Rectangle2D
import javafx.scene.image.ImageView
import javafx.scene.layout.AnchorPane
import javafx.stage.FileChooser
import javafx.stage.Screen
import javafx.stage.Stage
import org.apache.commons.io.FileUtils
import javafx.scene.control.*
import javafx.scene.input.*

class PanelPrincipalController {
    def model
    def view
    def repositoryService
    def folderService
    def documentService
    def authService
    def tareaPruebaService
    TreeView arbol
    ContextMenu menuHijos
    ContextMenu menuRoot
    MenuItem checkout
    MenuItem checkoutCancel
    MenuItem checkin
    FileUtils utility = new FileUtils()
    private Rectangle2D backupWindowBounds = null;
    private boolean maximized = false;


    void mvcGroupInit(Map args) {
        tareaPruebaService.archiveOldSpittles()
        /*   view.topPanel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2) {
                    toogleMaximized(view.stagePrincipal)
                }
            }
        });*/
        // add window dragging
        view.topPanel.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.mouseDragOffsetX = event.getSceneX();
                model.mouseDragOffsetY = event.getSceneY();
            }
        });
        view.topPanel.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //if (isMaximized()) {
                view.stagePrincipal.setX(event.getScreenX() - model.mouseDragOffsetX);
                view.stagePrincipal.setY(event.getScreenY() - model.mouseDragOffsetY);
                //}
            }
        });
        arbol = view.arbol
        view.tabla.onDragDetected = arrastrarDetectado()
        view.tabla.onDragDone = arrastreListo()
        arbol.onDragOver = arrastrarSobre()
        arbol.onDragDropped = arratreSolto()
        view.tabla.getSelectionModel().getSelectedCells().addListener(new ListChangeListener<>() {

            @Override
            void onChanged(ListChangeListener.Change change) {
                def valor = view.tabla.getSelectionModel().getSelectedItem()
                if (valor == null) {
                    cerrarPanelAtributos()
                }
            }
        })
        execInsideUIAsync {
            menuHijos = new ContextMenu()
            menuRoot = new ContextMenu()
            //TreeItem
            MenuItem agregar = new MenuItem("Agregar");
            MenuItem eliminar = new MenuItem("Eliminar");
            MenuItem modificar = new MenuItem("Modificar");
            MenuItem tarea = new MenuItem("Tarea")

            //Table
            MenuItem eliminarItemTabla = new MenuItem("Eliminar")
            MenuItem modificarItemTabla = new MenuItem("Renombrar")
            MenuItem descargar = new MenuItem("Descargar")
            MenuItem addKeywords = new MenuItem("Agregar Etiquetas")
            checkout = new MenuItem("Check out")
            checkoutCancel = new MenuItem("Check out Cancel")
            checkin = new MenuItem("Check in")

            menuHijos.getItems().addAll(agregar, eliminar, modificar, tarea)

            menuRoot.getItems().addAll(eliminarItemTabla, modificarItemTabla, descargar, checkout, checkoutCancel, checkin, addKeywords)


            tarea.onAction = tareaAction as EventHandler<ActionEvent>

            modificarItemTabla.onAction = renameFileIcon as EventHandler<ActionEvent>

            addKeywords.onAction = addTasgIcon as EventHandler<ActionEvent>

            checkin.onAction = checkinDocument as EventHandler<ActionEvent>

            checkout.onAction = checkoutDocument as EventHandler<ActionEvent>

            checkoutCancel.onAction = checkoutCancelDocument as EventHandler<ActionEvent>

            eliminarItemTabla.onAction = eraseTablaItemIcon as EventHandler<ActionEvent>

            descargar.onAction = downloadItemIcon as EventHandler<ActionEvent>

            agregar.onAction = agregarTreeItemIcon as EventHandler<ActionEvent>

            eliminar.onAction = eliminarTreeItemIcon as EventHandler<ActionEvent>

            modificar.onAction = modificarTreeItemIcon as EventHandler<ActionEvent>

            arbol.setContextMenu(menuHijos)

            view.tabla.setContextMenu(menuRoot)
        }
    }

    def tareaAction = {  ActionEvent t ->
        view.tabla.disable = true
        view.arbol.disable = true
      //  t.consume()
    }

    def checkinDocument = { ActionEvent t ->

        com.novatec.beans.Document valor = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()

        view.downloadFileButton.disable = true
        def mvc = buildMVCGroup('checkinDialog', [item: valor])
        def pantalla = mvc.view.checkinPanel

        pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.2)
        pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
        execInsideUIAsync {
            view.grupo.getChildren().add(pantalla)
        }
        view.tabla.disable = true

      //  t.consume()
    }

    def checkoutCancelDocument = {  evt = null ->

        TreeItem subDirectorio = (TreeItem) arbol.getSelectionModel().getSelectedItem();
        com.novatec.beans.Document archivo = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem();
        String direccion = null;
        if (subDirectorio != null) {
            direccion = model.path + "/" + subDirectorio.getValue().toString() + "/" + archivo.getName();
        } else {
            for (Map.Entry<String, String> entry : model.subRoot.entrySet()) {
                if (entry.getValue().equals(archivo.getName())) {
                    direccion = model.path + "/" + entry.getKey() + "/" + archivo.name;
                }
            }
        }
        if (archivo.checkout) {
            documentService.checkoutCancelDocument(model.token, direccion);
        }
        model.tablaItems.each { com.novatec.beans.Document docu ->
            if (docu.is(archivo)) {
                docu.checkout = false
            }
        }
        tableMouse.call()

      //  evt.consume()
    }

    def checkoutDocument = {  evt = null ->
        com.novatec.beans.Document valor = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()

        view.downloadFileButton.disable = true
        def mvc = buildMVCGroup('downloadPane', [item: valor, checkout: true])
        def pantalla = mvc.view.downloadPane

        pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
        pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
        execInsideUIAsync {
            view.grupo.getChildren().add(pantalla)
        }
        view.tabla.disable = true
        tableMouse.call()

       // evt.consume()
    }


    def cerrarPanelAtributos() {
        try {
            app.event('destroyPanel')
        } catch (Exception e) {}
    }

    EventHandler<DragEvent> arrastreListo() {
        new EventHandler<DragEvent>() {

            @Override
            void handle(DragEvent event) {
                if (event.getTransferMode() == TransferMode.MOVE) {

                    view.progressVisibility = true

                    TreeItem subDirectorio = (TreeItem) arbol.getSelectionModel().getSelectedItem();
                    com.novatec.beans.Document archivo = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem();

                    String direccion = model.path + "/" + subDirectorio.getValue().toString() + "/" + archivo.getName();

                    String nuevaDireccion = model.path + "/" + model.carpetaArrastre + "/";

                    documentService.moveDocument(model.token, direccion, nuevaDireccion)

                    model.tablaItems.remove(archivo)
                    view.progressVisibility = false
                }

                event.consume();

            }
        }
    }

    EventHandler<? super DragEvent> arratreSolto() {
        new EventHandler<DragEvent>() {

            @Override
            void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasString()) {
                    success = true;
                }

                event.setDropCompleted(success);

                event.consume();
            }
        }
    }

    EventHandler<DragEvent> arrastrarSobre() {
        new EventHandler<DragEvent>() {

            @Override
            void handle(DragEvent event) {
                TreeItem item = (TreeItem) arbol.getSelectionModel().getSelectedItem();

                Object target = event.getTarget();

                if (target instanceof LabeledText) {
                    model.carpetaArrastre = ((LabeledText) target).getText();
                }

                String value = arbol.getRoot().getValue().toString();

                if (!item.getValue().equals(model.carpetaArrastre)
                        && event.getDragboard().hasString()) {
                    if (model.carpetaArrastre != null && !model.carpetaArrastre.equals(value)) {
                        event.acceptTransferModes(TransferMode.MOVE);
                    }
                }

                event.consume();
            }
        }
    }

    EventHandler<MouseEvent> arrastrarDetectado() {
        new EventHandler<MouseEvent>() {

            @Override
            void handle(MouseEvent evt) {
                Dragboard db = view.tabla.startDragAndDrop(TransferMode.MOVE)

                ClipboardContent content = new ClipboardContent()
                content.putString(view.tabla.getSelectionModel().getSelectedItem().toString())
                db.setContent(content)

                evt.consume()
            }
        }
    }

    def descargarItem = {  ActionEvent t ->
        com.novatec.beans.Document valor = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()

        view.downloadFileButton.disable = true
        def mvc = buildMVCGroup('downloadPane', [item: valor])
        def pantalla = mvc.view.downloadPane

        pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
        pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
        execInsideUIAsync {
            view.grupo.getChildren().add(pantalla)
        }
        view.tabla.disable = true
       // t.consume()
    }

    def agregarTreeItem = {    ActionEvent t ->

        FileChooser fileChooser = new FileChooser()

        model.selectedFile = fileChooser.showOpenDialog(view.stagePrincipal)

        if (model.selectedFile != null) {
            view.tabla.disable = false
            view.addTagsFileButton.disable = true
            def mvc = buildMVCGroup("keywordsPane", [selectedFile: model.selectedFile])

            def pantalla = mvc.view.keywordsPanel

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.2)

            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)

            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
       // t.consume()
    }

    def commitTree = { TreeView.EditEvent evt = null ->
        def oldValue = model.path + "/" + model.treeItemSelectedValue
        def newValue = model.textField.text

        folderService.renameFolder(model.token, oldValue, newValue)

        model.treeItemSelected.setGraphic(model.treeItemSelectedGraphic)
        model.treeItemSelected.setValue(model.textField.text)
        model.textField = null
        treeMouse.call()

       // evt.consume()
    }

    def cancelarTree = { TreeView.EditEvent evt = null ->
        model.treeItemSelected.setGraphic(model.treeItemSelectedGraphic)
        model.treeItemSelected.setValue(model.treeItemSelectedValue)
        model.textField = null

      //  evt.consume()
    }

    def eraseTablaItemIcon = { evt = null ->
        def valor = view.tabla.getSelectionModel().getSelectedItem()
        if (valor != null) {
            view.eraseFileButton.disable = true
            def mvc = buildMVCGroup('tableDialog', [message: "Desea eliminar el archivo?"])
            def pantalla = mvc.view.eliminarPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
            view.tabla.disable = true
        } else {
            def message = "Seleccione un Archivo"
            def mvc = buildMVCGroup('informationDialog', [message: message])

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
       // evt.consume()
    }

    def renameFileIcon = { evt = null ->
        def valor = view.tabla.getSelectionModel().getSelectedItem()
        if (valor != null) {
            view.renameFileButton.disable = true
            def mvc = buildMVCGroup('renameFile', [valor: valor])
            def pantalla = mvc.view.renamePanel

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
            view.tabla.disable = true
        } else {
            def message = "Seleccione un Archivo"
            def mvc = buildMVCGroup('informationDialog', [message: message])

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
      //  evt.consume()
    }

    def onEraseTableItem = {   evt = null ->
        execInsideUIAsync {
            model.progressVisibility = true
            TreeItem subDirectorio = (TreeItem) arbol.getSelectionModel().getSelectedItem();
            com.novatec.beans.Document archivo = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem();
            String direccion = null;
            if (subDirectorio != null) {
                direccion = model.path + "/" + subDirectorio.getValue().toString() + "/" + archivo.getName();
            } else {
                for (Map.Entry<String, String> entry : model.subRoot.entrySet()) {
                    if (entry.getValue().equals(archivo.getName())) {
                        direccion = model.path + "/" + entry.getKey() + "/" + archivo.name;
                    }
                }
            }
            execOutsideUI {
                documentService.deleteDocument(model.token, direccion)
            }

            model.tablaItems.remove(archivo)
            /* execInsideUIAsync {
              arbol.getRoot().getChildren().remove item
              view.arbol.disable = false
              arbol.getSelectionModel().clearSelection()
              view.tabla.visible = false
          }
          if (view.deleteFolderButton.isDisable()) {
              view.deleteFolderButton.disable = false
          }  */
            view.eraseFileButton.disable = false
            view.tabla.disable = false
            model.progressVisibility = false
            cerrarPanelAtributos()
        }
      //  evt.consume()
    }

    def agregarTreeItemIcon = { evt = null ->
        view.newFileInFolderButton.disable = true
        def valor = arbol.getSelectionModel().getSelectedItem()
        if (valor != null && valor.value != model.path.substring(14)) {
            FileChooser fileChooser = new FileChooser()
            model.selectedFile = fileChooser.showOpenDialog(view.stagePrincipal)

            if (model.selectedFile != null) {
                if (model.selectedFile != null) {
                    view.tabla.disable = false
                    view.addTagsFileButton.disable = true
                    def mvc = buildMVCGroup("keywordsPane", [selectedFile: model.selectedFile])

                    def pantalla = mvc.view.keywordsPanel

                    pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.2)

                    pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)

                    execInsideUIAsync {
                        view.grupo.getChildren().add(pantalla)
                    }
                }
            }
            view.newFileInFolderButton.disable = false
        } else {
            view.newFileInFolderButton.disable = true
            def mvc = buildMVCGroup('informationDialog')

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX(arbol.getLayoutX() + (arbol.getWidth() / 10))
            pantalla.setLayoutY((arbol.getLayoutY() + arbol.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
       // evt.consume()
    }

    def onEraseTreeItem = {  evt = null ->
        TreeItem item = (TreeItem) arbol.getSelectionModel().getSelectedItem()
        final String hijo = (String) item.getValue();

        execOutsideUI {
            folderService.deleteFolder(model.token, model.path + "/" + hijo)
        }
        execInsideUIAsync {
            arbol.getRoot().getChildren().remove item
            view.arbol.disable = false
            arbol.getSelectionModel().clearSelection()
            view.tabla.visible = false
        }
        if (view.deleteFolderButton.isDisable()) {
            view.deleteFolderButton.disable = false
        }
    }

    def agragarTreeItem = {evt = null ->
        TreeItem nuevoItem = new TreeItem<>("Nuevo Directorio", new ImageView(model.rootIcon));
        def noCrear = false
        for (i in arbol.getRoot().getChildren()) {
            if (i.value == nuevoItem.value) {
                noCrear = true
                break;
            }
        }
        if (!noCrear) {
            arbol.getTreeItem(0).getChildren().add(nuevoItem)
            folderService.createSimpleFolder(model.token, model.path + "/" + nuevoItem.getValue())
        }
      //  evt.consume()
    }

    def eliminarTreeItemIcon = { evt = null ->
        def valor = arbol.getSelectionModel().getSelectedItem()
        view.deleteFolderButton.disable = true
        if (valor != null && valor.value != model.path.substring(14)) {
            view.deleteFolderButton.disable = true
            def mvc = buildMVCGroup('treeDialog')

            def pantalla = mvc.view.eliminarPane

            pantalla.setLayoutX(arbol.getLayoutX() + (arbol.getWidth() / 8))
            pantalla.setLayoutY((arbol.getLayoutY() + arbol.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
            view.arbol.disable = true
        } else {

            def mvc = buildMVCGroup('informationDialog')

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX(arbol.getLayoutX() + (arbol.getWidth() / 10))
            pantalla.setLayoutY((arbol.getLayoutY() + arbol.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
        view.deleteFolderButton.disable = false

       // evt.consume()
    }

    def modificarTreeItemIcon = { evt = null ->
        model.treeItemSelected = (TreeItem) arbol.getSelectionModel().getSelectedItem()
        if (model.treeItemSelected && model.treeItemSelected.value != model.path.substring(14)) {
            if (model.textField == null) {
                model.treeItemSelectedGraphic = model.treeItemSelected.graphic
                model.treeItemSelectedValue = model.treeItemSelected.value

                model.textField = new TextField(model.treeItemSelected.getValue())

                model.textField.onKeyReleased = { KeyEvent t1 ->
                    if (t1.getCode() == KeyCode.ENTER) {
                        commitTree.call()
                    } else if (t1.getCode() == KeyCode.ESCAPE) {
                        cancelarTree.call()
                    }
                } as EventHandler
                arbol.edit(model.treeItemSelected)
                model.treeItemSelected.setGraphic(model.textField)
                model.treeItemSelected.setValue("")
                model.textField.requestFocus()
            }
        } else {
            view.modificarFolderButton.disable = true
            def mvc = buildMVCGroup('informationDialog')

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX(arbol.getLayoutX() + (arbol.getWidth() / 10))
            pantalla.setLayoutY((arbol.getLayoutY() + arbol.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
      //  evt.consume()
    }

    def addTasgIcon = {  evt = null ->
        com.novatec.beans.Document valor = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()
        if (valor != null) {
            view.tabla.disable = false
            view.addTagsFileButton.disable = true
            def isOnlyKeywords = true
            def mvc = buildMVCGroup("keywordsPane", [isOnlyKeywords: isOnlyKeywords, selectedFile: valor])

            def pantalla = mvc.view.keywordsPanel

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.2)

            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)

            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        } else {
            def message = "Seleccione un Archivo"
            def mvc = buildMVCGroup('informationDialog', [message: message])

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
       // evt.consume()
    }

    def searchItems = { evt = null ->
        view.tabla.disable = true
        arbol.disable = true
        view.searchingFilesButton.disable = true
        def mvc = buildMVCGroup("busquedaDialog")

        def pantalla = mvc.view.busquedaPanel

        //layoutX="355.0" layoutY="153.0"

        pantalla.setLayoutX(355)

        pantalla.setLayoutY(200)

        execInsideUIAsync {
            view.grupo.getChildren().add(pantalla)
        }
     //   evt.consume()
    }

    def downloadItemIcon = { evt = null ->
        com.novatec.beans.Document valor = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()
        if (valor != null) {
            view.downloadFileButton.disable = true
            def mvc = buildMVCGroup('downloadPane', [item: valor])
            def pantalla = mvc.view.downloadPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
            view.tabla.disable = true
        } else {
            def message = "Seleccione un Archivo"
            def mvc = buildMVCGroup('informationDialog', [message: message])

            def pantalla = mvc.view.informationPane

            pantalla.setLayoutX((view.tabla.getWidth() / 2) * 1.5)
            pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
            execInsideUIAsync {
                view.grupo.getChildren().add(pantalla)
            }
        }
      //  evt.consume()
    }
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def treeMouse = { MouseEvent evt = null ->
        TreeItem item = (TreeItem) view.arbol.getFocusModel().getFocusedItem()

        if (evt?.button == MouseButton.SECONDARY) {
            if (item.value == model.path.substring(14)) {
                menuHijos.hide();
            }
        }
        try {
            if (item.value == model.path.substring(14)) {
                try {
                    app.views.atributesPane.view.atributosPanel.visible = false
                    destroyMVCGroup('atributesPane')
                } catch (Exception e) {}
            }
        } catch (Exception e) {

        }

        Object rutaInicial = "/okm:personal/" + view.arbol.getTreeItem(0).getValue();
        Object padre = null;
        try {
            padre = "/okm:personal/" + item.getParent().getValue();
        } catch (NullPointerException e) {
            tableData(rutaInicial.toString());
            return;
        }
        final Object hijo = item.getValue();
        tableData(padre + "/" + hijo);
     //   evt.consume()
    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_SYNC)
    def tableMouse = { MouseEvent evt = null ->
        TableView tabla = view.tabla
        AnchorPane anchor = view.anchorTabla
        com.novatec.beans.Document archivo = (com.novatec.beans.Document) view.tabla.getSelectionModel().getSelectedItem()

        if (archivo != null) {
            if (archivo.checkout) {
                checkout.disable = true
                checkoutCancel.disable = false
                checkin.disable = false
            } else {
                checkout.disable = false
                checkin.disable = true
                checkoutCancel.disable = true
            }
            try {
                def mvc = buildMVCGroup('atributesPane')

                def pantalla = mvc.view.atributosPanel

                pantalla.setLayoutX(248)
                pantalla.setLayoutY((view.tabla.getLayoutY() + view.tabla.getHeight()) + 100)
                execInsideUIAsync {
                    view.grupo.getChildren().add(pantalla)
                }
                app.event("chargeAtributes", [archivo])
            } catch (Exception e) {
                app.event('chargeAtributes', [archivo])
            }
        } else {
            menuRoot.hide();
        }
      //  evt.consume()
    }

    void tableData(String path) {
        execOutsideUI {
            if (path == model.path) {
                view.tabla.visible = false
            } else {
                execInsideUIAsync {
                    model.progressVisibility = true
                    view.tabla.visible = true
                }
                model.tablaItems.clear()

                List<Document> lista = documentService.getDocuments(model.token, path)

                Utilidades util = new Utilidades();

                lista.each { Document document ->

                    String nombre = document.getPath().substring(path.length() + 1);

                    int indexOf = nombre.indexOf('.');

                    Imag imagen = util.getImagen(nombre.substring(indexOf + 1).toLowerCase());

                    String fechaCreacion = document.getCreated().getDay() + "-" + document.getCreated().getMonth() + "-" + document.getCreated().getYear() + " " + document.getCreated().getHour() + ":" + document.getCreated().getMinute();

                    String fechaModificacion = document.getLastModified().getDay() + "-" + document.getLastModified().getMonth() + "-" + document.getLastModified().getYear() + " " + document.getLastModified().getHour() + ":" + document.getLastModified().getMinute();

                    model.tablaItems.add(new com.novatec.beans.Document(imagen: imagen, name: nombre, tamano: utility.byteCountToDisplaySize(document.getActualVersion().getSize()), fechaDeCreacion: fechaCreacion, fechaDeModificacion: fechaModificacion, checkout: document.checkedOut, version: document.actualVersion.name));
                }
                execInsideUIAsync {
                    model.progressVisibility = false
                }
            }
        }
    }

    def salir = { evt = null ->
        withMVCGroup('exitDialog') { m, v, c ->
            c.show(view.stagePrincipal)
        }
    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def minimizar = {  evt = null ->
        view.stagePrincipal.setIconified(true)
        //evt.consume()
    }


    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def maximizar = {  evt = null ->
        toogleMaximized(view.stagePrincipal)
      //  evt.consume()
    }


    public void toogleMaximized(Stage stage) {
        final Screen screen = Screen.getScreensForRectangle(stage.getX(), stage.getY(), 1, 1).get(0);
        if (maximized) {
            maximized = false;
            if (backupWindowBounds != null) {
                stage.setX(backupWindowBounds.getMinX());
                stage.setY(backupWindowBounds.getMinY());
                stage.setWidth(backupWindowBounds.getWidth());
                stage.setHeight(backupWindowBounds.getHeight());
            }
        } else {
            maximized = true;
            backupWindowBounds = new Rectangle2D(stage.getX(), stage.getY(), stage.getWidth(), stage.getHeight());
            stage.setX(screen.getVisualBounds().getMinX());
            stage.setY(screen.getVisualBounds().getMinY());
            stage.setWidth(screen.getVisualBounds().getWidth());
            stage.setHeight(screen.getVisualBounds().getHeight());
        }
        app.event('destroyPanel')
        tableMouse.call()
    }

    def isMaximized() {
        maximized
    }
}

