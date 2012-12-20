application {
    title = 'SGDOpenKMDesktop'
    startupGroups = ['SGDOpenKMDesktop']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = false

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "SGDOpenKMDesktop"
    'treeDialog' {
        model      = 'com.novatec.sdg.dialogs.TreeDialogModel'
        view       = 'com.novatec.sdg.dialogs.TreeDialogView'
        controller = 'com.novatec.sdg.dialogs.TreeDialogController'
    }

    // MVC Group for "tareaDialog"
    'tareaDialog' {
        model      = 'com.novatec.sdg.dialogs.TareaDialogModel'
        view       = 'com.novatec.sdg.dialogs.TareaDialogView'
        controller = 'com.novatec.sdg.dialogs.TareaDialogController'
    }

    // MVC Group for "tableDialog"
    'tableDialog' {
        model      = 'com.novatec.sdg.dialogs.TableDialogModel'
        view       = 'com.novatec.sdg.dialogs.TableDialogView'
        controller = 'com.novatec.sdg.dialogs.TableDialogController'
    }

    // MVC Group for "renameFile"
    'renameFile' {
        model      = 'com.novatec.sdg.dialogs.RenameFileModel'
        view       = 'com.novatec.sdg.dialogs.RenameFileView'
        controller = 'com.novatec.sdg.dialogs.RenameFileController'
    }

    // MVC Group for "keywordsPane"
    'keywordsPane' {
        model      = 'com.novatec.sdg.dialogs.KeywordsPaneModel'
        view       = 'com.novatec.sdg.dialogs.KeywordsPaneView'
        controller = 'com.novatec.sdg.dialogs.KeywordsPaneController'
    }

    // MVC Group for "informationDialog"
    'informationDialog' {
        model      = 'com.novatec.sdg.dialogs.InformationDialogModel'
        view       = 'com.novatec.sdg.dialogs.InformationDialogView'
        controller = 'com.novatec.sdg.dialogs.InformationDialogController'
    }

    // MVC Group for "downloadPane"
    'downloadPane' {
        model      = 'com.novatec.sdg.dialogs.DownloadPaneModel'
        view       = 'com.novatec.sdg.dialogs.DownloadPaneView'
        controller = 'com.novatec.sdg.dialogs.DownloadPaneController'
    }

    // MVC Group for "checkinDialog"
    'checkinDialog' {
        model      = 'com.novatec.sdg.dialogs.CheckinDialogModel'
        view       = 'com.novatec.sdg.dialogs.CheckinDialogView'
        controller = 'com.novatec.sdg.dialogs.CheckinDialogController'
    }

    // MVC Group for "busquedaDialog"
    'busquedaDialog' {
        model      = 'com.novatec.sdg.dialogs.BusquedaDialogModel'
        view       = 'com.novatec.sdg.dialogs.BusquedaDialogView'
        controller = 'com.novatec.sdg.dialogs.BusquedaDialogController'
    }

    // MVC Group for "busquedaDialog"
    'busquedaDialog' {
        model      = 'com.novatec.sdg.dialogs.BusquedaDialogModel'
        view       = 'com.novatec.sdg.dialogs.BusquedaDialogView'
        controller = 'com.novatec.sdg.dialogs.BusquedaDialogController'
    }

    // MVC Group for "atributesPane"
    'atributesPane' {
        model      = 'com.novatec.sdg.dialogs.AtributesPaneModel'
        view       = 'com.novatec.sdg.dialogs.AtributesPaneView'
        controller = 'com.novatec.sdg.dialogs.AtributesPaneController'
    }

    // MVC Group for "exitDialog"
    'exitDialog' {
        model      = 'com.novatec.sdg.dialogs.ExitDialogModel'
        view       = 'com.novatec.sdg.dialogs.ExitDialogView'
        controller = 'com.novatec.sdg.dialogs.ExitDialogController'
    }

    // MVC Group for "panelPrincipal"
    'panelPrincipal' {
        model      = 'com.novatec.sdg.PanelPrincipalModel'
        view       = 'com.novatec.sdg.PanelPrincipalView'
        controller = 'com.novatec.sdg.PanelPrincipalController'
    }

    'SGDOpenKMDesktop' {
        model      = 'com.novatec.sdg.SGDOpenKMDesktopModel'
        view       = 'com.novatec.sdg.SGDOpenKMDesktopView'
        controller = 'com.novatec.sdg.SGDOpenKMDesktopController'
    }

}
