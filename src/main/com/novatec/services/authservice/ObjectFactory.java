
package com.novatec.services.authservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.novatec.services.authservice package. 
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
    private final static QName _LogoutResponse_QNAME = new QName("http://ws.openkm.com", "logoutResponse");
    private final static QName _GetMail_QNAME = new QName("http://ws.openkm.com", "getMail");
    private final static QName _GetGrantedUsers_QNAME = new QName("http://ws.openkm.com", "getGrantedUsers");
    private final static QName _Login_QNAME = new QName("http://ws.openkm.com", "login");
    private final static QName _GrantUser_QNAME = new QName("http://ws.openkm.com", "grantUser");
    private final static QName _GetNameResponse_QNAME = new QName("http://ws.openkm.com", "getNameResponse");
    private final static QName _GrantUserResponse_QNAME = new QName("http://ws.openkm.com", "grantUserResponse");
    private final static QName _GetMailResponse_QNAME = new QName("http://ws.openkm.com", "getMailResponse");
    private final static QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private final static QName _GetGrantedUsersResponse_QNAME = new QName("http://ws.openkm.com", "getGrantedUsersResponse");
    private final static QName _GrantRoleResponse_QNAME = new QName("http://ws.openkm.com", "grantRoleResponse");
    private final static QName _GetUsersByRoleResponse_QNAME = new QName("http://ws.openkm.com", "getUsersByRoleResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://ws.openkm.com", "getUsersResponse");
    private final static QName _GetUsersByRole_QNAME = new QName("http://ws.openkm.com", "getUsersByRole");
    private final static QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private final static QName _GetUsers_QNAME = new QName("http://ws.openkm.com", "getUsers");
    private final static QName _RevokeUser_QNAME = new QName("http://ws.openkm.com", "revokeUser");
    private final static QName _GetName_QNAME = new QName("http://ws.openkm.com", "getName");
    private final static QName _GetRolesResponse_QNAME = new QName("http://ws.openkm.com", "getRolesResponse");
    private final static QName _Logout_QNAME = new QName("http://ws.openkm.com", "logout");
    private final static QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private final static QName _RevokeRole_QNAME = new QName("http://ws.openkm.com", "revokeRole");
    private final static QName _GrantRole_QNAME = new QName("http://ws.openkm.com", "grantRole");
    private final static QName _GetRoles_QNAME = new QName("http://ws.openkm.com", "getRoles");
    private final static QName _PrincipalAdapterException_QNAME = new QName("http://ws.openkm.com", "PrincipalAdapterException");
    private final static QName _RevokeUserResponse_QNAME = new QName("http://ws.openkm.com", "revokeUserResponse");
    private final static QName _GetRolesByUserResponse_QNAME = new QName("http://ws.openkm.com", "getRolesByUserResponse");
    private final static QName _GetGrantedRoles_QNAME = new QName("http://ws.openkm.com", "getGrantedRoles");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.openkm.com", "loginResponse");
    private final static QName _RevokeRoleResponse_QNAME = new QName("http://ws.openkm.com", "revokeRoleResponse");
    private final static QName _GetGrantedRolesResponse_QNAME = new QName("http://ws.openkm.com", "getGrantedRolesResponse");
    private final static QName _GetRolesByUser_QNAME = new QName("http://ws.openkm.com", "getRolesByUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.novatec.services.authservice
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
     * Create an instance of {@link GetUsersByRole }
     * 
     */
    public GetUsersByRole createGetUsersByRole() {
        return new GetUsersByRole();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetUsersByRoleResponse }
     * 
     */
    public GetUsersByRoleResponse createGetUsersByRoleResponse() {
        return new GetUsersByRoleResponse();
    }

    /**
     * Create an instance of {@link GrantRoleResponse }
     * 
     */
    public GrantRoleResponse createGrantRoleResponse() {
        return new GrantRoleResponse();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link GetGrantedUsersResponse }
     * 
     */
    public GetGrantedUsersResponse createGetGrantedUsersResponse() {
        return new GetGrantedUsersResponse();
    }

    /**
     * Create an instance of {@link GetMailResponse }
     * 
     */
    public GetMailResponse createGetMailResponse() {
        return new GetMailResponse();
    }

    /**
     * Create an instance of {@link GrantUserResponse }
     * 
     */
    public GrantUserResponse createGrantUserResponse() {
        return new GrantUserResponse();
    }

    /**
     * Create an instance of {@link GrantUser }
     * 
     */
    public GrantUser createGrantUser() {
        return new GrantUser();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetMail }
     * 
     */
    public GetMail createGetMail() {
        return new GetMail();
    }

    /**
     * Create an instance of {@link GetGrantedUsers }
     * 
     */
    public GetGrantedUsers createGetGrantedUsers() {
        return new GetGrantedUsers();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetGrantedRolesResponse }
     * 
     */
    public GetGrantedRolesResponse createGetGrantedRolesResponse() {
        return new GetGrantedRolesResponse();
    }

    /**
     * Create an instance of {@link GetRolesByUser }
     * 
     */
    public GetRolesByUser createGetRolesByUser() {
        return new GetRolesByUser();
    }

    /**
     * Create an instance of {@link RevokeRoleResponse }
     * 
     */
    public RevokeRoleResponse createRevokeRoleResponse() {
        return new RevokeRoleResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetGrantedRoles }
     * 
     */
    public GetGrantedRoles createGetGrantedRoles() {
        return new GetGrantedRoles();
    }

    /**
     * Create an instance of {@link RevokeUserResponse }
     * 
     */
    public RevokeUserResponse createRevokeUserResponse() {
        return new RevokeUserResponse();
    }

    /**
     * Create an instance of {@link GetRolesByUserResponse }
     * 
     */
    public GetRolesByUserResponse createGetRolesByUserResponse() {
        return new GetRolesByUserResponse();
    }

    /**
     * Create an instance of {@link PrincipalAdapterException }
     * 
     */
    public PrincipalAdapterException createPrincipalAdapterException() {
        return new PrincipalAdapterException();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GrantRole }
     * 
     */
    public GrantRole createGrantRole() {
        return new GrantRole();
    }

    /**
     * Create an instance of {@link RevokeRole }
     * 
     */
    public RevokeRole createRevokeRole() {
        return new RevokeRole();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link RevokeUser }
     * 
     */
    public RevokeUser createRevokeUser() {
        return new RevokeUser();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link IntegerPair }
     * 
     */
    public IntegerPair createIntegerPair() {
        return new IntegerPair();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMail")
    public JAXBElement<GetMail> createGetMail(GetMail value) {
        return new JAXBElement<GetMail>(_GetMail_QNAME, GetMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedUsers")
    public JAXBElement<GetGrantedUsers> createGetGrantedUsers(GetGrantedUsers value) {
        return new JAXBElement<GetGrantedUsers>(_GetGrantedUsers_QNAME, GetGrantedUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantUser")
    public JAXBElement<GrantUser> createGrantUser(GrantUser value) {
        return new JAXBElement<GrantUser>(_GrantUser_QNAME, GrantUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantUserResponse")
    public JAXBElement<GrantUserResponse> createGrantUserResponse(GrantUserResponse value) {
        return new JAXBElement<GrantUserResponse>(_GrantUserResponse_QNAME, GrantUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailResponse")
    public JAXBElement<GetMailResponse> createGetMailResponse(GetMailResponse value) {
        return new JAXBElement<GetMailResponse>(_GetMailResponse_QNAME, GetMailResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedUsersResponse")
    public JAXBElement<GetGrantedUsersResponse> createGetGrantedUsersResponse(GetGrantedUsersResponse value) {
        return new JAXBElement<GetGrantedUsersResponse>(_GetGrantedUsersResponse_QNAME, GetGrantedUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantRoleResponse")
    public JAXBElement<GrantRoleResponse> createGrantRoleResponse(GrantRoleResponse value) {
        return new JAXBElement<GrantRoleResponse>(_GrantRoleResponse_QNAME, GrantRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersByRoleResponse")
    public JAXBElement<GetUsersByRoleResponse> createGetUsersByRoleResponse(GetUsersByRoleResponse value) {
        return new JAXBElement<GetUsersByRoleResponse>(_GetUsersByRoleResponse_QNAME, GetUsersByRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersByRole")
    public JAXBElement<GetUsersByRole> createGetUsersByRole(GetUsersByRole value) {
        return new JAXBElement<GetUsersByRole>(_GetUsersByRole_QNAME, GetUsersByRole.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeUser")
    public JAXBElement<RevokeUser> createRevokeUser(RevokeUser value) {
        return new JAXBElement<RevokeUser>(_RevokeUser_QNAME, RevokeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeRole")
    public JAXBElement<RevokeRole> createRevokeRole(RevokeRole value) {
        return new JAXBElement<RevokeRole>(_RevokeRole_QNAME, RevokeRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantRole")
    public JAXBElement<GrantRole> createGrantRole(GrantRole value) {
        return new JAXBElement<GrantRole>(_GrantRole_QNAME, GrantRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeUserResponse")
    public JAXBElement<RevokeUserResponse> createRevokeUserResponse(RevokeUserResponse value) {
        return new JAXBElement<RevokeUserResponse>(_RevokeUserResponse_QNAME, RevokeUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesByUserResponse")
    public JAXBElement<GetRolesByUserResponse> createGetRolesByUserResponse(GetRolesByUserResponse value) {
        return new JAXBElement<GetRolesByUserResponse>(_GetRolesByUserResponse_QNAME, GetRolesByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedRoles")
    public JAXBElement<GetGrantedRoles> createGetGrantedRoles(GetGrantedRoles value) {
        return new JAXBElement<GetGrantedRoles>(_GetGrantedRoles_QNAME, GetGrantedRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeRoleResponse")
    public JAXBElement<RevokeRoleResponse> createRevokeRoleResponse(RevokeRoleResponse value) {
        return new JAXBElement<RevokeRoleResponse>(_RevokeRoleResponse_QNAME, RevokeRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedRolesResponse")
    public JAXBElement<GetGrantedRolesResponse> createGetGrantedRolesResponse(GetGrantedRolesResponse value) {
        return new JAXBElement<GetGrantedRolesResponse>(_GetGrantedRolesResponse_QNAME, GetGrantedRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesByUser")
    public JAXBElement<GetRolesByUser> createGetRolesByUser(GetRolesByUser value) {
        return new JAXBElement<GetRolesByUser>(_GetRolesByUser_QNAME, GetRolesByUser.class, null, value);
    }

}
