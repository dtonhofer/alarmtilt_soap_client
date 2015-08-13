
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactUserMedia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactUserMedia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confidential" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="location" type="{com.alarmtilt.webservice.soap.res.v3}mediaOrganisationalType" minOccurs="0"/&gt;
 *         &lt;element name="media" type="{com.alarmtilt.webservice.soap.res.v3}mediaType" minOccurs="0"/&gt;
 *         &lt;element name="mediaDeviceType" type="{com.alarmtilt.webservice.soap.res.v3}mediaDeviceType" minOccurs="0"/&gt;
 *         &lt;element name="timeoutInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactUserMedia", propOrder = {
    "address",
    "confidential",
    "location",
    "media",
    "mediaDeviceType",
    "timeoutInterval"
})
public class ContactUserMedia {

    protected String address;
    protected boolean confidential;
    @XmlSchemaType(name = "string")
    protected MediaOrganisationalType location;
    @XmlSchemaType(name = "string")
    protected MediaType media;
    @XmlSchemaType(name = "string")
    protected MediaDeviceType mediaDeviceType;
    protected int timeoutInterval;

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
     * Gets the value of the confidential property.
     * 
     */
    public boolean isConfidential() {
        return confidential;
    }

    /**
     * Sets the value of the confidential property.
     * 
     */
    public void setConfidential(boolean value) {
        this.confidential = value;
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
     * Gets the value of the mediaDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDeviceType }
     *     
     */
    public MediaDeviceType getMediaDeviceType() {
        return mediaDeviceType;
    }

    /**
     * Sets the value of the mediaDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDeviceType }
     *     
     */
    public void setMediaDeviceType(MediaDeviceType value) {
        this.mediaDeviceType = value;
    }

    /**
     * Gets the value of the timeoutInterval property.
     * 
     */
    public int getTimeoutInterval() {
        return timeoutInterval;
    }

    /**
     * Sets the value of the timeoutInterval property.
     * 
     */
    public void setTimeoutInterval(int value) {
        this.timeoutInterval = value;
    }

}
