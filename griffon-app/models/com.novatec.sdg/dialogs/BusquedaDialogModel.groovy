package com.novatec.sdg.dialogs

import com.novatec.services.searchservice.QueryResult
import groovyx.javafx.beans.FXBindable
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.image.Image

class BusquedaDialogModel {
    //Por Contenido
    @FXBindable boolean resultVisible
    @FXBindable String ocurrenciasLabel
    @FXBindable String contentText
    @FXBindable boolean buscarContenido = true
    @FXBindable boolean limpiarBusquedaContenido
    @FXBindable boolean progressContenido
    @FXBindable boolean verContenidoVisible
    @FXBindable def sizePorContenido = 0

    List<QueryResult> resultadoContenido = []

    //PorNombre
    @FXBindable boolean resultVisiblePorNombre
    @FXBindable String ocurrenciasLabelNombre
    @FXBindable String contentTextPorNombre
    @FXBindable boolean buscarPorNombre = true
    @FXBindable boolean progressNombre
    @FXBindable boolean verPorNombreVisible
    @FXBindable def sizePorNombre = 0

    List<QueryResult> resultadoPorNombre = []

    //PorKeywords
    ObservableList keywords = FXCollections.observableArrayList([])
    @FXBindable boolean resultVisiblePorKeyword
    @FXBindable String ocurrenciasLabelKeyword
    @FXBindable String contentTextPorKeyword
    @FXBindable boolean buscarPorKeyword = true
    @FXBindable boolean progressKeyword
    @FXBindable boolean verPorKeywordVisible
    @FXBindable boolean agregarKeyword
    @FXBindable def sizePorKeyword = 0
    @FXBindable boolean deletePorKeyword

    List<QueryResult> resultadoPorKeyword = []

    Image cleanIcon = new Image(getClass().getResourceAsStream("/icons/menu/delete.png"))

    void mvcGroupInit(Map args) {
//        message = 'BusquedaDialog Group'
    }
}
