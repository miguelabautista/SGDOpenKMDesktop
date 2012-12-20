package com.novatec.sdg

import org.springframework.scheduling.annotation.Scheduled

class TareaPruebaService {

    @Scheduled(fixedDelay=1000L)
    public void archiveOldSpittles(){
        println "Se esta ejecutando esto"
    }
}