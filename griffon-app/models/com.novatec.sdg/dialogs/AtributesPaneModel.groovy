package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.image.Image

class AtributesPaneModel {
    @FXBindable String message
    @FXBindable boolean deleteButtonVisible
    String direccion

    ObservableList keywordsLista = FXCollections.observableArrayList([])

    ObservableList<com.novatec.beans.Version> historialLista = FXCollections.observableArrayList([])

    Image deleteIcon = new Image(getClass().getResourceAsStream("/icons/menu/cross.png"))
}
