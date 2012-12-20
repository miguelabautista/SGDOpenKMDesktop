package com.novatec.sdg.dialogs

scene(id: 'exitScene') {
    anchorPane(prefHeight: 100.0, prefWidth: 307.0) {
        text(layoutX: 79.0, layoutY: 38.0, strokeType: "OUTSIDE", strokeWidth: 0.0, text: "Seleccione una opcion", font: '15px')
        hbox(alignment: "CENTER", layoutX: 50.0, layoutY: 61.0, spacing: 5.0) {
            button(text: "_Cerrar sesion",onAction:controller.cerrarSesion)
            button(text: "_Salir",onAction:controller.salir)
            button(text: "_Cancelar",onAction:controller.hide)
        }
    }
}
