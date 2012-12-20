package com.novatec.sdg

import com.novatec.services.repositoryservice.OKMRepository
import com.novatec.services.repositoryservice.OKMRepository_Service
import com.novatec.services.repositoryservice.Folder

class RepositoryService {
    private OKMRepository service = new OKMRepository_Service().getOKMRepositoryPort()

    Folder getPersonalFolder(def token){
        service.getPersonalFolder(token)
    }
}