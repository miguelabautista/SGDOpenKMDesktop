package com.novatec.sdg

import groovyx.javafx.beans.FXBindable
import griffon.util.GriffonNameUtils
import javafx.scene.image.Image

class SGDOpenKMDesktopModel {

    @FXBindable boolean userValidation = false
    @FXBindable boolean passwordValidation = false
    @FXBindable String message

    Image caution = new Image(getClass().getResourceAsStream("/icons/menu/caution_biohazard.png"))

}
