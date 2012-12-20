
package com.novatec.services.folderservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.folderservice package. 
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
    private final static QName _GetChildrenResponse_QNAME = new QName("http://ws.openkm.com", "getChildrenResponse");
    private final static QName _GetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "getPropertiesResponse");
    private final static QName _Move_QNAME = new QName("http://ws.openkm.com", "move");
    private final static QName _CreateResponse_QNAME = new QName("http://ws.openkm.com", "createResponse");
    private final static QName _Delete_QNAME = new QName("http://ws.openkm.com", "delete");
    private final static QName _GetPath_QNAME = new QName("http://ws.openkm.com", "getPath");
    private final static QName _RenameResponse_QNAME = new QName("http://ws.openkm.com", "renameResponse");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _GetChilds_QNAME = new QName("http://ws.openkm.com", "getChilds");
    private final static QName _GetChildren_QNAME = new QName("http://ws.openkm.com", "getChildren");
    private final static QName _GetPathResponse_QNAME = new QName("http://ws.openkm.com", "getPathResponse");
    private final static QName _Rename_QNAME = new QName("http://ws.openkm.com", "rename");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private final static QName _ItemExistsException_QNAME = new QName("http://ws.openkm.com", "ItemExistsException");
    private final static QName _IsValid_QNAME = new QName("http://ws.openkm.com", "isValid");
    private final static QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private final static QName _MoveResponse_QNAME = new QName("http://ws.openkm.com", "moveResponse");
    private final static QName _ExtensionException_QNAME = new QName("http://ws.openkm.com", "ExtensionException");
    private final static QName _DeleteResponse_QNAME = new QName("http://ws.openkm.com", "deleteResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _Create_QNAME = new QName("http://ws.openkm.com", "create");
    private final static QName _CreateSimple_QNAME = new QName("http://ws.openkm.com", "createSimple");
    private final static QName _CreateSimpleResponse_QNAME = new QName("http://ws.openkm.com", "createSimpleResponse");
    private final static QName _AutomationException_QNAME = new QName("http://ws.openkm.com", "AutomationException");
    private final static QName _IsValidResponse_QNAME = new QName("http://ws.openkm.com", "isValidResponse");
    private final static QName _GetProperties_QNAME = new QName("http://ws.openkm.com", "getProperties");
    private final static QName _GetChildsResponse_QNAME = new QName("http://ws.openkm.com", "getChildsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.folderservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemExistsException }
     * 
     */
    public ItemExistsException createItemExistsException() {
        return new ItemExistsException();
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link Rename }
     * 
     */
    public Rename createRename() {
        return new Rename();
    }

    /**
     * Create an instance of {@link GetChildren }
     * 
     */
    public GetChildren createGetChildren() {
        return new GetChildren();
    }

    /**
     * Create an instance of {@link GetPathResponse }
     * 
     */
    public GetPathResponse createGetPathResponse() {
        return new GetPathResponse();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link GetChilds }
     * 
     */
    public GetChilds createGetChilds() {
        return new GetChilds();
    }

    /**
     * Create an instance of {@link GetPath }
     * 
     */
    public GetPath createGetPath() {
        return new GetPath();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
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
     * Create an instance of {@link Move }
     * 
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link GetChildrenResponse }
     * 
     */
    public GetChildrenResponse createGetChildrenResponse() {
        return new GetChildrenResponse();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetChildsResponse }
     * 
     */
    public GetChildsResponse createGetChildsResponse() {
        return new GetChildsResponse();
    }

    /**
     * Create an instance of {@link IsValidResponse }
     * 
     */
    public IsValidResponse createIsValidResponse() {
        return new IsValidResponse();
    }

    /**
     * Create an instance of {@link GetProperties }
     * 
     */
    public GetProperties createGetProperties() {
        return new GetProperties();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateSimpleResponse }
     * 
     */
    public CreateSimpleResponse createCreateSimpleResponse() {
        return new CreateSimpleResponse();
    }

    /**
     * Create an instance of {@link AutomationException }
     * 
     */
    public AutomationException createAutomationException() {
        return new AutomationException();
    }

    /**
     * Create an instance of {@link CreateSimple }
     * 
     */
    public CreateSimple createCreateSimple() {
        return new CreateSimple();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link ExtensionException }
     * 
     */
    public ExtensionException createExtensionException() {
        return new ExtensionException();
    }

    /**
     * Create an instance of {@link LockException }
     * 
     */
    public LockException createLockException() {
        return new LockException();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link IsValid }
     * 
     */
    public IsValid createIsValid() {
        return new IsValid();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildrenResponse")
    public JAXBElement<GetChildrenResponse> createGetChildrenResponse(GetChildrenResponse value) {
        return new JAXBElement<GetChildrenResponse>(_GetChildrenResponse_QNAME, GetChildrenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPropertiesResponse")
    public JAXBElement<GetPropertiesResponse> createGetPropertiesResponse(GetPropertiesResponse value) {
        return new JAXBElement<GetPropertiesResponse>(_GetPropertiesResponse_QNAME, GetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Move }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "move")
    public JAXBElement<Move> createMove(Move value) {
        return new JAXBElement<Move>(_Move_QNAME, Move.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPath")
    public JAXBElement<GetPath> createGetPath(GetPath value) {
        return new JAXBElement<GetPath>(_GetPath_QNAME, GetPath.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "DatabaseException")
    public JAXBElement<DatabaseException> createDatabaseException(DatabaseException value) {
        return new JAXBElement<DatabaseException>(_DatabaseException_QNAME, DatabaseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChilds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChilds")
    public JAXBElement<GetChilds> createGetChilds(GetChilds value) {
        return new JAXBElement<GetChilds>(_GetChilds_QNAME, GetChilds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildren")
    public JAXBElement<GetChildren> createGetChildren(GetChildren value) {
        return new JAXBElement<GetChildren>(_GetChildren_QNAME, GetChildren.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPathResponse")
    public JAXBElement<GetPathResponse> createGetPathResponse(GetPathResponse value) {
        return new JAXBElement<GetPathResponse>(_GetPathResponse_QNAME, GetPathResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "RepositoryException")
    public JAXBElement<RepositoryException> createRepositoryException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemExistsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ItemExistsException")
    public JAXBElement<ItemExistsException> createItemExistsException(ItemExistsException value) {
        return new JAXBElement<ItemExistsException>(_ItemExistsException_QNAME, ItemExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "isValid")
    public JAXBElement<IsValid> createIsValid(IsValid value) {
        return new JAXBElement<IsValid>(_IsValid_QNAME, IsValid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "LockException")
    public JAXBElement<LockException> createLockException(LockException value) {
        return new JAXBElement<LockException>(_LockException_QNAME, LockException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "moveResponse")
    public JAXBElement<MoveResponse> createMoveResponse(MoveResponse value) {
        return new JAXBElement<MoveResponse>(_MoveResponse_QNAME, MoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ExtensionException")
    public JAXBElement<ExtensionException> createExtensionException(ExtensionException value) {
        return new JAXBElement<ExtensionException>(_ExtensionException_QNAME, ExtensionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimple")
    public JAXBElement<CreateSimple> createCreateSimple(CreateSimple value) {
        return new JAXBElement<CreateSimple>(_CreateSimple_QNAME, CreateSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimpleResponse")
    public JAXBElement<CreateSimpleResponse> createCreateSimpleResponse(CreateSimpleResponse value) {
        return new JAXBElement<CreateSimpleResponse>(_CreateSimpleResponse_QNAME, CreateSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "AutomationException")
    public JAXBElement<AutomationException> createAutomationException(AutomationException value) {
        return new JAXBElement<AutomationException>(_AutomationException_QNAME, AutomationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "isValidResponse")
    public JAXBElement<IsValidResponse> createIsValidResponse(IsValidResponse value) {
        return new JAXBElement<IsValidResponse>(_IsValidResponse_QNAME, IsValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getProperties")
    public JAXBElement<GetProperties> createGetProperties(GetProperties value) {
        return new JAXBElement<GetProperties>(_GetProperties_QNAME, GetProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildsResponse")
    public JAXBElement<GetChildsResponse> createGetChildsResponse(GetChildsResponse value) {
        return new JAXBElement<GetChildsResponse>(_GetChildsResponse_QNAME, GetChildsResponse.class, null, value);
    }

}
