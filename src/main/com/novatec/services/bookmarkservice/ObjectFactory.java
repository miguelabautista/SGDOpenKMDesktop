
package com.novatec.services.bookmarkservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.bookmarkservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private final static QName _GetAll_QNAME = new QName("http://ws.openkm.com", "getAll");
    private final static QName _RenameResponse_QNAME = new QName("http://ws.openkm.com", "renameResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _Add_QNAME = new QName("http://ws.openkm.com", "add");
    private final static QName _GetResponse_QNAME = new QName("http://ws.openkm.com", "getResponse");
    private final static QName _Get_QNAME = new QName("http://ws.openkm.com", "get");
    private final static QName _Remove_QNAME = new QName("http://ws.openkm.com", "remove");
    private final static QName _RemoveResponse_QNAME = new QName("http://ws.openkm.com", "removeResponse");
    private final static QName _Rename_QNAME = new QName("http://ws.openkm.com", "rename");
    private final static QName _GetAllResponse_QNAME = new QName("http://ws.openkm.com", "getAllResponse");
    private final static QName _AddResponse_QNAME = new QName("http://ws.openkm.com", "addResponse");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.bookmarkservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link Rename }
     * 
     */
    public Rename createRename() {
        return new Rename();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link RenameResponse }
     * 
     */
    public RenameResponse createRenameResponse() {
        return new RenameResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link Bookmark }
     * 
     */
    public Bookmark createBookmark() {
        return new Bookmark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "AccessDeniedException")
    public JAXBElement<AccessDeniedException> createAccessDeniedException(AccessDeniedException value) {
        return new JAXBElement<AccessDeniedException>(_AccessDeniedException_QNAME, AccessDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "renameResponse")
    public JAXBElement<RenameResponse> createRenameResponse(RenameResponse value) {
        return new JAXBElement<RenameResponse>(_RenameResponse_QNAME, RenameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "PathNotFoundException")
    public JAXBElement<PathNotFoundException> createPathNotFoundException(PathNotFoundException value) {
        return new JAXBElement<PathNotFoundException>(_PathNotFoundException_QNAME, PathNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "DatabaseException")
    public JAXBElement<DatabaseException> createDatabaseException(DatabaseException value) {
        return new JAXBElement<DatabaseException>(_DatabaseException_QNAME, DatabaseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "removeResponse")
    public JAXBElement<RemoveResponse> createRemoveResponse(RemoveResponse value) {
        return new JAXBElement<RemoveResponse>(_RemoveResponse_QNAME, RemoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rename }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "rename")
    public JAXBElement<Rename> createRename(Rename value) {
        return new JAXBElement<Rename>(_Rename_QNAME, Rename.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "RepositoryException")
    public JAXBElement<RepositoryException> createRepositoryException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryException_QNAME, RepositoryException.class, null, value);
    }

}
