package com.novatec.sdg.dialogs

import javafx.scene.image.ImageView

titledPane(id: "atributosPanel", collapsible: false, layoutY: -2.0, prefHeight: 180.0, prefWidth: 1130.0, text: "Atributos") {
    tabPane(prefHeight: 200.0, prefWidth: 200.0, tabClosingPolicy: "UNAVAILABLE") {
        tab(text: "propiedades") {
            anchorPane(id: "Content", minHeight: 0.0, minWidth: 0.0, prefHeight: 180.0, prefWidth: 200.0) {
                label(layoutX: 14.0, layoutY: 20.0, text: "Nombre:")
                textField(id: "nombreDocumentoText", editable: false, layoutX: 69.0, layoutY: 14.0, prefWidth: 159.0)
                label(layoutX: 15.0, layoutY: 53.0, text: "Tamaño:")
                label(id: "tamanoLabel", layoutX: 74.0, layoutY: 53.0, prefWidth: 153.99990000000253)
                label(layoutX: 14.0, layoutY: 84.0, text: "Checkout:")
                label(id: 'checkoutLabel', layoutX: 74.0, layoutY: 84.0, prefWidth: 79.0)
                label(layoutX: 248.0, layoutY: 17.0, text: "Palabras Clave:")
                listView(id: "bookmarksList", layoutX: 341.0, layoutY: 14.0, prefHeight: 97.0, prefWidth: 200.0) {
                    bookmarksList.setItems(model.keywordsLista)
                }
                button(id: "borrarBookmarkButton", contentDisplay: "GRAPHIC_ONLY", layoutX: 548.0, layoutY: 95.0, minHeight: 16.0, minWidth: 15.0, mnemonicParsing: false, prefHeight: 16.0, prefWidth: 16.0, graphic: new ImageView(model.deleteIcon), visible: bind(model.deleteButtonVisibleProperty), onAction: controller.deleteItem)
            }
        }
        /* tab(text: "Notas") {
      anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 180.0, prefWidth: 200.0) {

      }
  }      */
        tab(text: "Historial") {
            anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 180.0, prefWidth: 200.0) {
                tableView(id: 'historialTabla', layoutX: 10.0, layoutY: 6.0, prefHeight: 113.0, prefWidth: 620.0) {
                    historialTabla.setItems(model.historialLista)
                    tableColumn(prefWidth: 75.0, text: "Version", property: 'name')
                    tableColumn(maxWidth: 140.0, minWidth: 120.0, prefWidth: 120.0, text: "Fecha", property: 'created')
                    tableColumn(maxWidth: 100.0, minWidth: 90.0, prefWidth: 100.0, text: "Tamaño", property: 'size')
                    tableColumn(maxWidth: 100.0, minWidth: 140.0, prefWidth: 170.0, text: "Comentario", property: 'comment')
                    tableColumn(maxWidth: 90.0, minWidth: 90.0, prefWidth: 90.0, text: "Actual", property: 'actual')
                    tableColumn(maxWidth: 90.0, minWidth: 90.0, prefWidth: 90.0, property: 'boton')
                }
            }
        }
    }
}
tran = translateTransition(200.ms, node: atributosPanel, fromY: 0, toY: -175).play()
tran2 = translateTransition(200.ms, node: atributosPanel, fromY: -175, toY: 300)