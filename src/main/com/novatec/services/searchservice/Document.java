
package com.novatec.services.searchservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualVersion" type="{http://ws.openkm.com}version" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categories" type="{http://ws.openkm.com}folder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checkedOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cipherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convertibleToDxf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="convertibleToPdf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="convertibleToSwf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lockInfo" type="{http://ws.openkm.com}lockInfo" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://ws.openkm.com}note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permissions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscribed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subscriptors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = {
    "actualVersion",
    "author",
    "categories",
    "checkedOut",
    "cipherName",
    "convertibleToDxf",
    "convertibleToPdf",
    "convertibleToSwf",
    "created",
    "description",
    "keywords",
    "language",
    "lastModified",
    "lockInfo",
    "locked",
    "mimeType",
    "notes",
    "path",
    "permissions",
    "subscribed",
    "subscriptors",
    "title",
    "uuid"
})
public class Document {

    protected Version actualVersion;
    protected String author;
    @XmlElement(nillable = true)
    protected List<Folder> categories;
    protected boolean checkedOut;
    protected String cipherName;
    protected boolean convertibleToDxf;
    protected boolean convertibleToPdf;
    protected boolean convertibleToSwf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected String description;
    @XmlElement(nillable = true)
    protected List<String> keywords;
    protected String language;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    protected LockInfo lockInfo;
    protected boolean locked;
    protected String mimeType;
    @XmlElement(nillable = true)
    protected List<Note> notes;
    protected String path;
    protected int permissions;
    protected boolean subscribed;
    @XmlElement(nillable = true)
    protected List<String> subscriptors;
    protected String title;
    protected String uuid;

    /**
     * Gets the value of the actualVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getActualVersion() {
        return actualVersion;
    }

    /**
     * Sets the value of the actualVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setActualVersion(Version value) {
        this.actualVersion = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Folder }
     * 
     * 
     */
    public List<Folder> getCategories() {
        if (categories == null) {
            categories = new ArrayList<Folder>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the checkedOut property.
     * 
     */
    public boolean isCheckedOut() {
        return checkedOut;
    }

    /**
     * Sets the value of the checkedOut property.
     * 
     */
    public void setCheckedOut(boolean value) {
        this.checkedOut = value;
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

    /**
     * Gets the value of the convertibleToDxf property.
     * 
     */
    public boolean isConvertibleToDxf() {
        return convertibleToDxf;
    }

    /**
     * Sets the value of the convertibleToDxf property.
     * 
     */
    public void setConvertibleToDxf(boolean value) {
        this.convertibleToDxf = value;
    }

    /**
     * Gets the value of the convertibleToPdf property.
     * 
     */
    public boolean isConvertibleToPdf() {
        return convertibleToPdf;
    }

    /**
     * Sets the value of the convertibleToPdf property.
     * 
     */
    public void setConvertibleToPdf(boolean value) {
        this.convertibleToPdf = value;
    }

    /**
     * Gets the value of the convertibleToSwf property.
     * 
     */
    public boolean isConvertibleToSwf() {
        return convertibleToSwf;
    }

    /**
     * Sets the value of the convertibleToSwf property.
     * 
     */
    public void setConvertibleToSwf(boolean value) {
        this.convertibleToSwf = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the lockInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LockInfo }
     *     
     */
    public LockInfo getLockInfo() {
        return lockInfo;
    }

    /**
     * Sets the value of the lockInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockInfo }
     *     
     */
    public void setLockInfo(LockInfo value) {
        this.lockInfo = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     */
    public void setLocked(boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
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
     * Gets the value of the subscribed property.
     * 
     */
    public boolean isSubscribed() {
        return subscribed;
    }

    /**
     * Sets the value of the subscribed property.
     * 
     */
    public void setSubscribed(boolean value) {
        this.subscribed = value;
    }

    /**
     * Gets the value of the subscriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubscriptors() {
        if (subscriptors == null) {
            subscriptors = new ArrayList<String>();
        }
        return this.subscriptors;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
