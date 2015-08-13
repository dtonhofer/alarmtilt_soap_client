
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateSubscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateSubscriptionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validateSubscriptionResult" type="{com.alarmtilt.webservice.soap.res.v3}validateSubscriptionResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSubscriptionResponse", propOrder = {
    "validateSubscriptionResult"
})
public class ValidateSubscriptionResponse {

    protected ValidateSubscriptionResult validateSubscriptionResult;

    /**
     * Gets the value of the validateSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateSubscriptionResult }
     *     
     */
    public ValidateSubscriptionResult getValidateSubscriptionResult() {
        return validateSubscriptionResult;
    }

    /**
     * Sets the value of the validateSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateSubscriptionResult }
     *     
     */
    public void setValidateSubscriptionResult(ValidateSubscriptionResult value) {
        this.validateSubscriptionResult = value;
    }

}
