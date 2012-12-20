package com.novatec.sdg

import com.novatec.services.propertyservice.OKMProperty
import com.novatec.services.propertyservice.OKMProperty_Service

class PropertyService {
    private OKMProperty service

    PropertyService() {
        service = new OKMProperty_Service().getOKMPropertyPort()
    }

    def addKeyword(def token, def path, def keyword) {
        service.addKeyword(token, path, keyword)
    }

    def deleteKeyword(def token, def path, def keyword) {
        service.removeKeyword(token, path, keyword)
    }
}