package com.novatec.sdg.dialogs

import javafx.scene.image.ImageView

titledPane(id: "keywordsPanel", collapsible: false, minWidth: 180.0, prefHeight: 212.0, prefWidth: 325.0, text: "Aviso") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 196.0, prefWidth: 321.0) {
        label(layoutX: 14.0, layoutY: 14.0, text: "Agregar palabras claves")
        hbox(alignment: "CENTER", layoutX: 175.0, layoutY: 150.0, spacing: 5.0) {
            button(id: "aceptarRutaDescarga", text: "Aceptar",onAction:controller.aceptar)
            button(id: "cancelarRutaDescarga", text: "Cancelar",onAction:controller.cancelar)
        }
        listView(id: "BookmarksListView", layoutX: 64.0, layoutY: 83.0, prefHeight: 49.0, prefWidth: 194.0){
            BookmarksListView.setItems(model.keywords)
        }
        hbox(alignment: "CENTER", layoutX: 64.0, layoutY: 41.0, spacing: 5.0) {
            textField(id: "agregarBookmark", prefWidth: 158.0,text:bind(model.keywordProperty),onAction:controller.agregarKeyword)
            button(id: "agregarButtonBookmark", mnemonicParsing: false, text: "Agregar",visible:bind(model.agregarButtonProperty),onAction:controller.agregarKeyword)
        }
        button(id: "deleteBookmark", contentDisplay: "GRAPHIC_ONLY", layoutX: 266.0, layoutY: 111.0, minWidth: 17.0, mnemonicParsing: false, prefWidth: 17.0, text: "Button", visible: bind(model.deleteButtonProperty),onAction:controller.deleteListItem,graphic:new ImageView(model.deleteIcon))
    }
}
tran = translateTransition(500.ms,node:keywordsPanel,fromY:0,toY:-360).play()
tran2 = translateTransition(500.ms,node:keywordsPanel,fromX:0,toX:800)