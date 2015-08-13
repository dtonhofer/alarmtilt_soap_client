
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for subscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberVoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionKeySendingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionKeyValidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionState" type="{com.alarmtilt.webservice.soap.res.v3}subscriptionState" minOccurs="0"/&gt;
 *         &lt;element name="tokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transientDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unsubscriptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unsubscriptionKeySendingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unsubscriptionKeyValidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscription", propOrder = {
    "creationDate",
    "email",
    "firstname",
    "id",
    "lastname",
    "name",
    "phoneNumberSms",
    "phoneNumberVoice",
    "subscriberTokenId",
    "subscriptionDate",
    "subscriptionKeySendingDate",
    "subscriptionKeyValidDate",
    "subscriptionState",
    "tokenId",
    "transientDescription",
    "unsubscriptionDate",
    "unsubscriptionKeySendingDate",
    "unsubscriptionKeyValidDate"
})
public class Subscription {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String email;
    protected String firstname;
    protected Integer id;
    protected String lastname;
    protected String name;
    protected String phoneNumberSms;
    protected String phoneNumberVoice;
    protected String subscriberTokenId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionKeySendingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionKeyValidDate;
    @XmlSchemaType(name = "string")
    protected SubscriptionState subscriptionState;
    protected String tokenId;
    protected String transientDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscriptionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscriptionKeySendingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscriptionKeyValidDate;

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
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
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
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
     * Gets the value of the phoneNumberSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberSms() {
        return phoneNumberSms;
    }

    /**
     * Sets the value of the phoneNumberSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberSms(String value) {
        this.phoneNumberSms = value;
    }

    /**
     * Gets the value of the phoneNumberVoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberVoice() {
        return phoneNumberVoice;
    }

    /**
     * Sets the value of the phoneNumberVoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberVoice(String value) {
        this.phoneNumberVoice = value;
    }

    /**
     * Gets the value of the subscriberTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberTokenId() {
        return subscriberTokenId;
    }

    /**
     * Sets the value of the subscriberTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberTokenId(String value) {
        this.subscriberTokenId = value;
    }

    /**
     * Gets the value of the subscriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionDate() {
        return subscriptionDate;
    }

    /**
     * Sets the value of the subscriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionDate(XMLGregorianCalendar value) {
        this.subscriptionDate = value;
    }

    /**
     * Gets the value of the subscriptionKeySendingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionKeySendingDate() {
        return subscriptionKeySendingDate;
    }

    /**
     * Sets the value of the subscriptionKeySendingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionKeySendingDate(XMLGregorianCalendar value) {
        this.subscriptionKeySendingDate = value;
    }

    /**
     * Gets the value of the subscriptionKeyValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionKeyValidDate() {
        return subscriptionKeyValidDate;
    }

    /**
     * Sets the value of the subscriptionKeyValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionKeyValidDate(XMLGregorianCalendar value) {
        this.subscriptionKeyValidDate = value;
    }

    /**
     * Gets the value of the subscriptionState property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionState }
     *     
     */
    public SubscriptionState getSubscriptionState() {
        return subscriptionState;
    }

    /**
     * Sets the value of the subscriptionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionState }
     *     
     */
    public void setSubscriptionState(SubscriptionState value) {
        this.subscriptionState = value;
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
     * Gets the value of the transientDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransientDescription() {
        return transientDescription;
    }

    /**
     * Sets the value of the transientDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransientDescription(String value) {
        this.transientDescription = value;
    }

    /**
     * Gets the value of the unsubscriptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscriptionDate() {
        return unsubscriptionDate;
    }

    /**
     * Sets the value of the unsubscriptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscriptionDate(XMLGregorianCalendar value) {
        this.unsubscriptionDate = value;
    }

    /**
     * Gets the value of the unsubscriptionKeySendingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscriptionKeySendingDate() {
        return unsubscriptionKeySendingDate;
    }

    /**
     * Sets the value of the unsubscriptionKeySendingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscriptionKeySendingDate(XMLGregorianCalendar value) {
        this.unsubscriptionKeySendingDate = value;
    }

    /**
     * Gets the value of the unsubscriptionKeyValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscriptionKeyValidDate() {
        return unsubscriptionKeyValidDate;
    }

    /**
     * Sets the value of the unsubscriptionKeyValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscriptionKeyValidDate(XMLGregorianCalendar value) {
        this.unsubscriptionKeyValidDate = value;
    }

}
