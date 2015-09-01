
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTooLate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="media" type="{com.alarmtilt.webservice.soap.res.v3}mediaType" minOccurs="0"/&gt;
 *         &lt;element name="replyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="replyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reply", propOrder = {
    "isTooLate",
    "media",
    "replyDate",
    "replyValue"
})
public class Reply {

    protected Boolean isTooLate;
    @XmlSchemaType(name = "string")
    protected MediaType media;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar replyDate;
    protected String replyValue;

    /**
     * Gets the value of the isTooLate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTooLate() {
        return isTooLate;
    }

    /**
     * Sets the value of the isTooLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTooLate(Boolean value) {
        this.isTooLate = value;
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
     * Gets the value of the replyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReplyDate() {
        return replyDate;
    }

    /**
     * Sets the value of the replyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReplyDate(XMLGregorianCalendar value) {
        this.replyDate = value;
    }

    /**
     * Gets the value of the replyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyValue() {
        return replyValue;
    }

    /**
     * Sets the value of the replyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyValue(String value) {
        this.replyValue = value;
    }

}
