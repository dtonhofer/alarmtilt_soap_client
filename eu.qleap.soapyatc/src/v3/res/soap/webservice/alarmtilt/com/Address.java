
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{com.alarmtilt.webservice.soap.res.v3}addressActionType" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{com.alarmtilt.webservice.soap.res.v3}mediaOrganisationalType" minOccurs="0"/&gt;
 *         &lt;element name="media" type="{com.alarmtilt.webservice.soap.res.v3}mediaType" minOccurs="0"/&gt;
 *         &lt;element name="postalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "action",
    "address",
    "location",
    "media",
    "postalCity",
    "postalCode",
    "postalCountry",
    "postalStreet"
})
public class Address {

    @XmlSchemaType(name = "string")
    protected AddressActionType action;
    protected String address;
    @XmlSchemaType(name = "string")
    protected MediaOrganisationalType location;
    @XmlSchemaType(name = "string")
    protected MediaType media;
    protected String postalCity;
    protected String postalCode;
    protected String postalCountry;
    protected String postalStreet;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AddressActionType }
     *     
     */
    public AddressActionType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressActionType }
     *     
     */
    public void setAction(AddressActionType value) {
        this.action = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link MediaOrganisationalType }
     *     
     */
    public MediaOrganisationalType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaOrganisationalType }
     *     
     */
    public void setLocation(MediaOrganisationalType value) {
        this.location = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMedia(MediaType value) {
        this.media = value;
    }

    /**
     * Gets the value of the postalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCity() {
        return postalCity;
    }

    /**
     * Sets the value of the postalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCity(String value) {
        this.postalCity = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCountry() {
        return postalCountry;
    }

    /**
     * Sets the value of the postalCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCountry(String value) {
        this.postalCountry = value;
    }

    /**
     * Gets the value of the postalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalStreet() {
        return postalStreet;
    }

    /**
     * Sets the value of the postalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalStreet(String value) {
        this.postalStreet = value;
    }

}
