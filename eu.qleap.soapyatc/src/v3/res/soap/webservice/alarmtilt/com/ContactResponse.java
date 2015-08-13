
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
 * <p>Java class for contactResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latestResponseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="qualifiedResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="replies" type="{com.alarmtilt.webservice.soap.res.v3}reply" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "contactResponse", propOrder = {
    "latestResponseDate",
    "qualifiedResponse",
    "replies",
    "replyValue"
})
public class ContactResponse {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestResponseDate;
    protected String qualifiedResponse;
    @XmlElement(nillable = true)
    protected List<Reply> replies;
    protected String replyValue;

    /**
     * Gets the value of the latestResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestResponseDate() {
        return latestResponseDate;
    }

    /**
     * Sets the value of the latestResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestResponseDate(XMLGregorianCalendar value) {
        this.latestResponseDate = value;
    }

    /**
     * Gets the value of the qualifiedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedResponse() {
        return qualifiedResponse;
    }

    /**
     * Sets the value of the qualifiedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedResponse(String value) {
        this.qualifiedResponse = value;
    }

    /**
     * Gets the value of the replies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reply }
     * 
     * 
     */
    public List<Reply> getReplies() {
        if (replies == null) {
            replies = new ArrayList<Reply>();
        }
        return this.replies;
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
