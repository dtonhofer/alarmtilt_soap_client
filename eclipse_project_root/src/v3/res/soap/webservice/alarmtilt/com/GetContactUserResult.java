
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactUserResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactUser" type="{com.alarmtilt.webservice.soap.res.v3}contactUser" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}getContactUserResultEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactUserResult", propOrder = {
    "contactUser",
    "message",
    "result"
})
public class GetContactUserResult {

    protected ContactUser contactUser;
    protected String message;
    @XmlSchemaType(name = "string")
    protected GetContactUserResultEnum result;

    /**
     * Gets the value of the contactUser property.
     * 
     * @return
     *     possible object is
     *     {@link ContactUser }
     *     
     */
    public ContactUser getContactUser() {
        return contactUser;
    }

    /**
     * Sets the value of the contactUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactUser }
     *     
     */
    public void setContactUser(ContactUser value) {
        this.contactUser = value;
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
     *     {@link GetContactUserResultEnum }
     *     
     */
    public GetContactUserResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContactUserResultEnum }
     *     
     */
    public void setResult(GetContactUserResultEnum value) {
        this.result = value;
    }

}
