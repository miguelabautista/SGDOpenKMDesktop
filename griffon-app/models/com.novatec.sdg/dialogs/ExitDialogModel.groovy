package com.novatec.sdg.dialogs

import groovyx.javafx.beans.FXBindable

class ExitDialogModel {
    @FXBindable String title = 'Dialog'
    @FXBindable String message = ''
    boolean modal = true
}
