package com.novatec.sdg.dialogs

class InformationDialogController {
    def model
    def view

    void mvcGroupInit(Map args) {
        if (!args) {
            model.message = args.message
        }
    }

    def cancelar = {
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.deleteFolderButton.isDisable()) {
                app.views.panelPrincipal.view.deleteFolderButton.disable = false
            } else if (app.views.panelPrincipal.view.modificarFolderButton.isDisable()) {

                app.views.panelPrincipal.view.modificarFolderButton.disable = false

            } else if (app.views.panelPrincipal.view.newFileInFolderButton.isDisable()) {
                app.views.panelPrincipal.view.newFileInFolderButton.disable = false
            }
            view.informationPane.visible = false
        }

        destroyMVCGroup('informationDialog')
    }
}
