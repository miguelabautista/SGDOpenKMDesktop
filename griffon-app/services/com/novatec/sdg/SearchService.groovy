package com.novatec.sdg

import com.novatec.services.searchservice.OKMSearch
import com.novatec.services.searchservice.OKMSearch_Service
import com.novatec.services.searchservice.QueryResult

class SearchService {
    private OKMSearch service

    SearchService(){
        service = new OKMSearch_Service().getOKMSearchPort()
    }

    List<QueryResult> findByName(def token,def name){
        service.findByName(token,name)
    }

    List<QueryResult> findByContent(def token, def content){
        service.findByContent(token, content)
    }

    List<QueryResult> findByKeywords(def token, def keywords){
        service.findByKeywords(token,keywords)
    }
}