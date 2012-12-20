
package com.novatec.services.repositoryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.repositoryservice package. 
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
    private final static QName _GetNodeUuid_QNAME = new QName("http://ws.openkm.com", "getNodeUuid");
    private final static QName _GetAppVersionResponse_QNAME = new QName("http://ws.openkm.com", "getAppVersionResponse");
    private final static QName _PurgeTrash_QNAME = new QName("http://ws.openkm.com", "purgeTrash");
    private final static QName _GetTrashFolder_QNAME = new QName("http://ws.openkm.com", "getTrashFolder");
    private final static QName _GetMailFolder_QNAME = new QName("http://ws.openkm.com", "getMailFolder");
    private final static QName _GetPersonalFolder_QNAME = new QName("http://ws.openkm.com", "getPersonalFolder");
    private final static QName _HasNode_QNAME = new QName("http://ws.openkm.com", "hasNode");
    private final static QName _GetNodePathResponse_QNAME = new QName("http://ws.openkm.com", "getNodePathResponse");
    private final static QName _HasNodeResponse_QNAME = new QName("http://ws.openkm.com", "hasNodeResponse");
    private final static QName _GetNodeUuidResponse_QNAME = new QName("http://ws.openkm.com", "getNodeUuidResponse");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _GetAppVersion_QNAME = new QName("http://ws.openkm.com", "getAppVersion");
    private final static QName _GetTemplatesFolderResponse_QNAME = new QName("http://ws.openkm.com", "getTemplatesFolderResponse");
    private final static QName _GetPersonalFolderResponse_QNAME = new QName("http://ws.openkm.com", "getPersonalFolderResponse");
    private final static QName _GetTemplatesFolder_QNAME = new QName("http://ws.openkm.com", "getTemplatesFolder");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private final static QName _GetCategoriesFolder_QNAME = new QName("http://ws.openkm.com", "getCategoriesFolder");
    private final static QName _GetRootFolder_QNAME = new QName("http://ws.openkm.com", "getRootFolder");
    private final static QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private final static QName _GetThesaurusFolderResponse_QNAME = new QName("http://ws.openkm.com", "getThesaurusFolderResponse");
    private final static QName _GetCategoriesFolderResponse_QNAME = new QName("http://ws.openkm.com", "getCategoriesFolderResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _GetTrashFolderResponse_QNAME = new QName("http://ws.openkm.com", "getTrashFolderResponse");
    private final static QName _GetRootFolderResponse_QNAME = new QName("http://ws.openkm.com", "getRootFolderResponse");
    private final static QName _GetMailFolderResponse_QNAME = new QName("http://ws.openkm.com", "getMailFolderResponse");
    private final static QName _PurgeTrashResponse_QNAME = new QName("http://ws.openkm.com", "purgeTrashResponse");
    private final static QName _GetNodePath_QNAME = new QName("http://ws.openkm.com", "getNodePath");
    private final static QName _GetThesaurusFolder_QNAME = new QName("http://ws.openkm.com", "getThesaurusFolder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.repositoryservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link GetTemplatesFolder }
     * 
     */
    public GetTemplatesFolder createGetTemplatesFolder() {
        return new GetTemplatesFolder();
    }

    /**
     * Create an instance of {@link GetPersonalFolderResponse }
     * 
     */
    public GetPersonalFolderResponse createGetPersonalFolderResponse() {
        return new GetPersonalFolderResponse();
    }

    /**
     * Create an instance of {@link GetTemplatesFolderResponse }
     * 
     */
    public GetTemplatesFolderResponse createGetTemplatesFolderResponse() {
        return new GetTemplatesFolderResponse();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link GetAppVersion }
     * 
     */
    public GetAppVersion createGetAppVersion() {
        return new GetAppVersion();
    }

    /**
     * Create an instance of {@link GetNodePathResponse }
     * 
     */
    public GetNodePathResponse createGetNodePathResponse() {
        return new GetNodePathResponse();
    }

    /**
     * Create an instance of {@link GetNodeUuidResponse }
     * 
     */
    public GetNodeUuidResponse createGetNodeUuidResponse() {
        return new GetNodeUuidResponse();
    }

    /**
     * Create an instance of {@link HasNodeResponse }
     * 
     */
    public HasNodeResponse createHasNodeResponse() {
        return new HasNodeResponse();
    }

    /**
     * Create an instance of {@link GetPersonalFolder }
     * 
     */
    public GetPersonalFolder createGetPersonalFolder() {
        return new GetPersonalFolder();
    }

    /**
     * Create an instance of {@link GetMailFolder }
     * 
     */
    public GetMailFolder createGetMailFolder() {
        return new GetMailFolder();
    }

    /**
     * Create an instance of {@link GetTrashFolder }
     * 
     */
    public GetTrashFolder createGetTrashFolder() {
        return new GetTrashFolder();
    }

    /**
     * Create an instance of {@link HasNode }
     * 
     */
    public HasNode createHasNode() {
        return new HasNode();
    }

    /**
     * Create an instance of {@link PurgeTrash }
     * 
     */
    public PurgeTrash createPurgeTrash() {
        return new PurgeTrash();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link GetNodeUuid }
     * 
     */
    public GetNodeUuid createGetNodeUuid() {
        return new GetNodeUuid();
    }

    /**
     * Create an instance of {@link GetAppVersionResponse }
     * 
     */
    public GetAppVersionResponse createGetAppVersionResponse() {
        return new GetAppVersionResponse();
    }

    /**
     * Create an instance of {@link GetThesaurusFolder }
     * 
     */
    public GetThesaurusFolder createGetThesaurusFolder() {
        return new GetThesaurusFolder();
    }

    /**
     * Create an instance of {@link GetNodePath }
     * 
     */
    public GetNodePath createGetNodePath() {
        return new GetNodePath();
    }

    /**
     * Create an instance of {@link GetMailFolderResponse }
     * 
     */
    public GetMailFolderResponse createGetMailFolderResponse() {
        return new GetMailFolderResponse();
    }

    /**
     * Create an instance of {@link PurgeTrashResponse }
     * 
     */
    public PurgeTrashResponse createPurgeTrashResponse() {
        return new PurgeTrashResponse();
    }

    /**
     * Create an instance of {@link GetTrashFolderResponse }
     * 
     */
    public GetTrashFolderResponse createGetTrashFolderResponse() {
        return new GetTrashFolderResponse();
    }

    /**
     * Create an instance of {@link GetRootFolderResponse }
     * 
     */
    public GetRootFolderResponse createGetRootFolderResponse() {
        return new GetRootFolderResponse();
    }

    /**
     * Create an instance of {@link GetCategoriesFolderResponse }
     * 
     */
    public GetCategoriesFolderResponse createGetCategoriesFolderResponse() {
        return new GetCategoriesFolderResponse();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link LockException }
     * 
     */
    public LockException createLockException() {
        return new LockException();
    }

    /**
     * Create an instance of {@link GetRootFolder }
     * 
     */
    public GetRootFolder createGetRootFolder() {
        return new GetRootFolder();
    }

    /**
     * Create an instance of {@link GetThesaurusFolderResponse }
     * 
     */
    public GetThesaurusFolderResponse createGetThesaurusFolderResponse() {
        return new GetThesaurusFolderResponse();
    }

    /**
     * Create an instance of {@link GetCategoriesFolder }
     * 
     */
    public GetCategoriesFolder createGetCategoriesFolder() {
        return new GetCategoriesFolder();
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
     * Create an instance of {@link AppVersion }
     * 
     */
    public AppVersion createAppVersion() {
        return new AppVersion();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeUuid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodeUuid")
    public JAXBElement<GetNodeUuid> createGetNodeUuid(GetNodeUuid value) {
        return new JAXBElement<GetNodeUuid>(_GetNodeUuid_QNAME, GetNodeUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAppVersionResponse")
    public JAXBElement<GetAppVersionResponse> createGetAppVersionResponse(GetAppVersionResponse value) {
        return new JAXBElement<GetAppVersionResponse>(_GetAppVersionResponse_QNAME, GetAppVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeTrash }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeTrash")
    public JAXBElement<PurgeTrash> createPurgeTrash(PurgeTrash value) {
        return new JAXBElement<PurgeTrash>(_PurgeTrash_QNAME, PurgeTrash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrashFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTrashFolder")
    public JAXBElement<GetTrashFolder> createGetTrashFolder(GetTrashFolder value) {
        return new JAXBElement<GetTrashFolder>(_GetTrashFolder_QNAME, GetTrashFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailFolder")
    public JAXBElement<GetMailFolder> createGetMailFolder(GetMailFolder value) {
        return new JAXBElement<GetMailFolder>(_GetMailFolder_QNAME, GetMailFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPersonalFolder")
    public JAXBElement<GetPersonalFolder> createGetPersonalFolder(GetPersonalFolder value) {
        return new JAXBElement<GetPersonalFolder>(_GetPersonalFolder_QNAME, GetPersonalFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "hasNode")
    public JAXBElement<HasNode> createHasNode(HasNode value) {
        return new JAXBElement<HasNode>(_HasNode_QNAME, HasNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodePathResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodePathResponse")
    public JAXBElement<GetNodePathResponse> createGetNodePathResponse(GetNodePathResponse value) {
        return new JAXBElement<GetNodePathResponse>(_GetNodePathResponse_QNAME, GetNodePathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "hasNodeResponse")
    public JAXBElement<HasNodeResponse> createHasNodeResponse(HasNodeResponse value) {
        return new JAXBElement<HasNodeResponse>(_HasNodeResponse_QNAME, HasNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeUuidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodeUuidResponse")
    public JAXBElement<GetNodeUuidResponse> createGetNodeUuidResponse(GetNodeUuidResponse value) {
        return new JAXBElement<GetNodeUuidResponse>(_GetNodeUuidResponse_QNAME, GetNodeUuidResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAppVersion")
    public JAXBElement<GetAppVersion> createGetAppVersion(GetAppVersion value) {
        return new JAXBElement<GetAppVersion>(_GetAppVersion_QNAME, GetAppVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTemplatesFolderResponse")
    public JAXBElement<GetTemplatesFolderResponse> createGetTemplatesFolderResponse(GetTemplatesFolderResponse value) {
        return new JAXBElement<GetTemplatesFolderResponse>(_GetTemplatesFolderResponse_QNAME, GetTemplatesFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPersonalFolderResponse")
    public JAXBElement<GetPersonalFolderResponse> createGetPersonalFolderResponse(GetPersonalFolderResponse value) {
        return new JAXBElement<GetPersonalFolderResponse>(_GetPersonalFolderResponse_QNAME, GetPersonalFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTemplatesFolder")
    public JAXBElement<GetTemplatesFolder> createGetTemplatesFolder(GetTemplatesFolder value) {
        return new JAXBElement<GetTemplatesFolder>(_GetTemplatesFolder_QNAME, GetTemplatesFolder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategoriesFolder")
    public JAXBElement<GetCategoriesFolder> createGetCategoriesFolder(GetCategoriesFolder value) {
        return new JAXBElement<GetCategoriesFolder>(_GetCategoriesFolder_QNAME, GetCategoriesFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRootFolder")
    public JAXBElement<GetRootFolder> createGetRootFolder(GetRootFolder value) {
        return new JAXBElement<GetRootFolder>(_GetRootFolder_QNAME, GetRootFolder.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getThesaurusFolderResponse")
    public JAXBElement<GetThesaurusFolderResponse> createGetThesaurusFolderResponse(GetThesaurusFolderResponse value) {
        return new JAXBElement<GetThesaurusFolderResponse>(_GetThesaurusFolderResponse_QNAME, GetThesaurusFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategoriesFolderResponse")
    public JAXBElement<GetCategoriesFolderResponse> createGetCategoriesFolderResponse(GetCategoriesFolderResponse value) {
        return new JAXBElement<GetCategoriesFolderResponse>(_GetCategoriesFolderResponse_QNAME, GetCategoriesFolderResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrashFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTrashFolderResponse")
    public JAXBElement<GetTrashFolderResponse> createGetTrashFolderResponse(GetTrashFolderResponse value) {
        return new JAXBElement<GetTrashFolderResponse>(_GetTrashFolderResponse_QNAME, GetTrashFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRootFolderResponse")
    public JAXBElement<GetRootFolderResponse> createGetRootFolderResponse(GetRootFolderResponse value) {
        return new JAXBElement<GetRootFolderResponse>(_GetRootFolderResponse_QNAME, GetRootFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailFolderResponse")
    public JAXBElement<GetMailFolderResponse> createGetMailFolderResponse(GetMailFolderResponse value) {
        return new JAXBElement<GetMailFolderResponse>(_GetMailFolderResponse_QNAME, GetMailFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeTrashResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeTrashResponse")
    public JAXBElement<PurgeTrashResponse> createPurgeTrashResponse(PurgeTrashResponse value) {
        return new JAXBElement<PurgeTrashResponse>(_PurgeTrashResponse_QNAME, PurgeTrashResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodePath }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodePath")
    public JAXBElement<GetNodePath> createGetNodePath(GetNodePath value) {
        return new JAXBElement<GetNodePath>(_GetNodePath_QNAME, GetNodePath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getThesaurusFolder")
    public JAXBElement<GetThesaurusFolder> createGetThesaurusFolder(GetThesaurusFolder value) {
        return new JAXBElement<GetThesaurusFolder>(_GetThesaurusFolder_QNAME, GetThesaurusFolder.class, null, value);
    }

}
