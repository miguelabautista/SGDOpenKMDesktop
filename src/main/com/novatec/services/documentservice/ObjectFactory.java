
package com.novatec.services.documentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.documentservice package. 
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

    private final static QName _GetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "getPropertiesResponse");
    private final static QName _Purge_QNAME = new QName("http://ws.openkm.com", "purge");
    private final static QName _Move_QNAME = new QName("http://ws.openkm.com", "move");
    private final static QName _CreateResponse_QNAME = new QName("http://ws.openkm.com", "createResponse");
    private final static QName _RenameResponse_QNAME = new QName("http://ws.openkm.com", "renameResponse");
    private final static QName _RestoreVersionResponse_QNAME = new QName("http://ws.openkm.com", "restoreVersionResponse");
    private final static QName _UserQuotaExceededException_QNAME = new QName("http://ws.openkm.com", "UserQuotaExceededException");
    private final static QName _RestoreVersion_QNAME = new QName("http://ws.openkm.com", "restoreVersion");
    private final static QName _UnlockResponse_QNAME = new QName("http://ws.openkm.com", "unlockResponse");
    private final static QName _ForceUnlockResponse_QNAME = new QName("http://ws.openkm.com", "forceUnlockResponse");
    private final static QName _SetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "setPropertiesResponse");
    private final static QName _ForceCancelCheckout_QNAME = new QName("http://ws.openkm.com", "forceCancelCheckout");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _GetChildren_QNAME = new QName("http://ws.openkm.com", "getChildren");
    private final static QName _PurgeVersionHistory_QNAME = new QName("http://ws.openkm.com", "purgeVersionHistory");
    private final static QName _GetPathResponse_QNAME = new QName("http://ws.openkm.com", "getPathResponse");
    private final static QName _Rename_QNAME = new QName("http://ws.openkm.com", "rename");
    private final static QName _LockResponse_QNAME = new QName("http://ws.openkm.com", "lockResponse");
    private final static QName _GetContentResponse_QNAME = new QName("http://ws.openkm.com", "getContentResponse");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private final static QName _ItemExistsException_QNAME = new QName("http://ws.openkm.com", "ItemExistsException");
    private final static QName _Checkout_QNAME = new QName("http://ws.openkm.com", "checkout");
    private final static QName _IsValid_QNAME = new QName("http://ws.openkm.com", "isValid");
    private final static QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private final static QName _ExtensionException_QNAME = new QName("http://ws.openkm.com", "ExtensionException");
    private final static QName _GetVersionHistorySizeResponse_QNAME = new QName("http://ws.openkm.com", "getVersionHistorySizeResponse");
    private final static QName _SetProperties_QNAME = new QName("http://ws.openkm.com", "setProperties");
    private final static QName _Checkin_QNAME = new QName("http://ws.openkm.com", "checkin");
    private final static QName _GetVersionHistory_QNAME = new QName("http://ws.openkm.com", "getVersionHistory");
    private final static QName _PurgeVersionHistoryResponse_QNAME = new QName("http://ws.openkm.com", "purgeVersionHistoryResponse");
    private final static QName _Create_QNAME = new QName("http://ws.openkm.com", "create");
    private final static QName _PrincipalAdapterException_QNAME = new QName("http://ws.openkm.com", "PrincipalAdapterException");
    private final static QName _UnsupportedMimeTypeException_QNAME = new QName("http://ws.openkm.com", "UnsupportedMimeTypeException");
    private final static QName _AutomationException_QNAME = new QName("http://ws.openkm.com", "AutomationException");
    private final static QName _CreateSimpleResponse_QNAME = new QName("http://ws.openkm.com", "createSimpleResponse");
    private final static QName _FileSizeExceededException_QNAME = new QName("http://ws.openkm.com", "FileSizeExceededException");
    private final static QName _GetProperties_QNAME = new QName("http://ws.openkm.com", "getProperties");
    private final static QName _ForceCancelCheckoutResponse_QNAME = new QName("http://ws.openkm.com", "forceCancelCheckoutResponse");
    private final static QName _GetVersionHistorySize_QNAME = new QName("http://ws.openkm.com", "getVersionHistorySize");
    private final static QName _GetContent_QNAME = new QName("http://ws.openkm.com", "getContent");
    private final static QName _GetContentByVersion_QNAME = new QName("http://ws.openkm.com", "getContentByVersion");
    private final static QName _PurgeResponse_QNAME = new QName("http://ws.openkm.com", "purgeResponse");
    private final static QName _Unlock_QNAME = new QName("http://ws.openkm.com", "unlock");
    private final static QName _GetVersionHistoryResponse_QNAME = new QName("http://ws.openkm.com", "getVersionHistoryResponse");
    private final static QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private final static QName _GetChildrenResponse_QNAME = new QName("http://ws.openkm.com", "getChildrenResponse");
    private final static QName _GetPath_QNAME = new QName("http://ws.openkm.com", "getPath");
    private final static QName _Delete_QNAME = new QName("http://ws.openkm.com", "delete");
    private final static QName _CancelCheckoutResponse_QNAME = new QName("http://ws.openkm.com", "cancelCheckoutResponse");
    private final static QName _CancelCheckout_QNAME = new QName("http://ws.openkm.com", "cancelCheckout");
    private final static QName _GetChilds_QNAME = new QName("http://ws.openkm.com", "getChilds");
    private final static QName _VersionException_QNAME = new QName("http://ws.openkm.com", "VersionException");
    private final static QName _IOException_QNAME = new QName("http://ws.openkm.com", "IOException");
    private final static QName _VirusDetectedException_QNAME = new QName("http://ws.openkm.com", "VirusDetectedException");
    private final static QName _CheckoutResponse_QNAME = new QName("http://ws.openkm.com", "checkoutResponse");
    private final static QName _MoveResponse_QNAME = new QName("http://ws.openkm.com", "moveResponse");
    private final static QName _ForceUnlock_QNAME = new QName("http://ws.openkm.com", "forceUnlock");
    private final static QName _DeleteResponse_QNAME = new QName("http://ws.openkm.com", "deleteResponse");
    private final static QName _GetContentByVersionResponse_QNAME = new QName("http://ws.openkm.com", "getContentByVersionResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _CreateSimple_QNAME = new QName("http://ws.openkm.com", "createSimple");
    private final static QName _Lock_QNAME = new QName("http://ws.openkm.com", "lock");
    private final static QName _IsValidResponse_QNAME = new QName("http://ws.openkm.com", "isValidResponse");
    private final static QName _CheckinResponse_QNAME = new QName("http://ws.openkm.com", "checkinResponse");
    private final static QName _GetChildsResponse_QNAME = new QName("http://ws.openkm.com", "getChildsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.documentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetContentResponse }
     * 
     */
    public GetContentResponse createGetContentResponse() {
        return new GetContentResponse();
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
     * Create an instance of {@link LockResponse }
     * 
     */
    public LockResponse createLockResponse() {
        return new LockResponse();
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
     * Create an instance of {@link PurgeVersionHistory }
     * 
     */
    public PurgeVersionHistory createPurgeVersionHistory() {
        return new PurgeVersionHistory();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link SetPropertiesResponse }
     * 
     */
    public SetPropertiesResponse createSetPropertiesResponse() {
        return new SetPropertiesResponse();
    }

    /**
     * Create an instance of {@link ForceCancelCheckout }
     * 
     */
    public ForceCancelCheckout createForceCancelCheckout() {
        return new ForceCancelCheckout();
    }

    /**
     * Create an instance of {@link UnlockResponse }
     * 
     */
    public UnlockResponse createUnlockResponse() {
        return new UnlockResponse();
    }

    /**
     * Create an instance of {@link RestoreVersion }
     * 
     */
    public RestoreVersion createRestoreVersion() {
        return new RestoreVersion();
    }

    /**
     * Create an instance of {@link ForceUnlockResponse }
     * 
     */
    public ForceUnlockResponse createForceUnlockResponse() {
        return new ForceUnlockResponse();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link UserQuotaExceededException }
     * 
     */
    public UserQuotaExceededException createUserQuotaExceededException() {
        return new UserQuotaExceededException();
    }

    /**
     * Create an instance of {@link RestoreVersionResponse }
     * 
     */
    public RestoreVersionResponse createRestoreVersionResponse() {
        return new RestoreVersionResponse();
    }

    /**
     * Create an instance of {@link RenameResponse }
     * 
     */
    public RenameResponse createRenameResponse() {
        return new RenameResponse();
    }

    /**
     * Create an instance of {@link Move }
     * 
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link Purge }
     * 
     */
    public Purge createPurge() {
        return new Purge();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetContentByVersion }
     * 
     */
    public GetContentByVersion createGetContentByVersion() {
        return new GetContentByVersion();
    }

    /**
     * Create an instance of {@link Unlock }
     * 
     */
    public Unlock createUnlock() {
        return new Unlock();
    }

    /**
     * Create an instance of {@link PurgeResponse }
     * 
     */
    public PurgeResponse createPurgeResponse() {
        return new PurgeResponse();
    }

    /**
     * Create an instance of {@link GetContent }
     * 
     */
    public GetContent createGetContent() {
        return new GetContent();
    }

    /**
     * Create an instance of {@link GetVersionHistorySize }
     * 
     */
    public GetVersionHistorySize createGetVersionHistorySize() {
        return new GetVersionHistorySize();
    }

    /**
     * Create an instance of {@link ForceCancelCheckoutResponse }
     * 
     */
    public ForceCancelCheckoutResponse createForceCancelCheckoutResponse() {
        return new ForceCancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link FileSizeExceededException }
     * 
     */
    public FileSizeExceededException createFileSizeExceededException() {
        return new FileSizeExceededException();
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
     * Create an instance of {@link PrincipalAdapterException }
     * 
     */
    public PrincipalAdapterException createPrincipalAdapterException() {
        return new PrincipalAdapterException();
    }

    /**
     * Create an instance of {@link UnsupportedMimeTypeException }
     * 
     */
    public UnsupportedMimeTypeException createUnsupportedMimeTypeException() {
        return new UnsupportedMimeTypeException();
    }

    /**
     * Create an instance of {@link AutomationException }
     * 
     */
    public AutomationException createAutomationException() {
        return new AutomationException();
    }

    /**
     * Create an instance of {@link CreateSimpleResponse }
     * 
     */
    public CreateSimpleResponse createCreateSimpleResponse() {
        return new CreateSimpleResponse();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

    /**
     * Create an instance of {@link GetVersionHistory }
     * 
     */
    public GetVersionHistory createGetVersionHistory() {
        return new GetVersionHistory();
    }

    /**
     * Create an instance of {@link PurgeVersionHistoryResponse }
     * 
     */
    public PurgeVersionHistoryResponse createPurgeVersionHistoryResponse() {
        return new PurgeVersionHistoryResponse();
    }

    /**
     * Create an instance of {@link GetVersionHistorySizeResponse }
     * 
     */
    public GetVersionHistorySizeResponse createGetVersionHistorySizeResponse() {
        return new GetVersionHistorySizeResponse();
    }

    /**
     * Create an instance of {@link ExtensionException }
     * 
     */
    public ExtensionException createExtensionException() {
        return new ExtensionException();
    }

    /**
     * Create an instance of {@link SetProperties }
     * 
     */
    public SetProperties createSetProperties() {
        return new SetProperties();
    }

    /**
     * Create an instance of {@link LockException }
     * 
     */
    public LockException createLockException() {
        return new LockException();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link IsValid }
     * 
     */
    public IsValid createIsValid() {
        return new IsValid();
    }

    /**
     * Create an instance of {@link VirusDetectedException }
     * 
     */
    public VirusDetectedException createVirusDetectedException() {
        return new VirusDetectedException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link VersionException }
     * 
     */
    public VersionException createVersionException() {
        return new VersionException();
    }

    /**
     * Create an instance of {@link GetChilds }
     * 
     */
    public GetChilds createGetChilds() {
        return new GetChilds();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetPath }
     * 
     */
    public GetPath createGetPath() {
        return new GetPath();
    }

    /**
     * Create an instance of {@link CancelCheckout }
     * 
     */
    public CancelCheckout createCancelCheckout() {
        return new CancelCheckout();
    }

    /**
     * Create an instance of {@link CancelCheckoutResponse }
     * 
     */
    public CancelCheckoutResponse createCancelCheckoutResponse() {
        return new CancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link GetVersionHistoryResponse }
     * 
     */
    public GetVersionHistoryResponse createGetVersionHistoryResponse() {
        return new GetVersionHistoryResponse();
    }

    /**
     * Create an instance of {@link GetChildrenResponse }
     * 
     */
    public GetChildrenResponse createGetChildrenResponse() {
        return new GetChildrenResponse();
    }

    /**
     * Create an instance of {@link GetChildsResponse }
     * 
     */
    public GetChildsResponse createGetChildsResponse() {
        return new GetChildsResponse();
    }

    /**
     * Create an instance of {@link CheckinResponse }
     * 
     */
    public CheckinResponse createCheckinResponse() {
        return new CheckinResponse();
    }

    /**
     * Create an instance of {@link IsValidResponse }
     * 
     */
    public IsValidResponse createIsValidResponse() {
        return new IsValidResponse();
    }

    /**
     * Create an instance of {@link Lock }
     * 
     */
    public Lock createLock() {
        return new Lock();
    }

    /**
     * Create an instance of {@link CreateSimple }
     * 
     */
    public CreateSimple createCreateSimple() {
        return new CreateSimple();
    }

    /**
     * Create an instance of {@link GetContentByVersionResponse }
     * 
     */
    public GetContentByVersionResponse createGetContentByVersionResponse() {
        return new GetContentByVersionResponse();
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
     * Create an instance of {@link ForceUnlock }
     * 
     */
    public ForceUnlock createForceUnlock() {
        return new ForceUnlock();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link CheckoutResponse }
     * 
     */
    public CheckoutResponse createCheckoutResponse() {
        return new CheckoutResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link LockInfo }
     * 
     */
    public LockInfo createLockInfo() {
        return new LockInfo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPropertiesResponse")
    public JAXBElement<GetPropertiesResponse> createGetPropertiesResponse(GetPropertiesResponse value) {
        return new JAXBElement<GetPropertiesResponse>(_GetPropertiesResponse_QNAME, GetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purge")
    public JAXBElement<Purge> createPurge(Purge value) {
        return new JAXBElement<Purge>(_Purge_QNAME, Purge.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "renameResponse")
    public JAXBElement<RenameResponse> createRenameResponse(RenameResponse value) {
        return new JAXBElement<RenameResponse>(_RenameResponse_QNAME, RenameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "restoreVersionResponse")
    public JAXBElement<RestoreVersionResponse> createRestoreVersionResponse(RestoreVersionResponse value) {
        return new JAXBElement<RestoreVersionResponse>(_RestoreVersionResponse_QNAME, RestoreVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserQuotaExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "UserQuotaExceededException")
    public JAXBElement<UserQuotaExceededException> createUserQuotaExceededException(UserQuotaExceededException value) {
        return new JAXBElement<UserQuotaExceededException>(_UserQuotaExceededException_QNAME, UserQuotaExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "restoreVersion")
    public JAXBElement<RestoreVersion> createRestoreVersion(RestoreVersion value) {
        return new JAXBElement<RestoreVersion>(_RestoreVersion_QNAME, RestoreVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unlockResponse")
    public JAXBElement<UnlockResponse> createUnlockResponse(UnlockResponse value) {
        return new JAXBElement<UnlockResponse>(_UnlockResponse_QNAME, UnlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceUnlockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceUnlockResponse")
    public JAXBElement<ForceUnlockResponse> createForceUnlockResponse(ForceUnlockResponse value) {
        return new JAXBElement<ForceUnlockResponse>(_ForceUnlockResponse_QNAME, ForceUnlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setPropertiesResponse")
    public JAXBElement<SetPropertiesResponse> createSetPropertiesResponse(SetPropertiesResponse value) {
        return new JAXBElement<SetPropertiesResponse>(_SetPropertiesResponse_QNAME, SetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceCancelCheckout")
    public JAXBElement<ForceCancelCheckout> createForceCancelCheckout(ForceCancelCheckout value) {
        return new JAXBElement<ForceCancelCheckout>(_ForceCancelCheckout_QNAME, ForceCancelCheckout.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildren")
    public JAXBElement<GetChildren> createGetChildren(GetChildren value) {
        return new JAXBElement<GetChildren>(_GetChildren_QNAME, GetChildren.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeVersionHistory")
    public JAXBElement<PurgeVersionHistory> createPurgeVersionHistory(PurgeVersionHistory value) {
        return new JAXBElement<PurgeVersionHistory>(_PurgeVersionHistory_QNAME, PurgeVersionHistory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "lockResponse")
    public JAXBElement<LockResponse> createLockResponse(LockResponse value) {
        return new JAXBElement<LockResponse>(_LockResponse_QNAME, LockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentResponse")
    public JAXBElement<GetContentResponse> createGetContentResponse(GetContentResponse value) {
        return new JAXBElement<GetContentResponse>(_GetContentResponse_QNAME, GetContentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkout")
    public JAXBElement<Checkout> createCheckout(Checkout value) {
        return new JAXBElement<Checkout>(_Checkout_QNAME, Checkout.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ExtensionException")
    public JAXBElement<ExtensionException> createExtensionException(ExtensionException value) {
        return new JAXBElement<ExtensionException>(_ExtensionException_QNAME, ExtensionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistorySizeResponse")
    public JAXBElement<GetVersionHistorySizeResponse> createGetVersionHistorySizeResponse(GetVersionHistorySizeResponse value) {
        return new JAXBElement<GetVersionHistorySizeResponse>(_GetVersionHistorySizeResponse_QNAME, GetVersionHistorySizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setProperties")
    public JAXBElement<SetProperties> createSetProperties(SetProperties value) {
        return new JAXBElement<SetProperties>(_SetProperties_QNAME, SetProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkin")
    public JAXBElement<Checkin> createCheckin(Checkin value) {
        return new JAXBElement<Checkin>(_Checkin_QNAME, Checkin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistory")
    public JAXBElement<GetVersionHistory> createGetVersionHistory(GetVersionHistory value) {
        return new JAXBElement<GetVersionHistory>(_GetVersionHistory_QNAME, GetVersionHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeVersionHistoryResponse")
    public JAXBElement<PurgeVersionHistoryResponse> createPurgeVersionHistoryResponse(PurgeVersionHistoryResponse value) {
        return new JAXBElement<PurgeVersionHistoryResponse>(_PurgeVersionHistoryResponse_QNAME, PurgeVersionHistoryResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalAdapterException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "PrincipalAdapterException")
    public JAXBElement<PrincipalAdapterException> createPrincipalAdapterException(PrincipalAdapterException value) {
        return new JAXBElement<PrincipalAdapterException>(_PrincipalAdapterException_QNAME, PrincipalAdapterException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedMimeTypeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "UnsupportedMimeTypeException")
    public JAXBElement<UnsupportedMimeTypeException> createUnsupportedMimeTypeException(UnsupportedMimeTypeException value) {
        return new JAXBElement<UnsupportedMimeTypeException>(_UnsupportedMimeTypeException_QNAME, UnsupportedMimeTypeException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimpleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimpleResponse")
    public JAXBElement<CreateSimpleResponse> createCreateSimpleResponse(CreateSimpleResponse value) {
        return new JAXBElement<CreateSimpleResponse>(_CreateSimpleResponse_QNAME, CreateSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSizeExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "FileSizeExceededException")
    public JAXBElement<FileSizeExceededException> createFileSizeExceededException(FileSizeExceededException value) {
        return new JAXBElement<FileSizeExceededException>(_FileSizeExceededException_QNAME, FileSizeExceededException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceCancelCheckoutResponse")
    public JAXBElement<ForceCancelCheckoutResponse> createForceCancelCheckoutResponse(ForceCancelCheckoutResponse value) {
        return new JAXBElement<ForceCancelCheckoutResponse>(_ForceCancelCheckoutResponse_QNAME, ForceCancelCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistorySize")
    public JAXBElement<GetVersionHistorySize> createGetVersionHistorySize(GetVersionHistorySize value) {
        return new JAXBElement<GetVersionHistorySize>(_GetVersionHistorySize_QNAME, GetVersionHistorySize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContent")
    public JAXBElement<GetContent> createGetContent(GetContent value) {
        return new JAXBElement<GetContent>(_GetContent_QNAME, GetContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentByVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentByVersion")
    public JAXBElement<GetContentByVersion> createGetContentByVersion(GetContentByVersion value) {
        return new JAXBElement<GetContentByVersion>(_GetContentByVersion_QNAME, GetContentByVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeResponse")
    public JAXBElement<PurgeResponse> createPurgeResponse(PurgeResponse value) {
        return new JAXBElement<PurgeResponse>(_PurgeResponse_QNAME, PurgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unlock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unlock")
    public JAXBElement<Unlock> createUnlock(Unlock value) {
        return new JAXBElement<Unlock>(_Unlock_QNAME, Unlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistoryResponse")
    public JAXBElement<GetVersionHistoryResponse> createGetVersionHistoryResponse(GetVersionHistoryResponse value) {
        return new JAXBElement<GetVersionHistoryResponse>(_GetVersionHistoryResponse_QNAME, GetVersionHistoryResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPath")
    public JAXBElement<GetPath> createGetPath(GetPath value) {
        return new JAXBElement<GetPath>(_GetPath_QNAME, GetPath.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "cancelCheckoutResponse")
    public JAXBElement<CancelCheckoutResponse> createCancelCheckoutResponse(CancelCheckoutResponse value) {
        return new JAXBElement<CancelCheckoutResponse>(_CancelCheckoutResponse_QNAME, CancelCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "cancelCheckout")
    public JAXBElement<CancelCheckout> createCancelCheckout(CancelCheckout value) {
        return new JAXBElement<CancelCheckout>(_CancelCheckout_QNAME, CancelCheckout.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "VersionException")
    public JAXBElement<VersionException> createVersionException(VersionException value) {
        return new JAXBElement<VersionException>(_VersionException_QNAME, VersionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirusDetectedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "VirusDetectedException")
    public JAXBElement<VirusDetectedException> createVirusDetectedException(VirusDetectedException value) {
        return new JAXBElement<VirusDetectedException>(_VirusDetectedException_QNAME, VirusDetectedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkoutResponse")
    public JAXBElement<CheckoutResponse> createCheckoutResponse(CheckoutResponse value) {
        return new JAXBElement<CheckoutResponse>(_CheckoutResponse_QNAME, CheckoutResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceUnlock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceUnlock")
    public JAXBElement<ForceUnlock> createForceUnlock(ForceUnlock value) {
        return new JAXBElement<ForceUnlock>(_ForceUnlock_QNAME, ForceUnlock.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentByVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentByVersionResponse")
    public JAXBElement<GetContentByVersionResponse> createGetContentByVersionResponse(GetContentByVersionResponse value) {
        return new JAXBElement<GetContentByVersionResponse>(_GetContentByVersionResponse_QNAME, GetContentByVersionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimple")
    public JAXBElement<CreateSimple> createCreateSimple(CreateSimple value) {
        return new JAXBElement<CreateSimple>(_CreateSimple_QNAME, CreateSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "lock")
    public JAXBElement<Lock> createLock(Lock value) {
        return new JAXBElement<Lock>(_Lock_QNAME, Lock.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkinResponse")
    public JAXBElement<CheckinResponse> createCheckinResponse(CheckinResponse value) {
        return new JAXBElement<CheckinResponse>(_CheckinResponse_QNAME, CheckinResponse.class, null, value);
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
