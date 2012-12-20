package com.novatec.sdg.dialogs


titledPane(id: "eliminarPane", collapsible: false, minWidth: 166.0 , prefHeight: 109.0, prefWidth: 173.75, text: "Aviso") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 86.0, prefWidth: 168.0) {
        label(layoutX: 10.0, layoutY: 23.0, text: "Desea Eliminar el Directorio?")
        hbox(alignment: "CENTER", layoutX: 50.0, layoutY: 51.0, spacing: 5.0) {
            button(id: "siButtonArbol", text: "SI",onAction:controller.aceptar)
            button(id: "noButtonArbol", text: "No",onAction:controller.cancelar)
        }
    }
}
tran = translateTransition(500.ms,node:eliminarPane,fromY:0,toY:-340).play()
tran2 = translateTransition(500.ms,node:eliminarPane,fromY:-340,toY:25)