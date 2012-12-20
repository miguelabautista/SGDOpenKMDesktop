package com.novatec.sdg.dialogs

titledPane(id:'renamePanel',animated: false, collapsible: false, expanded: true, layoutX: -2.0, minWidth: 278.0, prefHeight: 146.0, prefWidth: 278.0, text: "Cambiar nombre archivo") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 160.0, prefWidth: 275.0) {
        textField(layoutX: 37.0, layoutY: 39.0, prefWidth: 200.0,text:bind(model.messageProperty))
        hbox(alignment: "CENTER", layoutX: 118.0, layoutY: 82.0, spacing: 5.0) {
            button(text: "_Aceptar",onAction:controller.aceptar)
            button(text: "_Cancelar",onAction:controller.cancelar)
        }
    }
}
tran = translateTransition(500.ms, node: renamePanel, fromY: 0, toY: -340).play()
tran2 = translateTransition(500.ms, node: renamePanel, fromX: 0, toX: -900)