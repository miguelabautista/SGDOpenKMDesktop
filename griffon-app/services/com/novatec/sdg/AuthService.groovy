package com.novatec.sdg

import com.novatec.services.authservice.OKMAuth_Service
import com.novatec.services.authservice.AccessDeniedException_Exception

class AuthService {
    def login(String user, String password) {
        try {
            def response = new OKMAuth_Service().getOKMAuthPort().login(user, password)
        } catch (AccessDeniedException_Exception e) {
            throw new AccessDeniedException_Exception("valores incorrectos",e.faultInfo)
        } catch (Exception e) {
            throw new Exception()
        }
    }

    def logout(def token) {
        new OKMAuth_Service().getOKMAuthPort().logout(token)
    }

    def getUsers(def token){
        new OKMAuth_Service().getOKMAuthPort().getUsers(token)
    }

    def getGrantedUsers(def token,def nodePath){
        new OKMAuth_Service().getOKMAuthPort().getGrantedUsers(token,nodePath)
    }
}