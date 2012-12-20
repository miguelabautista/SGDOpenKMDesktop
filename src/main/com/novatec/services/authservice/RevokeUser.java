
package com.novatec.services.authservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revokeUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokeUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokeUser", propOrder = {
    "token",
    "nodePath",
    "user",
    "permissions",
    "recursive"
})
public class RevokeUser {

    protected String token;
    protected String nodePath;
    protected String user;
    protected int permissions;
    protected boolean recursive;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the nodePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodePath() {
        return nodePath;
    }

    /**
     * Sets the value of the nodePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodePath(String value) {
        this.nodePath = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     */
    public int getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     */
    public void setPermissions(int value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the recursive property.
     * 
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Sets the value of the recursive property.
     * 
     */
    public void setRecursive(boolean value) {
        this.recursive = value;
    }

}
