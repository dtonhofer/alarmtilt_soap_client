
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateSubscriptionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateSubscriptionParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addresses" type="{com.alarmtilt.webservice.soap.res.v3}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriberFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriberLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSubscriptionParam", propOrder = {
    "addresses",
    "subscriptionKey",
    "subscriptionTokenId",
    "suscriberFirstName",
    "suscriberLastName"
})
public class ValidateSubscriptionParam {

    @XmlElement(nillable = true)
    protected List<Address> addresses;
    protected String subscriptionKey;
    protected String subscriptionTokenId;
    protected String suscriberFirstName;
    protected String suscriberLastName;

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
     * Gets the value of the subscriptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionKey() {
        return subscriptionKey;
    }

    /**
     * Sets the value of the subscriptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionKey(String value) {
        this.subscriptionKey = value;
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

}
