
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactUserResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getContactUserResult" type="{com.alarmtilt.webservice.soap.res.v3}getContactUserResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactUserResponse", propOrder = {
    "getContactUserResult"
})
public class GetContactUserResponse {

    protected GetContactUserResult getContactUserResult;

    /**
     * Gets the value of the getContactUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetContactUserResult }
     *     
     */
    public GetContactUserResult getGetContactUserResult() {
        return getContactUserResult;
    }

    /**
     * Sets the value of the getContactUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetContactUserResult }
     *     
     */
    public void setGetContactUserResult(GetContactUserResult value) {
        this.getContactUserResult = value;
    }

}
