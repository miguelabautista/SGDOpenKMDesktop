package com.novatec.sdg

import com.novatec.beans.Document
import com.novatec.services.folderservice.Folder
import groovyx.javafx.beans.FXBindable
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.control.TextField
import javafx.scene.control.TreeItem
import javafx.scene.image.Image

class PanelPrincipalModel {
    double mouseDragOffsetX = 0
    double mouseDragOffsetY = 0

    def token
    def repositoryService
    def folderService
    def path
    def treeItemSelectedGraphic
    def treeItemSelectedValue

    String carpetaArrastre

    TreeItem treeItemSelected
    TextField textField
    ObservableList<Folder> treeItems = FXCollections.observableArrayList([])
    ObservableList<Document> tablaItems = FXCollections.observableArrayList([])

    @FXBindable boolean progressVisibility

    File selectedFile

    Image rootIcon = new Image(getClass().getResourceAsStream("/folder.png"))
    Image deleteIcon = new Image(getClass().getResourceAsStream("/icons/delete.png"))
    Image addIcon = new Image(getClass().getResourceAsStream("/icons/menu/add.png"))
    Image renameIcon = new Image(getClass().getResourceAsStream("/icons/menu/page_edit.png"))
    Image newFileIcon = new Image(getClass().getResourceAsStream("/icons/menu/file_extension_txt.png"))
    Image exitIcon = new Image(getClass().getResourceAsStream("/icons/menu/search-clear.png"))
    Image minimizeIcon = new Image(getClass().getResourceAsStream("/icons/menu/icon_minimize.gif"))

    Image downloadIcon = new Image(getClass().getResourceAsStream("/icons/menu/download.png"))
    Image searchIcon = new Image(getClass().getResourceAsStream("/icons/menu/magnifier.png"))
    Image settingsIcon = new Image(getClass().getResourceAsStream("/icons/menu/settings.png"), 14, 14, true, true)

    Map<String, String> subRoot = new LinkedHashMap<>()

    void mvcGroupInit(Map args) {
        token = args.token
        path = repositoryService.getPersonalFolder(token).path
        println "prueba de camino " + path
        treeItems.addAll(folderService.getFolderChilds(token, path))
    }
}

