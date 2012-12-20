package com.novatec.sdg.dialogs

import griffon.transform.Threading
import javafx.stage.Modality
import javafx.stage.Stage
import javafx.stage.StageStyle

class ExitDialogController {
    def model
    def view
    def authService

    protected Stage dialog

    @Threading(Threading.Policy.INSIDE_UITHREAD_SYNC)
    def show = { Stage owner = null ->
        if (!dialog) {
            dialog = new Stage()
            if (null != owner) dialog.initOwner(owner)
            if (model.modal) dialog.initModality(Modality.APPLICATION_MODAL)
            dialog.sizeToScene()
            dialog.title = model.title
            dialog.scene = view.exitScene
            dialog.initStyle(StageStyle.UNDECORATED)
        }
        app.windowManager.show(dialog)
    }

    @Threading(Threading.Policy.INSIDE_UITHREAD_SYNC)
    def hide = { evt = null ->
        app.windowManager.hide(dialog)
        dialog = null
    }

    def cerrarSesion = { evt =null ->
        try {
            authService.logout(app.models.panelPrincipal.token)
        } catch (Exception e) {}
        execInsideUIAsync {
            app.windowManager.hide(dialog)
            app.views.panelPrincipal.view.stagePrincipal.hide()

            destroyMVCGroup('panelPrincipal')

            app.windowManager.show(app.views.SGDOpenKMApp2.view.stageWellcome)

            app.groups.each { println it.value}
        }
    }

    def salir = { evt = null ->
        try {
            authService.logout(app.models.panelPrincipal.token)
        } catch (Exception e) {}
        System.exit(0)
    }
}
