package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.image.Image

class KeywordsPaneModel {
    def selectedFile
    ObservableList keywords = FXCollections.observableArrayList([])
    @FXBindable def keyword
    @FXBindable boolean agregarButton
    @FXBindable boolean deleteButton
    boolean isOnlyKeywords

    Image deleteIcon = new Image(getClass().getResourceAsStream("/icons/menu/cross.png"))


    void mvcGroupInit(Map args) {
        selectedFile = args.selectedFile
        isOnlyKeywords = args.isOnlyKeywords
    }
}
