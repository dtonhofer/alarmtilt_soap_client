
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactUserResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactUsers" type="{com.alarmtilt.webservice.soap.res.v3}contactUser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}listContactUserResultEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactUserResult", propOrder = {
    "contactUsers",
    "message",
    "result"
})
public class ListContactUserResult {

    @XmlElement(nillable = true)
    protected List<ContactUser> contactUsers;
    protected String message;
    @XmlSchemaType(name = "string")
    protected ListContactUserResultEnum result;

    /**
     * Gets the value of the contactUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactUser }
     * 
     * 
     */
    public List<ContactUser> getContactUsers() {
        if (contactUsers == null) {
            contactUsers = new ArrayList<ContactUser>();
        }
        return this.contactUsers;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactUserResultEnum }
     *     
     */
    public ListContactUserResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactUserResultEnum }
     *     
     */
    public void setResult(ListContactUserResultEnum value) {
        this.result = value;
    }

}
