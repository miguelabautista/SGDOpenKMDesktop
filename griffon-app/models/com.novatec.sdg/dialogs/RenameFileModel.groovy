package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable

class RenameFileModel {
    @FXBindable String message
    com.novatec.beans.Document doc
    String nombreArchivo
    String extension

    void mvcGroupInit(Map args) {
        doc = (com.novatec.beans.Document) args.valor

        message = doc.name

        nombreArchivo = doc.name

        def index = nombreArchivo.indexOf(".")

        extension = nombreArchivo.substring(index)

        print extension

    }
}
