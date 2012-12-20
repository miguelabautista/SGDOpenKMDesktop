package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable

class TableDialogModel {
    @FXBindable String message = "Desea eliminar el directorio?"

    void mvcGroupInit(Map args) {
        message = args.message
    }
}
