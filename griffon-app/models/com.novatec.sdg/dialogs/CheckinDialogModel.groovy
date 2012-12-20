package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable

class CheckinDialogModel {
    @FXBindable String rutaDescarga
    @FXBindable String comentario
    File file
    def item
    def checkout

    void mvcGroupInit(Map args) {
        checkout = args.checkout
        item = args.item
    }
}
