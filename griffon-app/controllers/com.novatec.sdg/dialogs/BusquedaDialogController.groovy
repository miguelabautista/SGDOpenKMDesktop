package com.novatec.sdg.dialogs

import com.novatec.beans.Document
import com.novatec.beans.Imag
import com.novatec.services.searchservice.QueryResult
import com.novatec.utils.Utilidades
import griffon.transform.Threading
import javafx.beans.value.ChangeListener
import javafx.beans.value.ObservableValue
import javafx.collections.ListChangeListener
import javafx.event.ActionEvent
import org.apache.commons.io.FileUtils

class BusquedaDialogController {
    def model
    def view
    def searchService
    FileUtils utility = new FileUtils()

    void mvcGroupInit(Map args) {
        view.busquedaContent.textProperty().addListener(new ChangeListener() {

            @Override
            void changed(ObservableValue observableValue, Object t, Object t1) {
                if (t1.toString().size() != 0) {
                    model.limpiarBusquedaContenido = true
                    model.buscarContenido = false
                } else {
                    model.buscarContenido = true
                    model.limpiarBusquedaContenido = false
                    model.verContenidoVisible = false
                    model.resultVisible = false
                }
            }
        })
        view.buscarPorNombreField.textProperty().addListener(new ChangeListener() {

            @Override
            void changed(ObservableValue observableValue, Object t, Object t1) {
                if (t1.toString().size() != 0) {
                    model.buscarPorNombre = false
                } else {
                    model.buscarPorNombre = true
                    model.resultVisiblePorNombre = false
                    model.verPorNombreVisible = false
                }
            }
        })
        view.buscarPorKeywordsField.textProperty().addListener(new ChangeListener() {

            @Override
            void changed(ObservableValue observableValue, Object t, Object t1) {
                if (t1.toString().size() != 0) {
                    model.agregarKeyword = true
                } else {
                    model.agregarKeyword = false
                }
            }
        })
        javafx.collections.ObservableList lis = model.keywords
        lis.addListener(new ListChangeListener<>() {

            @Override
            void onChanged(ListChangeListener.Change change) {
                if (lis.size() != 0) {
                    model.buscarPorKeyword = false
                    model.deletePorKeyword = true
                } else {
                    model.deletePorKeyword = false
                    model.buscarPorKeyword = true
                    model.resultVisiblePorKeyword = false
                    model.verPorKeywordVisible = false
                }
            }
        })
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    def aceptarPorContenido = { evt = null ->
        model.buscarContenido = true
        model.sizePorContenido = 0
        model.resultadoContenido.clear()

        if (model.contentText.size() > 0) {
            model.progressContenido = true

            List<QueryResult> resultado = searchService.findByContent(app.models.panelPrincipal.token, model.contentText)

            resultado.each { QueryResult valor ->
                if (valor.getDocument().getPath().startsWith("${app.models.panelPrincipal.path}/")) {
                    ++model.sizePorContenido
                    println valor.document.path
                    model.resultadoContenido << valor
                }
            }
            if (model.sizePorContenido != 0) {
                model.verContenidoVisible = true
            } else {
                model.verContenidoVisible = false
            }
            execInsideUIAsync {
                model.progressContenido = false
                model.ocurrenciasLabel = model.sizePorContenido.toString()
                model.resultVisible = true
            }
        }
        model.buscarContenido = false
    }

    def aceptarPorNombre = { evt = null ->
        model.sizePorNombre = 0
        model.buscarPorNombre = true
        model.resultadoPorNombre.clear()
        if (model.contentTextPorNombre.size() > 0) {
            model.progressNombre = true

            List<QueryResult> resultado = searchService.findByName(app.models.panelPrincipal.token, model.contentTextPorNombre)

            resultado.each { QueryResult valor ->
                if (valor.getDocument().getPath().startsWith("${app.models.panelPrincipal.path}/")) {
                    ++model.sizePorNombre
                    model.resultadoPorNombre << valor
                }
            }
            if (model.sizePorNombre != 0) {
                model.verPorNombreVisible = true
            } else {
                model.verPorNombreVisible = false
            }
            execInsideUIAsync {
                model.progressNombre = false
                model.ocurrenciasLabelNombre = model.sizePorNombre.toString()
                model.resultVisiblePorNombre = true
            }

        }
        model.buscarPorNombre = false
    }

    def aceptarPorKeyword = { evt ->
        model.resultadoPorKeyword.clear()
        model.buscarPorKeyword = true
        model.progressKeyword = true
        model.sizePorKeyword = 0

        List<QueryResult> resultado = searchService.findByKeywords(app.models.panelPrincipal.token, model.keywords)

        resultado.each { QueryResult valor ->
            if (valor.getDocument().getPath().startsWith("${app.models.panelPrincipal.path}/")) {
                ++model.sizePorKeyword
                model.resultadoPorKeyword << valor
            }
        }
        if (model.sizePorKeyword != 0) {
            model.verPorKeywordVisible = true
        } else {
            model.verPorKeywordVisible = false
        }
        execInsideUIAsync {
            model.progressKeyword = false
            model.ocurrenciasLabelKeyword = model.sizePorKeyword.toString()
            model.resultVisiblePorKeyword = true
        }

        model.buscarPorKeyword = false
    }

    def cancelar = { evt = null ->
        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.searchingFilesButton.isDisable()) {
                app.views.panelPrincipal.view.searchingFilesButton.disable = false
            }
            view.busquedaPanel.visible = false
        }

        destroyMVCGroup('busquedaDialog')

        app.views.panelPrincipal.view.tabla.disable = false
        app.views.panelPrincipal.view.arbol.disable = false
    }
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def agregarKeyword = { evt = null ->
        model.keywords.add model.contentTextPorKeyword
        model.contentTextPorKeyword = ""
    }
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    def deleteKeyword = { evt = null ->
        model.keywords.remove view.buscarPorKeywordsLista.getSelectionModel().getSelectedItem()
    }


    def cleanPorContenidoArea = { evt = null ->
        model.contentText = ""
        model.verContenidoVisible = false
        model.resultVisible = false
    }

    def resultadoPorContenido = { ActionEvent evt = null ->
        List<String> result = new ArrayList();
        for (QueryResult re : model.resultadoContenido) {
            result.add(re.getDocument().getPath());
        }

        final List<String> listaResultante = new ArrayList<>();

        Scanner sca = null;

        for (String cadena : result) {
            String[] split;
            sca = new Scanner(cadena);
            sca.useDelimiter("/(okm:(\\w)+)+/(\\w)+/");
            while (sca.hasNext()) {

                split = sca.next().split("/");

                listaResultante.addAll(Arrays.asList(split));
            }
        }

        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.searchingFilesButton.isDisable()) {
                app.views.panelPrincipal.view.searchingFilesButton.disable = false
            }
            view.busquedaPanel.visible = false
        }

        destroyMVCGroup('busquedaDialog')

        app.views.panelPrincipal.view.tabla.disable = false
        app.views.panelPrincipal.view.arbol.disable = false

        app.views.panelPrincipal.view.arbol.getSelectionModel().clearSelection()

        app.models.panelPrincipal.tablaItems.clear()


        List<Document> documento = new ArrayList<>();

        Utilidades util = new Utilidades();

        app.models.panelPrincipal.subRoot.clear()

        int j = 0;
        for (QueryResult resul : model.resultadoContenido) {

            QueryResult archi = resul;

            String direccion = listaResultante.get(j);
            String nombreAr = listaResultante.get(++j);
            app.models.panelPrincipal.subRoot.put(direccion, nombreAr);

            String file = archi.getDocument().getPath();


            int indexOf = file.indexOf('.');

            com.novatec.services.searchservice.Document document = archi.getDocument();

            Imag imagen = util.getImagen(file.substring(indexOf + 1).toLowerCase());

            String fechaCreacion = document.getCreated().getDay() + "-" + document.getCreated().getMonth() + "-" + document.getCreated().getYear() + " " + document.getCreated().getHour() + ":" + document.getCreated().getMinute();

            String fechaModificacion = document.getLastModified().getDay() + "-" + document.getLastModified().getMonth() + "-" + document.getLastModified().getYear() + " " + document.getLastModified().getHour() + ":" + document.getLastModified().getMinute();

            documento.add(new Document(imagen: imagen, name: listaResultante.get(j), tamano: utility.byteCountToDisplaySize(document.getActualVersion().getSize()), fechaDeCreacion: fechaCreacion, fechaDeModificacion: fechaModificacion, checkout: document.checkedOut, version: document.actualVersion.name));

            ++j;
        }

        app.models.panelPrincipal.tablaItems.addAll(documento)
    }

    def resultadoPorNombre = { evt = null ->

        List<String> result = new ArrayList();
        for (QueryResult re : model.resultadoPorNombre) {
            result.add(re.getDocument().getPath());
        }

        final List<String> listaResultante = new ArrayList<>();

        Scanner sca = null;

        for (String cadena : result) {
            String[] split;
            sca = new Scanner(cadena);
            sca.useDelimiter("/(okm:(\\w)+)+/(\\w)+/");
            while (sca.hasNext()) {

                split = sca.next().split("/");

                listaResultante.addAll(Arrays.asList(split));
            }
        }

        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.searchingFilesButton.isDisable()) {
                app.views.panelPrincipal.view.searchingFilesButton.disable = false
            }
            view.busquedaPanel.visible = false
        }

        destroyMVCGroup('busquedaDialog')

        app.views.panelPrincipal.view.tabla.disable = false
        app.views.panelPrincipal.view.arbol.disable = false

        app.views.panelPrincipal.view.arbol.getSelectionModel().clearSelection()

        app.models.panelPrincipal.tablaItems.clear()


        List<Document> documento = new ArrayList<>();

        Utilidades util = new Utilidades();

        app.models.panelPrincipal.subRoot.clear()

        int j = 0;
        for (QueryResult resul : model.resultadoPorNombre) {

            QueryResult archi = resul;

            String direccion = listaResultante.get(j);
            String nombreAr = listaResultante.get(++j);

            app.models.panelPrincipal.subRoot.put(direccion, nombreAr);

            String file = archi.getDocument().getPath();

            int indexOf = file.indexOf('.');

            com.novatec.services.searchservice.Document document = archi.getDocument();

            Imag imagen = util.getImagen(file.substring(indexOf + 1).toLowerCase());

            String fechaCreacion = document.getCreated().getDay() + "-" + document.getCreated().getMonth() + "-" + document.getCreated().getYear() + " " + document.getCreated().getHour() + ":" + document.getCreated().getMinute();

            String fechaModificacion = document.getLastModified().getDay() + "-" + document.getLastModified().getMonth() + "-" + document.getLastModified().getYear() + " " + document.getLastModified().getHour() + ":" + document.getLastModified().getMinute();

            documento.add(new Document(imagen: imagen, name: listaResultante.get(j), tamano: utility.byteCountToDisplaySize(document.getActualVersion().getSize()), fechaDeCreacion: fechaCreacion, fechaDeModificacion: fechaModificacion, checkout: document.checkedOut, version: document.actualVersion.name));

            ++j;
        }
        app.models.panelPrincipal.tablaItems.addAll(documento)
    }

    def resultadoPorKeyword = { evt = null ->
        List<String> result = new ArrayList();
        for (QueryResult re : model.resultadoPorKeyword) {
            result.add(re.getDocument().getPath());
        }

        final List<String> listaResultante = new ArrayList<>();

        Scanner sca = null;

        for (String cadena : result) {
            String[] split;
            sca = new Scanner(cadena);
            sca.useDelimiter("/(okm:(\\w)+)+/(\\w)+/");
            while (sca.hasNext()) {

                split = sca.next().split("/");

                listaResultante.addAll(Arrays.asList(split));
            }
        }

        execInsideUIAsync {
            view.tran2.play()
        }
        execOutsideUI {
            Thread.sleep(900)
            if (app.views.panelPrincipal.view.searchingFilesButton.isDisable()) {
                app.views.panelPrincipal.view.searchingFilesButton.disable = false
            }
            view.busquedaPanel.visible = false
        }

        destroyMVCGroup('busquedaDialog')

        app.views.panelPrincipal.view.tabla.disable = false
        app.views.panelPrincipal.view.arbol.disable = false

        app.views.panelPrincipal.view.arbol.getSelectionModel().clearSelection()

        app.models.panelPrincipal.tablaItems.clear()


        List<Document> documento = new ArrayList<>();

        Utilidades util = new Utilidades();

        app.models.panelPrincipal.subRoot.clear()

        int j = 0;
        for (QueryResult resul : model.resultadoPorKeyword) {

            QueryResult archi = resul;

            String direccion = listaResultante.get(j);
            String nombreAr = listaResultante.get(++j);

            app.models.panelPrincipal.subRoot.put(direccion, nombreAr);

            String file = archi.getDocument().getPath();

            int indexOf = file.indexOf('.');

            com.novatec.services.searchservice.Document document = archi.getDocument();

            Imag imagen = util.getImagen(file.substring(indexOf + 1).toLowerCase());

            String fechaCreacion = document.getCreated().getDay() + "-" + document.getCreated().getMonth() + "-" + document.getCreated().getYear() + " " + document.getCreated().getHour() + ":" + document.getCreated().getMinute();

            String fechaModificacion = document.getLastModified().getDay() + "-" + document.getLastModified().getMonth() + "-" + document.getLastModified().getYear() + " " + document.getLastModified().getHour() + ":" + document.getLastModified().getMinute();

            documento.add(new Document(imagen: imagen, name: listaResultante.get(j), tamano: utility.byteCountToDisplaySize(document.getActualVersion().getSize()), fechaDeCreacion: fechaCreacion, fechaDeModificacion: fechaModificacion, checkout: document.checkedOut, version: document.actualVersion.name));

            ++j;
        }
        app.models.panelPrincipal.tablaItems.addAll(documento)
    }
}
