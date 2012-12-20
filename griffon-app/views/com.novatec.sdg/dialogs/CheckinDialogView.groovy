package com.novatec.sdg.dialogs

titledPane(id: "checkinPanel", collapsible: false, layoutY: -31.0, minWidth: 180.0, prefHeight: 188.0, prefWidth: 325.0, text: "Aviso") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 92.0, prefWidth: 176.0) {
        label(layoutX: 14.0, layoutY: 14.0, text: "Seleccione archivo")
        hbox(alignment: "CENTER", layoutX: 99.0, layoutY: 127.0, spacing: 5.0) {
            button(id: "aceptarRutaDescarga", text: "Aceptar",onAction:controller.aceptar)
            button(id: "cancelarRutaDescarga", text: "Cancelar",onAction:controller.cancelar)
        }
        hbox(alignment: "CENTER", layoutX: 28.0, layoutY: 42.0, spacing: 5.0) {
            textField(id: "rutaDescarga", prefWidth: 198.0,text:bind(model.rutaDescargaProperty))
            button(id: "modificarRutaDescarga", text: "Seleccionar",onAction:controller.modificarRuta)
        }
        label(layoutX: 14.0, layoutY: 81.0, text: "Comentario")
        textArea(layoutX: 85.0, layoutY: 77.0, prefHeight: 38.0, prefWidth: 217.0, wrapText: "true",text:bind(model.comentarioProperty))
    }
}
tran = translateTransition(500.ms, node: checkinPanel, fromY: 0, toY: -355).play()
tran2 = translateTransition(500.ms, node: checkinPanel, fromX: 0, toX: -900)