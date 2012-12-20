/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.novatec.utils

import com.novatec.beans.Imag
import com.novatec.beans.Root

/**
 *
 * @author MIGUEL
 */

class Utilidades {
    /*
    private Utilidades(){
        
    }
    
    private static class InstanceHolder{
        private static final Utilidades util = new Utilidades()
    }
    public static Utilidades getInstace(){
        return InstanceHolder.util
    }*/

    byte[] getBytesFromFile(File file) {
        byte[] bytes = file.getBytes()
        return bytes
    }

    def createNewFile(String fileName, String directorio, byte[] content) {
        File file = new File("${directorio}/${fileName}")

        file.append(content)
    }

    String getRoot() {
        File file = new File("./root.data")
        if (!file.exists()) {
            setRoot("c:/")
        }
        String root
        Root ruta
        file.withObjectInputStream {
            ruta = (Root) it.readObject()
        }
        root = ruta.ruta
    }

    def setRoot(String ruta) {
        File file = new File("./root.data")
        def ru = new Root(ruta: "${ruta}")
        file.withObjectOutputStream {
            it.writeObject ru
        }
    }

    Imag getImagen(String tipo) {
        Imag imagen = null
        if (tipo.equals("pdf")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("doc")) {
            imagen = new Imag("word")
            return imagen
        } else if (tipo.equals("jpg")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("wma")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("zip")) {
            imagen = new Imag("zip")
            return imagen
        } else if (tipo.equals("gif")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("mp3")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("png")) {
            imagen = new Imag(tipo)
            return imagen
        } else if (tipo.equals("docx")) {
            imagen = new Imag("word")
            return imagen
        } else if (tipo.equals("xmls")) {
            imagen = new Imag("excel")
            return imagen
        } else if (tipo.equals("ppt")) {
            imagen = new Imag("powerpoint")
            return imagen
        } else if (tipo.equals("pptx")) {
            imagen = new Imag("powerpoint")
            return imagen
        } else {
            imagen = new Imag("question")
            return imagen
        }
        imagen = new Imag("question")
        return imagen
    }

}

