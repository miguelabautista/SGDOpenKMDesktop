
package com.novatec.services.searchservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.searchservice package. 
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
    private final static QName _GetSearchResponse_QNAME = new QName("http://ws.openkm.com", "getSearchResponse");
    private final static QName _Find_QNAME = new QName("http://ws.openkm.com", "find");
    private final static QName _FindResponse_QNAME = new QName("http://ws.openkm.com", "findResponse");
    private final static QName _GetKeywordMap_QNAME = new QName("http://ws.openkm.com", "getKeywordMap");
    private final static QName _FindByContentResponse_QNAME = new QName("http://ws.openkm.com", "findByContentResponse");
    private final static QName _GetAllSearchs_QNAME = new QName("http://ws.openkm.com", "getAllSearchs");
    private final static QName _FindByKeywordsResponse_QNAME = new QName("http://ws.openkm.com", "findByKeywordsResponse");
    private final static QName _DeleteSearch_QNAME = new QName("http://ws.openkm.com", "deleteSearch");
    private final static QName _FindByKeywords_QNAME = new QName("http://ws.openkm.com", "findByKeywords");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _ParseException_QNAME = new QName("http://ws.openkm.com", "ParseException");
    private final static QName _GetKeywordMapResponse_QNAME = new QName("http://ws.openkm.com", "getKeywordMapResponse");
    private final static QName _SaveSearch_QNAME = new QName("http://ws.openkm.com", "saveSearch");
    private final static QName _UpdateSearch_QNAME = new QName("http://ws.openkm.com", "updateSearch");
    private final static QName _IOException_QNAME = new QName("http://ws.openkm.com", "IOException");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private final static QName _FindByContent_QNAME = new QName("http://ws.openkm.com", "findByContent");
    private final static QName _FindByNameResponse_QNAME = new QName("http://ws.openkm.com", "findByNameResponse");
    private final static QName _GetSearch_QNAME = new QName("http://ws.openkm.com", "getSearch");
    private final static QName _FindByName_QNAME = new QName("http://ws.openkm.com", "findByName");
    private final static QName _DeleteSearchResponse_QNAME = new QName("http://ws.openkm.com", "deleteSearchResponse");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _GetAllSearchsResponse_QNAME = new QName("http://ws.openkm.com", "getAllSearchsResponse");
    private final static QName _UpdateSearchResponse_QNAME = new QName("http://ws.openkm.com", "updateSearchResponse");
    private final static QName _SaveSearchResponse_QNAME = new QName("http://ws.openkm.com", "saveSearchResponse");
    private final static QName _GetCategorizedDocumentsResponse_QNAME = new QName("http://ws.openkm.com", "getCategorizedDocumentsResponse");
    private final static QName _GetCategorizedDocuments_QNAME = new QName("http://ws.openkm.com", "getCategorizedDocuments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.searchservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryParams }
     * 
     */
    public QueryParams createQueryParams() {
        return new QueryParams();
    }

    /**
     * Create an instance of {@link QueryParams.Properties }
     * 
     */
    public QueryParams.Properties createQueryParamsProperties() {
        return new QueryParams.Properties();
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link UpdateSearch }
     * 
     */
    public UpdateSearch createUpdateSearch() {
        return new UpdateSearch();
    }

    /**
     * Create an instance of {@link SaveSearch }
     * 
     */
    public SaveSearch createSaveSearch() {
        return new SaveSearch();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link GetKeywordMapResponse }
     * 
     */
    public GetKeywordMapResponse createGetKeywordMapResponse() {
        return new GetKeywordMapResponse();
    }

    /**
     * Create an instance of {@link FindByKeywords }
     * 
     */
    public FindByKeywords createFindByKeywords() {
        return new FindByKeywords();
    }

    /**
     * Create an instance of {@link GetAllSearchs }
     * 
     */
    public GetAllSearchs createGetAllSearchs() {
        return new GetAllSearchs();
    }

    /**
     * Create an instance of {@link FindByContentResponse }
     * 
     */
    public FindByContentResponse createFindByContentResponse() {
        return new FindByContentResponse();
    }

    /**
     * Create an instance of {@link GetKeywordMap }
     * 
     */
    public GetKeywordMap createGetKeywordMap() {
        return new GetKeywordMap();
    }

    /**
     * Create an instance of {@link FindByKeywordsResponse }
     * 
     */
    public FindByKeywordsResponse createFindByKeywordsResponse() {
        return new FindByKeywordsResponse();
    }

    /**
     * Create an instance of {@link DeleteSearch }
     * 
     */
    public DeleteSearch createDeleteSearch() {
        return new DeleteSearch();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetSearchResponse }
     * 
     */
    public GetSearchResponse createGetSearchResponse() {
        return new GetSearchResponse();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link GetCategorizedDocumentsResponse }
     * 
     */
    public GetCategorizedDocumentsResponse createGetCategorizedDocumentsResponse() {
        return new GetCategorizedDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetCategorizedDocuments }
     * 
     */
    public GetCategorizedDocuments createGetCategorizedDocuments() {
        return new GetCategorizedDocuments();
    }

    /**
     * Create an instance of {@link UpdateSearchResponse }
     * 
     */
    public UpdateSearchResponse createUpdateSearchResponse() {
        return new UpdateSearchResponse();
    }

    /**
     * Create an instance of {@link SaveSearchResponse }
     * 
     */
    public SaveSearchResponse createSaveSearchResponse() {
        return new SaveSearchResponse();
    }

    /**
     * Create an instance of {@link DeleteSearchResponse }
     * 
     */
    public DeleteSearchResponse createDeleteSearchResponse() {
        return new DeleteSearchResponse();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link GetAllSearchsResponse }
     * 
     */
    public GetAllSearchsResponse createGetAllSearchsResponse() {
        return new GetAllSearchsResponse();
    }

    /**
     * Create an instance of {@link FindByNameResponse }
     * 
     */
    public FindByNameResponse createFindByNameResponse() {
        return new FindByNameResponse();
    }

    /**
     * Create an instance of {@link FindByContent }
     * 
     */
    public FindByContent createFindByContent() {
        return new FindByContent();
    }

    /**
     * Create an instance of {@link FindByName }
     * 
     */
    public FindByName createFindByName() {
        return new FindByName();
    }

    /**
     * Create an instance of {@link GetSearch }
     * 
     */
    public GetSearch createGetSearch() {
        return new GetSearch();
    }

    /**
     * Create an instance of {@link ProposedQuerySent }
     * 
     */
    public ProposedQuerySent createProposedQuerySent() {
        return new ProposedQuerySent();
    }

    /**
     * Create an instance of {@link IntegerPair }
     * 
     */
    public IntegerPair createIntegerPair() {
        return new IntegerPair();
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
     * Create an instance of {@link Mail }
     * 
     */
    public Mail createMail() {
        return new Mail();
    }

    /**
     * Create an instance of {@link ProposedQueryReceived }
     * 
     */
    public ProposedQueryReceived createProposedQueryReceived() {
        return new ProposedQueryReceived();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link QueryParams.Properties.Entry }
     * 
     */
    public QueryParams.Properties.Entry createQueryParamsPropertiesEntry() {
        return new QueryParams.Properties.Entry();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getSearchResponse")
    public JAXBElement<GetSearchResponse> createGetSearchResponse(GetSearchResponse value) {
        return new JAXBElement<GetSearchResponse>(_GetSearchResponse_QNAME, GetSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeywordMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getKeywordMap")
    public JAXBElement<GetKeywordMap> createGetKeywordMap(GetKeywordMap value) {
        return new JAXBElement<GetKeywordMap>(_GetKeywordMap_QNAME, GetKeywordMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByContentResponse")
    public JAXBElement<FindByContentResponse> createFindByContentResponse(FindByContentResponse value) {
        return new JAXBElement<FindByContentResponse>(_FindByContentResponse_QNAME, FindByContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSearchs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAllSearchs")
    public JAXBElement<GetAllSearchs> createGetAllSearchs(GetAllSearchs value) {
        return new JAXBElement<GetAllSearchs>(_GetAllSearchs_QNAME, GetAllSearchs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByKeywordsResponse")
    public JAXBElement<FindByKeywordsResponse> createFindByKeywordsResponse(FindByKeywordsResponse value) {
        return new JAXBElement<FindByKeywordsResponse>(_FindByKeywordsResponse_QNAME, FindByKeywordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "deleteSearch")
    public JAXBElement<DeleteSearch> createDeleteSearch(DeleteSearch value) {
        return new JAXBElement<DeleteSearch>(_DeleteSearch_QNAME, DeleteSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByKeywords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByKeywords")
    public JAXBElement<FindByKeywords> createFindByKeywords(FindByKeywords value) {
        return new JAXBElement<FindByKeywords>(_FindByKeywords_QNAME, FindByKeywords.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeywordMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getKeywordMapResponse")
    public JAXBElement<GetKeywordMapResponse> createGetKeywordMapResponse(GetKeywordMapResponse value) {
        return new JAXBElement<GetKeywordMapResponse>(_GetKeywordMapResponse_QNAME, GetKeywordMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "saveSearch")
    public JAXBElement<SaveSearch> createSaveSearch(SaveSearch value) {
        return new JAXBElement<SaveSearch>(_SaveSearch_QNAME, SaveSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "updateSearch")
    public JAXBElement<UpdateSearch> createUpdateSearch(UpdateSearch value) {
        return new JAXBElement<UpdateSearch>(_UpdateSearch_QNAME, UpdateSearch.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "RepositoryException")
    public JAXBElement<RepositoryException> createRepositoryException(RepositoryException value) {
        return new JAXBElement<RepositoryException>(_RepositoryException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByContent")
    public JAXBElement<FindByContent> createFindByContent(FindByContent value) {
        return new JAXBElement<FindByContent>(_FindByContent_QNAME, FindByContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByNameResponse")
    public JAXBElement<FindByNameResponse> createFindByNameResponse(FindByNameResponse value) {
        return new JAXBElement<FindByNameResponse>(_FindByNameResponse_QNAME, FindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getSearch")
    public JAXBElement<GetSearch> createGetSearch(GetSearch value) {
        return new JAXBElement<GetSearch>(_GetSearch_QNAME, GetSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "findByName")
    public JAXBElement<FindByName> createFindByName(FindByName value) {
        return new JAXBElement<FindByName>(_FindByName_QNAME, FindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "deleteSearchResponse")
    public JAXBElement<DeleteSearchResponse> createDeleteSearchResponse(DeleteSearchResponse value) {
        return new JAXBElement<DeleteSearchResponse>(_DeleteSearchResponse_QNAME, DeleteSearchResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSearchsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAllSearchsResponse")
    public JAXBElement<GetAllSearchsResponse> createGetAllSearchsResponse(GetAllSearchsResponse value) {
        return new JAXBElement<GetAllSearchsResponse>(_GetAllSearchsResponse_QNAME, GetAllSearchsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "updateSearchResponse")
    public JAXBElement<UpdateSearchResponse> createUpdateSearchResponse(UpdateSearchResponse value) {
        return new JAXBElement<UpdateSearchResponse>(_UpdateSearchResponse_QNAME, UpdateSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "saveSearchResponse")
    public JAXBElement<SaveSearchResponse> createSaveSearchResponse(SaveSearchResponse value) {
        return new JAXBElement<SaveSearchResponse>(_SaveSearchResponse_QNAME, SaveSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategorizedDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategorizedDocumentsResponse")
    public JAXBElement<GetCategorizedDocumentsResponse> createGetCategorizedDocumentsResponse(GetCategorizedDocumentsResponse value) {
        return new JAXBElement<GetCategorizedDocumentsResponse>(_GetCategorizedDocumentsResponse_QNAME, GetCategorizedDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategorizedDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategorizedDocuments")
    public JAXBElement<GetCategorizedDocuments> createGetCategorizedDocuments(GetCategorizedDocuments value) {
        return new JAXBElement<GetCategorizedDocuments>(_GetCategorizedDocuments_QNAME, GetCategorizedDocuments.class, null, value);
    }

}
