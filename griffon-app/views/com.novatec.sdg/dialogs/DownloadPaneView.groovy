package com.novatec.sdg.dialogs

titledPane(id: "downloadPane", collapsible: false,minWidth: 180.0, prefHeight: 157.0, prefWidth: 325.0, text: "Aviso") {
    anchorPane(id: "Content", minHeight: 0.0, minWidth: 0.0, prefHeight: 92.0, prefWidth: 176.0) {
        label(layoutX: 14.0, layoutY: 14.0, text: "Ruta de descarga")
        hbox(alignment: "CENTER", layoutX: 99.0, layoutY: 95.0, spacing: 5.0) {
            button(id: "aceptarRutaDescarga", text: "Aceptar",onAction:controller.aceptar)
            button(id: "cancelarRutaDescarga", text: "Cancelar",onAction:controller.cancelar)
        }
        hbox(alignment: "CENTER", layoutX: 28.0, layoutY: 48.0, spacing: 5.0) {
            textField(id: "rutaDescarga", prefWidth: 198.0,text:bind(model.rutaDescargaProperty))
            button(id: "modificarRutaDescarga", text: "Modificar",onAction:controller.modificarRuta)
        }
    }
}
tran = translateTransition(500.ms, node: downloadPane, fromY: 0, toY: -340).play()
tran2 = translateTransition(500.ms, node: downloadPane, fromX: 0, toX: -900)
