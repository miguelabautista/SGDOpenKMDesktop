package com.novatec.sdg.dialogs

titledPane(id: 'informationPane', animated: false, collapsible: false,  minWidth: 166.0 , prefHeight: 119.0, prefWidth: 180.75,text: "Aviso") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 86.0, prefWidth: 168.0) {
        label(id: "InformationLabel", layoutX: 22.0, layoutY: 27.0, text: bind(model.messageProperty),contentDisplay:"CENTER")
        button(id: "okInformationButton", layoutX: 67.0, layoutY: 61.0, text: "_Ok",onAction:controller.cancelar)
    }
}
tran = translateTransition(500.ms, node: informationPane, fromY: 0, toY: -340).play()
tran2 = translateTransition(500.ms, node: informationPane, fromX: 0, toX: -900)
