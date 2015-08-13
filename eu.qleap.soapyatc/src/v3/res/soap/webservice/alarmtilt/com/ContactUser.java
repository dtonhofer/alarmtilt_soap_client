
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactUserAddressPostal" type="{com.alarmtilt.webservice.soap.res.v3}contactUserAddressPostal" minOccurs="0"/&gt;
 *         &lt;element name="contactUserAttributes" type="{com.alarmtilt.webservice.soap.res.v3}contactUserAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactUserMedias" type="{com.alarmtilt.webservice.soap.res.v3}contactUserMedia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="isSubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="latestSubscriptionTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="managementUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactUser", propOrder = {
    "contactUserAddressPostal",
    "contactUserAttributes",
    "contactUserMedias",
    "creationDate",
    "customerName",
    "id",
    "isSubscriber",
    "latestSubscriptionTokenId",
    "managementUnitName",
    "name",
    "tokenId",
    "userFirstName",
    "userLastName"
})
public class ContactUser {

    protected ContactUserAddressPostal contactUserAddressPostal;
    @XmlElement(nillable = true)
    protected List<ContactUserAttribute> contactUserAttributes;
    @XmlElement(nillable = true)
    protected List<ContactUserMedia> contactUserMedias;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String customerName;
    protected Integer id;
    protected Boolean isSubscriber;
    protected String latestSubscriptionTokenId;
    protected String managementUnitName;
    protected String name;
    protected String tokenId;
    protected String userFirstName;
    protected String userLastName;

    /**
     * Gets the value of the contactUserAddressPostal property.
     * 
     * @return
     *     possible object is
     *     {@link ContactUserAddressPostal }
     *     
     */
    public ContactUserAddressPostal getContactUserAddressPostal() {
        return contactUserAddressPostal;
    }

    /**
     * Sets the value of the contactUserAddressPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactUserAddressPostal }
     *     
     */
    public void setContactUserAddressPostal(ContactUserAddressPostal value) {
        this.contactUserAddressPostal = value;
    }

    /**
     * Gets the value of the contactUserAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactUserAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactUserAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactUserAttribute }
     * 
     * 
     */
    public List<ContactUserAttribute> getContactUserAttributes() {
        if (contactUserAttributes == null) {
            contactUserAttributes = new ArrayList<ContactUserAttribute>();
        }
        return this.contactUserAttributes;
    }

    /**
     * Gets the value of the contactUserMedias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactUserMedias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactUserMedias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactUserMedia }
     * 
     * 
     */
    public List<ContactUserMedia> getContactUserMedias() {
        if (contactUserMedias == null) {
            contactUserMedias = new ArrayList<ContactUserMedia>();
        }
        return this.contactUserMedias;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isSubscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubscriber() {
        return isSubscriber;
    }

    /**
     * Sets the value of the isSubscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubscriber(Boolean value) {
        this.isSubscriber = value;
    }

    /**
     * Gets the value of the latestSubscriptionTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestSubscriptionTokenId() {
        return latestSubscriptionTokenId;
    }

    /**
     * Sets the value of the latestSubscriptionTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestSubscriptionTokenId(String value) {
        this.latestSubscriptionTokenId = value;
    }

    /**
     * Gets the value of the managementUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementUnitName() {
        return managementUnitName;
    }

    /**
     * Sets the value of the managementUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementUnitName(String value) {
        this.managementUnitName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the userLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Sets the value of the userLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLastName(String value) {
        this.userLastName = value;
    }

}
