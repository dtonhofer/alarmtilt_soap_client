
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateSubscriptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateSubscriptionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}validateSubscriptionResultEnum" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{com.alarmtilt.webservice.soap.res.v3}subscription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSubscriptionResult", propOrder = {
    "result",
    "subscription"
})
public class ValidateSubscriptionResult {

    @XmlSchemaType(name = "string")
    protected ValidateSubscriptionResultEnum result;
    protected Subscription subscription;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateSubscriptionResultEnum }
     *     
     */
    public ValidateSubscriptionResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateSubscriptionResultEnum }
     *     
     */
    public void setResult(ValidateSubscriptionResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

}
