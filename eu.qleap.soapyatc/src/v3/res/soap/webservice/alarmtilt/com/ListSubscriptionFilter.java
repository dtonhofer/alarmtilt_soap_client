
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listSubscriptionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listSubscriptionFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modificationDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="modificationDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberVoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriberTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionState" type="{com.alarmtilt.webservice.soap.res.v3}subscriptionState" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionValidationDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionValidationDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unsubscriptionValidationDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="unsubscriptionValidationDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listSubscriptionFilter", propOrder = {
    "dateFrom",
    "dateTo",
    "email",
    "firstname",
    "lastname",
    "modificationDateFrom",
    "modificationDateTo",
    "pageIndex",
    "pageSize",
    "phoneNumberSms",
    "phoneNumberVoice",
    "subscriberTokenId",
    "subscriptionState",
    "subscriptionValidationDateFrom",
    "subscriptionValidationDateTo",
    "tokenId",
    "unsubscriptionValidationDateFrom",
    "unsubscriptionValidationDateTo"
})
public class ListSubscriptionFilter {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    protected String email;
    protected String firstname;
    protected String lastname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDateTo;
    protected Integer pageIndex;
    protected Integer pageSize;
    protected String phoneNumberSms;
    protected String phoneNumberVoice;
    protected String subscriberTokenId;
    @XmlSchemaType(name = "string")
    protected SubscriptionState subscriptionState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionValidationDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionValidationDateTo;
    protected String tokenId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscriptionValidationDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unsubscriptionValidationDateTo;

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
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
     * Gets the value of the modificationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDateFrom() {
        return modificationDateFrom;
    }

    /**
     * Sets the value of the modificationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDateFrom(XMLGregorianCalendar value) {
        this.modificationDateFrom = value;
    }

    /**
     * Gets the value of the modificationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDateTo() {
        return modificationDateTo;
    }

    /**
     * Sets the value of the modificationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDateTo(XMLGregorianCalendar value) {
        this.modificationDateTo = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
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
     * Gets the value of the subscriptionValidationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionValidationDateFrom() {
        return subscriptionValidationDateFrom;
    }

    /**
     * Sets the value of the subscriptionValidationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionValidationDateFrom(XMLGregorianCalendar value) {
        this.subscriptionValidationDateFrom = value;
    }

    /**
     * Gets the value of the subscriptionValidationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionValidationDateTo() {
        return subscriptionValidationDateTo;
    }

    /**
     * Sets the value of the subscriptionValidationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionValidationDateTo(XMLGregorianCalendar value) {
        this.subscriptionValidationDateTo = value;
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
     * Gets the value of the unsubscriptionValidationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscriptionValidationDateFrom() {
        return unsubscriptionValidationDateFrom;
    }

    /**
     * Sets the value of the unsubscriptionValidationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscriptionValidationDateFrom(XMLGregorianCalendar value) {
        this.unsubscriptionValidationDateFrom = value;
    }

    /**
     * Gets the value of the unsubscriptionValidationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnsubscriptionValidationDateTo() {
        return unsubscriptionValidationDateTo;
    }

    /**
     * Sets the value of the unsubscriptionValidationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnsubscriptionValidationDateTo(XMLGregorianCalendar value) {
        this.unsubscriptionValidationDateTo = value;
    }

}
