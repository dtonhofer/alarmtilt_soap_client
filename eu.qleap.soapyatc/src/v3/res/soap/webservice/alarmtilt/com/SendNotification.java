
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/&gt;
 *         &lt;element name="sendNotificationParam" type="{com.alarmtilt.webservice.soap.res.v3}sendNotificationParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotification", propOrder = {
    "authParam",
    "sendNotificationParam"
})
public class SendNotification {

    protected AuthParam authParam;
    protected SendNotificationParam sendNotificationParam;

    /**
     * Gets the value of the authParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthParam }
     *     
     */
    public AuthParam getAuthParam() {
        return authParam;
    }

    /**
     * Sets the value of the authParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthParam }
     *     
     */
    public void setAuthParam(AuthParam value) {
        this.authParam = value;
    }

    /**
     * Gets the value of the sendNotificationParam property.
     * 
     * @return
     *     possible object is
     *     {@link SendNotificationParam }
     *     
     */
    public SendNotificationParam getSendNotificationParam() {
        return sendNotificationParam;
    }

    /**
     * Sets the value of the sendNotificationParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendNotificationParam }
     *     
     */
    public void setSendNotificationParam(SendNotificationParam value) {
        this.sendNotificationParam = value;
    }

}
