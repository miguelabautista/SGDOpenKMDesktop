package com.novatec.sdg.dialogs

import javafx.scene.image.ImageView

titledPane(id: "busquedaPanel", opacity: 0.0, collapsible: false, minWidth: 180.0, prefHeight: 258.0, prefWidth: 385.0, text: "Busquedas") {
    anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 232.0, prefWidth: 370.0) {
        tabPane(prefHeight: 232.0, prefWidth: 381.0, tabClosingPolicy: "UNAVAILABLE") {
            tab(id: 'contenidoTab', text: "Por contenido") {
                anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 201.0, prefWidth: 381.0) {
                    anchorPane(layoutX: 77.0, layoutY: 122.0, prefHeight: 73.0, prefWidth: 154.0, visible: bind(model.resultVisibleProperty)) {
                        label(text: "Se han encontrado:")
                        label(id = "ocurrenciasLabel", layoutX: 38.0, layoutY: 23.0, text: bind(model.ocurrenciasLabelProperty))
                        label(layoutX: 52.0, layoutY: 23.0, text: "Ocurrencias")
                        button(id: "ocurrenciasButton", layoutX: 17.0, layoutY: 51.0, mnemonicParsing: false, text: "Ver", visible: bind(model.verContenidoVisibleProperty), onAction: controller.resultadoPorContenido)
                    }
                    label(layoutX: 14.0, layoutY: 20.0, text: "Contenido")
                    textArea(id: "busquedaContent", layoutX: 78.0, layoutY: 20.0, prefHeight: 99.0, prefWidth: 256.0, wrapText: true, text: bind(model.contentTextProperty))
                    hbox(alignment: "CENTER", layoutX: 232.0, layoutY: 169.0, spacing: 5.0) {
                        button(id: "buscarContenidoButton", mnemonicParsing: false, text: "Buscar", onAction: controller.aceptarPorContenido, disable: bind(model.buscarContenidoProperty))
                        button(mnemonicParsing: false, text: "Cancelar", onAction: controller.cancelar)
                    }
                    button(id: "limpiarBusquedaContenido", contentDisplay: "GRAPHIC_ONLY", layoutX: 336.0, layoutY: 98.0, graphic: new ImageView(model.cleanIcon), mnemonicParsing: false, visible: bind(model.limpiarBusquedaContenidoProperty), onAction: controller.cleanPorContenidoArea)
                    progressBar(layoutX: 91.0, layoutY: 77.0, prefWidth: 200.0, visible: bind(model.progressContenidoProperty))
                }
            }
            tab(id: 'nombreTab', text: "Por nombre") {
                anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 180.0, prefWidth: 200.0) {
                    anchorPane(layoutX: 93.0, layoutY: 78.0, prefHeight: 73.0, prefWidth: 154.0, visible: bind(model.resultVisiblePorNombreProperty)) {
                        label(text: "Se han encontrado:")
                        label(id: "ocurrenciasLabel", layoutX: 38.0, layoutY: 23.0, text: bind(model.ocurrenciasLabelNombreProperty))
                        label(layoutX: 52.0, layoutY: 23.0, text: "Ocurrencias")
                        button(id: "ocurrenciasButton", layoutX: 17.0, layoutY: 52.0, mnemonicParsing: false, text: "Ver", visible: bind(model.verPorNombreVisibleProperty), onAction: controller.resultadoPorNombre)
                    }
                    hbox(alignment: "CENTER", layoutX: 233.0, layoutY: 167.0, spacing: 5.0) {
                        button(id: "buscarPorNombreButton", mnemonicParsing: false, text: "Buscar", onAction: controller.aceptarPorNombre, disable: bind(model.buscarPorNombreProperty))
                        button(mnemonicParsing: false, text: "Cancelar", onAction: controller.cancelar)
                    }
                    label(layoutX: 14.0, layoutY: 14.0, text: "Nombre del archivo")
                    textField(id: "buscarPorNombreField", layoutX: 93.0, layoutY: 42.0, prefWidth: 200.0, text: bind(model.contentTextPorNombreProperty))
                    progressBar(layoutX: 91.0, layoutY: 77.0, prefWidth: 200.0, visible: bind(model.progressNombreProperty))
                }
            }
            tab(id: 'keywordsTab', text: "Por palabras Claves") {
                anchorPane(minHeight: 0.0, minWidth: 0.0, prefHeight: 180.0, prefWidth: 200.0) {
                    anchorPane(layoutX: 14.0, layoutY: 149.0, minHeight: 42.0, prefHeight: 42.0, prefWidth: 126.0, visible: bind(model.resultVisiblePorKeywordProperty)) {
                        label(text: "Se han encontrado:")
                        label(id: "ocurrenciasLabel", layoutX: 38.0, layoutY: 23.0, text: bind(model.ocurrenciasLabelKeywordProperty))
                        label(layoutX: 52.0, layoutY: 23.0, text: "Ocurrencias")
                    }
                    hbox(alignment: "CENTER", layoutX: 230.0, layoutY: 170.0, spacing: 5.0) {
                        button(id: "buscarPorKeywordsAceptarButton", mnemonicParsing: false, text: "Buscar", onAction: controller.aceptarPorKeyword, disable: bind(model.buscarPorKeywordProperty))
                        button(id: "buscarPorKeywordsCancelarButton", mnemonicParsing: false, text: "Cancelar", onAction: controller.cancelar)
                    }
                    hbox(alignment: "CENTER", layoutX: 14.0, layoutY: 14.0, spacing: 5.0) {
                        label(text: "Nombre")
                        textField(id: "buscarPorKeywordsField", prefWidth: 200.0,text:bind(model.contentTextPorKeywordProperty))
                    }
                    listView(id: "buscarPorKeywordsLista", layoutX: 63.0, layoutY: 49.0, prefHeight: 78.0, prefWidth: 200.0){
                        buscarPorKeywordsLista.setItems(model.keywords)
                    }
                    button(id: "buscarPorKeywordsClearButton", contentDisplay: "GRAPHIC_ONLY",graphic:new ImageView(model.cleanIcon), layoutX: 270.0, layoutY: 106.0, mnemonicParsing: false, visible: bind(model.deletePorKeywordProperty),onAction:controller.deleteKeyword)
                    button(id: "ocurrenciasButton", layoutX: 147.0, layoutY: 170.0, mnemonicParsing: false, text: "Ver", visible: bind(model.verPorKeywordVisibleProperty),onAction:controller.resultadoPorKeyword)
                    button(id: "buscarPorKeywordsAgregar", layoutX: 270.0, layoutY: 15.0, mnemonicParsing: false, text: "Agregar", visible: bind(model.agregarKeywordProperty),onAction:controller.agregarKeyword)
                    progressBar(layoutX: 91.0, layoutY: 77.0, prefWidth: 200.0, visible: bind(model.progressKeywordProperty))
                }
            }
        }
    }
}
tran = fadeTransition(1000.ms, node: busquedaPanel, fromValue: 0.0, toValue: 1.0).play()
tran2 = fadeTransition(1000.ms, node: busquedaPanel, fromValue: 1.0, toValue: 0.0)