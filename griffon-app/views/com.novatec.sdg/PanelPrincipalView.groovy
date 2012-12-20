package com.novatec.sdg

import com.novatec.beans.Document
import com.novatec.beans.Imag
import com.novatec.services.folderservice.Folder
import javafx.scene.control.TableCell
import javafx.scene.control.TableColumn
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.util.Callback

stagePrincipal = application(title: 'Servicio Gestion de Documentos', sizeToScene: true, centerOnScreen: true, fullScreen: true, resizable: true) {
    scene(id: 'secondaryScene', fill: white, width: 900.0, height: 650.0) {
        secondaryScene.stylesheets.add(getClass().getResource("/style.css").toString())
        anchorPane(id: "anchorPrincipal", prefHeight: 650.0, prefWidth: 900.0) {
            anchorPane(id: 'topPanel', prefHeight: 105.0, prefWidth: 800.0, leftAnchor: 0.0, rightAnchor: 0.0) {
                text(fill: "#0066ff", layoutX: 14.0, layoutY: 46.0, stroke: "RED", strokeLineCap: "BUTT", strokeType: "OUTSIDE", strokeWidth: 0.0, text: "Servicio de gestion documental", font: "30") {
                    effect bloom(threshold: 0.0)
                    effect dropShadow(spread: 0.5793650793650794)
                    effect lighting(diffuseConstant: 0.5873015873015873, specularConstant: 0.22063492063492063, specularExponent: 29.206349206349206, surfaceScale: 0.9444444444444444)
                }
                hbox(alignment: "CENTER", layoutY: 74.0, spacing: 5.0, prefWidth: 843.0, leftAnchor: 0.0, rightAnchor: 57.0) {
                    toolBar(prefWidth: 801.0, hgrow: "ALWAYS") {
                        button(minWidth: 11.0, mnemonicParsing: false, prefWidth: 27.0, visible: false)
                        button(id: "addNewFolderButton", contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.addIcon), mnemonicParsing: false, onAction: controller.agragarTreeItem) {
                            tooltip(text: "Agregar un nuevo directorio")
                        }
                        button(id: "deleteFolderButton", contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.deleteIcon), mnemonicParsing: false, onAction: controller.eliminarTreeItemIcon) {
                            tooltip(text: "Eliminar directorio")
                        }
                        button(id: "modificarFolderButton", contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.renameIcon), mnemonicParsing: false, onAction: controller.modificarTreeItemIcon) {
                            tooltip(text: "Modificar directorio")
                        }
                        button(id: "newFileInFolderButton", mnemonicParsing: "false", graphic: new ImageView(model.newFileIcon), onAction: controller.agregarTreeItemIcon) {
                            tooltip(text: "Nuevo Archivo")
                        }
                        separator(orientation: "VERTICAL", prefHeight: 21.0, prefWidth: 63.0)
                        button(mnemonicParsing: false, visible: false)
                        button(id: "searchingFilesButton", mnemonicParsing: false, text: "Busqueda", graphic: new ImageView(model.searchIcon), onAction: controller.searchItems)
                        button(mnemonicParsing: false, visible: false)
                        separator(orientation: "VERTICAL", prefHeight: 21.0, prefWidth: 38.0)
                        //  button(mnemonicParsing: false, visible: false)
                        button(id: "downloadFileButton", mnemonicParsing: false, text: "Descargar", graphic: new ImageView(model.downloadIcon), onAction: controller.downloadItemIcon)
                        button(id: "addTagsFileButton", mnemonicParsing: false, text: "Palabras Claves", graphic: new ImageView(model.downloadIcon), onAction: controller.addTasgIcon)
                        button(id: "eraseFileButton", mnemonicParsing: false, text: "Eliminar", graphic: new ImageView(model.deleteIcon), onAction: controller.eraseTablaItemIcon)
                        button(id: "renameFileButton", mnemonicParsing: false, text: "Renombrar", graphic: new ImageView(model.renameIcon), onAction: controller.renameFileIcon)
                    }
                }
                hbox(alignment: "CENTER", layoutY: 74.0, prefWidth: 57.0, spacing: 5.0, rightAnchor: 0.0) {
                    toolBar(prefWidth: 79.0, hgrow: "ALWAYS") {
                        button(contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.settingsIcon)) {
                            tooltip(text: "Configuracion")
                        }
                    }
                }
                vbox(alignment: "CENTER", spacing: 2.0, bottomAnchor: 37.0, rightAnchor: 11.0, topAnchor: 3.0) {
                    hyperlink(id: "salirButton", contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.exitIcon), onAction: controller.salir) {
                        tooltip(text: "salir")
                    }
                    hyperlink(id: "maximizarButton", contentDisplay: "GRAPHIC_ONLY", onAction: controller.maximizar) {
                        tooltip(text: 'maximizar')
                    }
                    hyperlink(id: "minimizeButton", contentDisplay: "GRAPHIC_ONLY", graphic: new ImageView(model.minimizeIcon), onAction: controller.minimizar) {
                        tooltip(text: 'minimizar')
                    }
                }
                imageView(fitHeight: 62.0, fitWidth: 106.0, layoutX: 586.0, layoutY: 7.0, pickOnBounds: true) {
                    image(url: getClass().getResource("/logo.png").toString(), preserveRatio: true, smooth: true)
                }
            }
            splitPane(dividerPositions: 0.2725250278086763, focusTraversable: true, pickOnBounds: true, prefHeight: 496.0, prefWidth: 400.0, bottomAnchor: 0.0, leftAnchor: -1.0, rightAnchor: 0.0, topAnchor: 104.0) {
                accordion(id:'accordion',maxWidth: 290.0, minWidth: 242.0) {
                    titledPane(animated = true, text: "Taxonomia",maxWidth: 290.0, minWidth: 242.0) {
                        anchorPane(maxWidth: 240.0, minHeight: 0.0, minWidth: 242.0, prefHeight: 160.0, prefWidth: 242.0) {
                        }
                    }
                    titledPane(id:'documentsTitled',animated: true, text: "Documentos",expanded: true,maxWidth: 290.0, minWidth: 242.0) {
                        anchorPane(maxWidth: 240.0, minHeight: 0.0, minWidth: 242.0, prefHeight: 160.0, prefWidth: 242.0) {
                            treeView(id: 'arbol',  prefHeight: 766.0, prefWidth: 242.0, bottomAnchor: 0.0, leftAnchor: 0.0, topAnchor: 0.0, onMouseClicked: controller.treeMouse, onEditCancel: controller.cancelarTree, onEditCommit: controller.commitTree) {
                                treeItem(value: model.path.substring(14), graphic: new ImageView(model.rootIcon), expanded: true) {
                                    model.treeItems.each { Folder folder ->
                                        treeItem(value: folder.path.substring(model.path.size() + 1), graphic: new ImageView(model.rootIcon))
                                    }
                                }
                            }
                        }
                    }
                    accordion.setExpandedPane(documentsTitled)
                }
                anchorPane(id: 'anchorTabla', minHeight: 340, minWidth: 0.0, prefHeight: 494.0, prefWidth: 639.0) {
                    tableView(id: "tabla", minHeight: 340, prefHeight: 494.0, prefWidth: 562.0, bottomAnchor: 0.0, leftAnchor: 0.0, rightAnchor: 0.0, topAnchor: 0.0, tableMenuButtonVisible: true, onMouseClicked: controller.tableMouse) {
                        tabla.setItems(model.tablaItems)
                        tableColumn(id: "imagen", maxWidth: 30.0, prefWidth: 30.0, resizable: false, property: 'imagen') {
                            imagen.setCellFactory(new Callback<TableColumn<Document, Imag>, TableCell<Document, Imag>>() {
                                @Override
                                public TableCell<Document, Imag> call(TableColumn<Document, Imag> param) {

                                    TableCell<Document, Imag> cell = new TableCell<Document, Imag>() {
                                        @Override
                                        public void updateItem(Imag item, boolean empty) {

                                            if (item != null) {

                                                ImageView imageview = new ImageView();

                                                imageview.setFitHeight(17);

                                                imageview.setFitWidth(17);

                                                try {
                                                    imageview.setImage(new Image(PanelPrincipalController.class.getResource("/icons/" + item.getFilename() + ".png").toString()));
                                                } catch (NullPointerException e) {
                                                }
                                                setGraphic(imageview);
                                            }
                                        }
                                    };
                                    return cell;
                                }
                            });
                        }
                        tableColumn(maxWidth: 300.0, minWidth: 180.0, prefWidth: 180.0, text: "Nombre", property: 'name')
                        tableColumn(maxWidth: 80.0, minWidth: 60.0, prefWidth: 60.0, resizable: false, text: "Tamaño", property: 'tamano')
                        tableColumn(maxWidth: 180.0, minWidth: 110.0, prefWidth: 110.0, text: "Fecha creacion", property: 'fechaDeCreacion')
                        tableColumn(maxWidth: 180.0, minWidth: 110.0, prefWidth: 110.0, text: "Fecha modificacion", property: 'fechaDeModificacion')
                        tableColumn(maxWidth: 50.0, minWidth: 50.0, prefWidth: 50.0, text: "Version", property: 'version')
                    }
                    progressIndicator(id: "progress", prefHeight: 81.0, prefWidth: 77.0, visible: bind(model.progressVisibilityProperty), bottomAnchor: 225.0, leftAnchor: 288.0, rightAnchor: 286.0, topAnchor: 238.0) {
                        effect colorAdjust(hue: -1.0)
                        effect bloom()
                        effect dropShadow()
                    }
                }
            }
        }
        group(id: 'grupo') {

        }
    }
}
stagePrincipal.getIcons().add(new Image(getClass().getResourceAsStream("/novateclogo.gif")))
stagePrincipal.style = "UNDECORATED"


