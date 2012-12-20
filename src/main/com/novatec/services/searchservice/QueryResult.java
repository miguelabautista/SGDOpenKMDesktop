
package com.novatec.services.searchservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment" type="{http://ws.openkm.com}document" minOccurs="0"/>
 *         &lt;element name="document" type="{http://ws.openkm.com}document" minOccurs="0"/>
 *         &lt;element name="excerpt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folder" type="{http://ws.openkm.com}folder" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://ws.openkm.com}mail" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryResult", propOrder = {
    "attachment",
    "document",
    "excerpt",
    "folder",
    "mail",
    "score"
})
public class QueryResult {

    protected Document attachment;
    protected Document document;
    protected String excerpt;
    protected Folder folder;
    protected Mail mail;
    protected long score;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setAttachment(Document value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the excerpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     * Sets the value of the excerpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcerpt(String value) {
        this.excerpt = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link Folder }
     *     
     */
    public Folder getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folder }
     *     
     */
    public void setFolder(Folder value) {
        this.folder = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link Mail }
     *     
     */
    public Mail getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mail }
     *     
     */
    public void setMail(Mail value) {
        this.mail = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public long getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(long value) {
        this.score = value;
    }

}
