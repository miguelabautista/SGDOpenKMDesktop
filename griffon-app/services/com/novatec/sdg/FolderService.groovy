package com.novatec.sdg

import com.novatec.services.folderservice.OKMFolder
import com.novatec.services.folderservice.OKMFolder_Service
import com.novatec.services.folderservice.Folder

class FolderService {
    private OKMFolder service

    FolderService() {
        service = new OKMFolder_Service().getOKMFolderPort()
    }

    List<Folder> getFolderChilds(def token, def path) {
        List<Folder> items = service.getChilds(token, path)
    }

    Folder renameFolder(def token, def path, def newName) {
        service.rename(token, path, newName)
    }

    Folder createSimpleFolder(def token, def path){
        service.createSimple(token, path)
    }

    def deleteFolder(def token, def path){
        service.delete(token,path)
    }
}