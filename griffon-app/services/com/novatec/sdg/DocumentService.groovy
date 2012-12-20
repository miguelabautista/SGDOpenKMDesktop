package com.novatec.sdg

import com.novatec.services.documentservice.OKMDocument
import com.novatec.services.documentservice.OKMDocument_Service
import com.novatec.services.documentservice.Document
import com.novatec.services.documentservice.Version

class DocumentService {
    private OKMDocument service

    DocumentService() {
        service = new OKMDocument_Service().getOKMDocumentPort()
    }

    List<Document> getDocuments(def token, def path) {
        service.getChilds(token, path)
    }

    def createDocument(def token, Document document, byte[] bytesFromFile) {
        service.create(token, document, bytesFromFile)
    }

    def deleteDocument(def token, def direction) {
        service.delete(token, direction)
    }

    byte[] getContentDocument(def token, def path, def checkout) {
        service.getContent(token, path, checkout)
    }

    def moveDocument(def token, def path, def newPath) {
        service.move(token, path, newPath)
    }

    def renameDocument(def token, def path, def newName) {
        service.rename(token, path, newName)
    }

    def checkoutDocument(def token, def path) {
        service.checkout(token, path)
    }

    def checkoutCancelDocument(def token, def path) {
        service.cancelCheckout(token, path)
    }

    def checkinDocument(def token, def path, def content, def comentario) {
        service.checkin(token, path, content, comentario)
    }

    List<Version> getVersionHistory(def token, def path) {
        service.getVersionHistory(token, path)
    }

    def restoreVersion(def token, def path, def version) {
        service.restoreVersion(token, path, version)
    }
}