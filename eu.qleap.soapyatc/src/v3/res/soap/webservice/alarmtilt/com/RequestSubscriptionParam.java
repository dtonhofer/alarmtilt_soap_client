
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestSubscriptionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestSubscriptionParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{com.alarmtilt.webservice.soap.res.v3}subscriptionActionType" minOccurs="0"/&gt;
 *         &lt;element name="addresses" type="{com.alarmtilt.webservice.soap.res.v3}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attributes" type="{com.alarmtilt.webservice.soap.res.v3}attributeVariableValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{com.alarmtilt.webservice.soap.res.v3}supportedLanguage" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriberFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriberLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestSubscriptionParam", propOrder = {
    "action",
    "addresses",
    "attributes",
    "language",
    "subscriptionTokenId",
    "suscriberFirstName",
    "suscriberLastName",
    "validationRequired"
})
public class RequestSubscriptionParam {

    @XmlSchemaType(name = "string")
    protected SubscriptionActionType action;
    @XmlElement(nillable = true)
    protected List<Address> addresses;
    @XmlElement(nillable = true)
    protected List<AttributeVariableValue> attributes;
    @XmlSchemaType(name = "string")
    protected SupportedLanguage language;
    protected String subscriptionTokenId;
    protected String suscriberFirstName;
    protected String suscriberLastName;
    protected boolean validationRequired;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionActionType }
     *     
     */
    public SubscriptionActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionActionType }
     *     
     */
    public void setAction(SubscriptionActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeVariableValue }
     * 
     * 
     */
    public List<AttributeVariableValue> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<AttributeVariableValue>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedLanguage }
     *     
     */
    public SupportedLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedLanguage }
     *     
     */
    public void setLanguage(SupportedLanguage value) {
        this.language = value;
    }

    /**
     * Gets the value of the subscriptionTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionTokenId() {
        return subscriptionTokenId;
    }

    /**
     * Sets the value of the subscriptionTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionTokenId(String value) {
        this.subscriptionTokenId = value;
    }

    /**
     * Gets the value of the suscriberFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuscriberFirstName() {
        return suscriberFirstName;
    }

    /**
     * Sets the value of the suscriberFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuscriberFirstName(String value) {
        this.suscriberFirstName = value;
    }

    /**
     * Gets the value of the suscriberLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuscriberLastName() {
        return suscriberLastName;
    }

    /**
     * Sets the value of the suscriberLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuscriberLastName(String value) {
        this.suscriberLastName = value;
    }

    /**
     * Gets the value of the validationRequired property.
     * 
     */
    public boolean isValidationRequired() {
        return validationRequired;
    }

    /**
     * Sets the value of the validationRequired property.
     * 
     */
    public void setValidationRequired(boolean value) {
        this.validationRequired = value;
    }

}
