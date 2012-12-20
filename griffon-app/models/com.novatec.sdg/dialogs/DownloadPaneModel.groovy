package com.novatec.sdg.dialogs

import com.novatec.utils.Utilidades
import groovyx.javafx.beans.FXBindable

class DownloadPaneModel {
    double mouseDragOffsetX = 0
    double mouseDragOffsetY = 0

    @FXBindable String rutaDescarga
    def item
    def checkout

    void mvcGroupInit(Map args) {
        checkout = args.checkout
        item = args.item

        Utilidades util = new Utilidades();

        rutaDescarga = util.getRoot();
    }
}
