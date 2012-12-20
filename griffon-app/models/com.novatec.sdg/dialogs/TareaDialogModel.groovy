package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable

class TareaDialogModel {
    @FXBindable String message

    void mvcGroupInit(Map args) {
        message = 'TareaDialog Group'
    }
}
