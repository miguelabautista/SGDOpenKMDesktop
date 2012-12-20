package com.novatec.sdg.dialogs

class TableDialogController {
    def model
    def view

    def aceptar = {
        app.event('eraseTableItem')
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
        }
        view.eliminarPane.visible = false
        destroyMVCGroup('tableDialog')
    }

    def cancelar = {
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            app.views.panelPrincipal.view.tabla.disable = false
            if (app.views.panelPrincipal.view.eraseFileButton.isDisable()) {

                app.views.panelPrincipal.view.eraseFileButton.disable = false

            }
            view.eliminarPane.visible = false
        }

        destroyMVCGroup('tableDialog')
    }
}
