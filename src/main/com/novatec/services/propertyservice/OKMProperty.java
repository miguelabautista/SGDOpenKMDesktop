
package com.novatec.services.propertyservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OKMProperty", targetNamespace = "http://ws.openkm.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OKMProperty {


    /**
     * 
     * @param nodePath
     * @param token
     * @param catId
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws AccessDeniedException_Exception
     * @throws VersionException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addCategory", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.AddCategory")
    @ResponseWrapper(localName = "addCategoryResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.AddCategoryResponse")
    public void addCategory(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "catId", targetNamespace = "")
        String catId)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws VersionException_Exception
     * @throws AccessDeniedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "unsetEncryption", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.UnsetEncryption")
    @ResponseWrapper(localName = "unsetEncryptionResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.UnsetEncryptionResponse")
    public void unsetEncryption(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @param catId
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws AccessDeniedException_Exception
     * @throws VersionException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeCategory", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.RemoveCategory")
    @ResponseWrapper(localName = "removeCategoryResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.RemoveCategoryResponse")
    public void removeCategory(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "catId", targetNamespace = "")
        String catId)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @param keyword
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws AccessDeniedException_Exception
     * @throws VersionException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeKeyword", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.RemoveKeyword")
    @ResponseWrapper(localName = "removeKeywordResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.RemoveKeywordResponse")
    public void removeKeyword(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "keyword", targetNamespace = "")
        String keyword)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

    /**
     * 
     * @param cipherName
     * @param nodePath
     * @param token
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws AccessDeniedException_Exception
     * @throws VersionException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "setEncryption", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.SetEncryption")
    @ResponseWrapper(localName = "setEncryptionResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.SetEncryptionResponse")
    public void setEncryption(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "cipherName", targetNamespace = "")
        String cipherName)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @param keyword
     * @return
     *     returns java.lang.String
     * @throws DatabaseException_Exception
     * @throws PathNotFoundException_Exception
     * @throws RepositoryException_Exception
     * @throws LockException_Exception
     * @throws AccessDeniedException_Exception
     * @throws VersionException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addKeyword", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.AddKeyword")
    @ResponseWrapper(localName = "addKeywordResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.propertyservice.AddKeywordResponse")
    public String addKeyword(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "keyword", targetNamespace = "")
        String keyword)
        throws AccessDeniedException_Exception, DatabaseException_Exception, LockException_Exception, PathNotFoundException_Exception, RepositoryException_Exception, VersionException_Exception
    ;

}
