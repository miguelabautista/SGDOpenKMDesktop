
package com.novatec.services.propertyservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setEncryption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setEncryption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cipherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEncryption", propOrder = {
    "token",
    "nodePath",
    "cipherName"
})
public class SetEncryption {

    protected String token;
    protected String nodePath;
    protected String cipherName;

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
     * Gets the value of the cipherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCipherName() {
        return cipherName;
    }

    /**
     * Sets the value of the cipherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCipherName(String value) {
        this.cipherName = value;
    }

}
