
package com.novatec.services.propertyservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.propertyservice package. 
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

    private final static QName _UnsetEncryptionResponse_QNAME = new QName("http://ws.openkm.com", "unsetEncryptionResponse");
    private final static QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private final static QName _RemoveKeyword_QNAME = new QName("http://ws.openkm.com", "removeKeyword");
    private final static QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private final static QName _SetEncryption_QNAME = new QName("http://ws.openkm.com", "setEncryption");
    private final static QName _RemoveKeywordResponse_QNAME = new QName("http://ws.openkm.com", "removeKeywordResponse");
    private final static QName _SetEncryptionResponse_QNAME = new QName("http://ws.openkm.com", "setEncryptionResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _AddCategory_QNAME = new QName("http://ws.openkm.com", "addCategory");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _AddKeyword_QNAME = new QName("http://ws.openkm.com", "addKeyword");
    private final static QName _VersionException_QNAME = new QName("http://ws.openkm.com", "VersionException");
    private final static QName _AddCategoryResponse_QNAME = new QName("http://ws.openkm.com", "addCategoryResponse");
    private final static QName _RemoveCategory_QNAME = new QName("http://ws.openkm.com", "removeCategory");
    private final static QName _AddKeywordResponse_QNAME = new QName("http://ws.openkm.com", "addKeywordResponse");
    private final static QName _UnsetEncryption_QNAME = new QName("http://ws.openkm.com", "unsetEncryption");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://ws.openkm.com", "removeCategoryResponse");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.propertyservice
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
     * Create an instance of {@link UnsetEncryption }
     * 
     */
    public UnsetEncryption createUnsetEncryption() {
        return new UnsetEncryption();
    }

    /**
     * Create an instance of {@link RemoveCategoryResponse }
     * 
     */
    public RemoveCategoryResponse createRemoveCategoryResponse() {
        return new RemoveCategoryResponse();
    }

    /**
     * Create an instance of {@link AddCategoryResponse }
     * 
     */
    public AddCategoryResponse createAddCategoryResponse() {
        return new AddCategoryResponse();
    }

    /**
     * Create an instance of {@link RemoveCategory }
     * 
     */
    public RemoveCategory createRemoveCategory() {
        return new RemoveCategory();
    }

    /**
     * Create an instance of {@link VersionException }
     * 
     */
    public VersionException createVersionException() {
        return new VersionException();
    }

    /**
     * Create an instance of {@link AddKeywordResponse }
     * 
     */
    public AddKeywordResponse createAddKeywordResponse() {
        return new AddKeywordResponse();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link AddKeyword }
     * 
     */
    public AddKeyword createAddKeyword() {
        return new AddKeyword();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link AddCategory }
     * 
     */
    public AddCategory createAddCategory() {
        return new AddCategory();
    }

    /**
     * Create an instance of {@link SetEncryptionResponse }
     * 
     */
    public SetEncryptionResponse createSetEncryptionResponse() {
        return new SetEncryptionResponse();
    }

    /**
     * Create an instance of {@link RemoveKeywordResponse }
     * 
     */
    public RemoveKeywordResponse createRemoveKeywordResponse() {
        return new RemoveKeywordResponse();
    }

    /**
     * Create an instance of {@link SetEncryption }
     * 
     */
    public SetEncryption createSetEncryption() {
        return new SetEncryption();
    }

    /**
     * Create an instance of {@link LockException }
     * 
     */
    public LockException createLockException() {
        return new LockException();
    }

    /**
     * Create an instance of {@link RemoveKeyword }
     * 
     */
    public RemoveKeyword createRemoveKeyword() {
        return new RemoveKeyword();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link UnsetEncryptionResponse }
     * 
     */
    public UnsetEncryptionResponse createUnsetEncryptionResponse() {
        return new UnsetEncryptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsetEncryptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unsetEncryptionResponse")
    public JAXBElement<UnsetEncryptionResponse> createUnsetEncryptionResponse(UnsetEncryptionResponse value) {
        return new JAXBElement<UnsetEncryptionResponse>(_UnsetEncryptionResponse_QNAME, UnsetEncryptionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "removeKeyword")
    public JAXBElement<RemoveKeyword> createRemoveKeyword(RemoveKeyword value) {
        return new JAXBElement<RemoveKeyword>(_RemoveKeyword_QNAME, RemoveKeyword.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEncryption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setEncryption")
    public JAXBElement<SetEncryption> createSetEncryption(SetEncryption value) {
        return new JAXBElement<SetEncryption>(_SetEncryption_QNAME, SetEncryption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveKeywordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "removeKeywordResponse")
    public JAXBElement<RemoveKeywordResponse> createRemoveKeywordResponse(RemoveKeywordResponse value) {
        return new JAXBElement<RemoveKeywordResponse>(_RemoveKeywordResponse_QNAME, RemoveKeywordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEncryptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setEncryptionResponse")
    public JAXBElement<SetEncryptionResponse> createSetEncryptionResponse(SetEncryptionResponse value) {
        return new JAXBElement<SetEncryptionResponse>(_SetEncryptionResponse_QNAME, SetEncryptionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "addCategory")
    public JAXBElement<AddCategory> createAddCategory(AddCategory value) {
        return new JAXBElement<AddCategory>(_AddCategory_QNAME, AddCategory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKeyword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "addKeyword")
    public JAXBElement<AddKeyword> createAddKeyword(AddKeyword value) {
        return new JAXBElement<AddKeyword>(_AddKeyword_QNAME, AddKeyword.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "addCategoryResponse")
    public JAXBElement<AddCategoryResponse> createAddCategoryResponse(AddCategoryResponse value) {
        return new JAXBElement<AddCategoryResponse>(_AddCategoryResponse_QNAME, AddCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "removeCategory")
    public JAXBElement<RemoveCategory> createRemoveCategory(RemoveCategory value) {
        return new JAXBElement<RemoveCategory>(_RemoveCategory_QNAME, RemoveCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKeywordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "addKeywordResponse")
    public JAXBElement<AddKeywordResponse> createAddKeywordResponse(AddKeywordResponse value) {
        return new JAXBElement<AddKeywordResponse>(_AddKeywordResponse_QNAME, AddKeywordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsetEncryption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unsetEncryption")
    public JAXBElement<UnsetEncryption> createUnsetEncryption(UnsetEncryption value) {
        return new JAXBElement<UnsetEncryption>(_UnsetEncryption_QNAME, UnsetEncryption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
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
