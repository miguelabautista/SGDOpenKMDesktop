
package com.novatec.services.bookmarkservice;

import java.util.List;
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
@WebService(name = "OKMBookmark", targetNamespace = "http://ws.openkm.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OKMBookmark {


    /**
     * 
     * @param token
     * @param bmId
     * @return
     *     returns com.novatec.services.bookmarkservice.Bookmark
     * @throws AccessDeniedException_Exception
     * @throws DatabaseException_Exception
     * @throws RepositoryException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.GetResponse")
    public Bookmark get(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "bmId", targetNamespace = "")
        int bmId)
        throws AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param token
     * @return
     *     returns java.util.List<com.novatec.services.bookmarkservice.Bookmark>
     * @throws DatabaseException_Exception
     * @throws RepositoryException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.GetAllResponse")
    public List<Bookmark> getAll(
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws DatabaseException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param token
     * @param bmId
     * @throws AccessDeniedException_Exception
     * @throws DatabaseException_Exception
     * @throws RepositoryException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "remove", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.Remove")
    @ResponseWrapper(localName = "removeResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.RemoveResponse")
    public void remove(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "bmId", targetNamespace = "")
        int bmId)
        throws AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param nodePath
     * @param token
     * @param name
     * @return
     *     returns com.novatec.services.bookmarkservice.Bookmark
     * @throws PathNotFoundException_Exception
     * @throws AccessDeniedException_Exception
     * @throws DatabaseException_Exception
     * @throws RepositoryException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.AddResponse")
    public Bookmark add(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "nodePath", targetNamespace = "")
        String nodePath,
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws AccessDeniedException_Exception, DatabaseException_Exception, PathNotFoundException_Exception, RepositoryException_Exception
    ;

    /**
     * 
     * @param token
     * @param newName
     * @param bmId
     * @return
     *     returns com.novatec.services.bookmarkservice.Bookmark
     * @throws AccessDeniedException_Exception
     * @throws DatabaseException_Exception
     * @throws RepositoryException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rename", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.Rename")
    @ResponseWrapper(localName = "renameResponse", targetNamespace = "http://ws.openkm.com", className = "com.novatec.services.bookmarkservice.RenameResponse")
    public Bookmark rename(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "bmId", targetNamespace = "")
        int bmId,
        @WebParam(name = "newName", targetNamespace = "")
        String newName)
        throws AccessDeniedException_Exception, DatabaseException_Exception, RepositoryException_Exception
    ;

}
