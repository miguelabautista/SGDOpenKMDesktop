package com.novatec.beans

import groovyx.javafx.beans.FXBindable

/**
 * Created with IntelliJ IDEA.
 * User: MIGUEL
 * Date: 06/09/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
@FXBindable
class Document {
    Imag imagen
    String name
    String tamano
    String fechaDeCreacion
    String fechaDeModificacion
    boolean checkout
    String version
}
