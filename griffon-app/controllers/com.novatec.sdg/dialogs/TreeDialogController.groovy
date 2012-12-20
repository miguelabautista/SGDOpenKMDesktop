package com.novatec.sdg.dialogs

class TreeDialogController {
    def model
    def view

    def aceptar = {
        app.event('eraseTreeItem')
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
        }
        view.eliminarPane.visible = false
        destroyMVCGroup('treeDialog')
    }

    def cancelar = {
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            app.views.panelPrincipal.view.arbol.disable = false
            if (app.views.panelPrincipal.view.deleteFolderButton.isDisable()) {

                app.views.panelPrincipal.view.deleteFolderButton.disable = false

            }
            view.eliminarPane.visible = false
        }

        destroyMVCGroup('treeDialog')
    }

}
