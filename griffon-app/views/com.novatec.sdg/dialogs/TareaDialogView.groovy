package com.novatec.sdg.dialogs

application(title: 'SGDOpenKMApp2', sizeToScene: true, centerOnScreen: true) {
    scene(fill: black, width: 400, height: 300) {
        text(text: '@griffon.app.class.name', font: "80pt sanserif") {
            fill linearGradient(endX: 0, stops: [[0, RED], [1, ORANGE]])
        }
    }
}
