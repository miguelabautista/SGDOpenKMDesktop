package com.novatec.sdg

import javafx.scene.image.ImageView
import javafx.scene.image.Image
import javafx.stage.Stage
import javafx.stage.StageStyle

stageWellcome = application(title: 'Servicio Gestion de Documentos', sizeToScene: true, centerOnScreen: true, resizable: false,onCloseRequest:controller.salir) {
    scene(id: 'WellcomeScene', fill: white, width: 383.0, height: 247.0) {
        //  WellcomeScene.stylesheets.add(getClass().getResource("/style.css").toString())
        group(id:"grupo") {
            anchorPane(id: "AnchorPane", prefHeight: 247.0, prefWidth: 383.0) {
                imageView(fitHeight: 69.04020368531353, fitWidth: 138.7777862548828, layoutX: 15.0, layoutY: 14.0, preserveRatio: true) {
                    image(url = getClass().getResource("/bannerInicio2.png").toString(), preserveRatio: false, smooth: false)
                }
                label(id: "bienvenido", layoutX: 176.0, layoutY: 43.0, text: "Bienvenido", textFill: "#3354ff", font: "24pt Arial") {
                    effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                }
                hbox(alignment: "CENTER", layoutX: 110.0, layoutY: 109.0, spacing: 5.0) {
                    label(text: "Usuario") {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                    textField(id: "user", prefWidth: 138.77777099609375) {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                    label(graphic:new ImageView(model.caution),visible:bind(model.userValidationProperty))
                }
                hbox(id: "HBox", alignment: "CENTER", layoutX: 93.0, layoutY: 141.0, spacing: 5.0) {
                    label(text: "contraseña") {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                    passwordField(id: "password", prefWidth: 139.0) {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                    label(graphic:new ImageView(model.caution),visible:bind(model.passwordValidationProperty))
                }
                hbox(id: "HBox", alignment: "CENTER", layoutX: 129.0, layoutY: 207.0, spacing: 5.0) {
                    button(id: "aceptar", text: "Aceptar",defaultButton:true, onAction: controller.aceptar) {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                    button(id: "salir", prefWidth: 58.0, text: "Salir",cancelButton:true, onAction: controller.salir) {
                        effect dropShadow(offsetX: 5.0, offsetY: 5.0)
                    }
                }
                label(id: "message", layoutX: 161.0, layoutY: 175.0, opacity: 0.0, textFill: "RED", text: bind(model.messageProperty))
            }
        }
    }
}
//stageWellcome.initStyle(StageStyle.UNDECORATED )
fadein = fadeTransition(5000.ms, node: message, from: 0.0, to: 1.0, autoReverse: true)
fadein2 = fadeTransition(5000.ms, node: message, from: 1.0, to: 0.0, autoReverse: true)
stageWellcome.getIcons().add(new Image(getClass().getResourceAsStream("/novateclogo.gif")))