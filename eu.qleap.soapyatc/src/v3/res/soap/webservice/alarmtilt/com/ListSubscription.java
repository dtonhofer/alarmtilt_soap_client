
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/&gt;
 *         &lt;element name="listSubscriptionParam" type="{com.alarmtilt.webservice.soap.res.v3}listSubscriptionParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listSubscription", propOrder = {
    "authParam",
    "listSubscriptionParam"
})
public class ListSubscription {

    protected AuthParam authParam;
    protected ListSubscriptionParam listSubscriptionParam;

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
     * Gets the value of the listSubscriptionParam property.
     * 
     * @return
     *     possible object is
     *     {@link ListSubscriptionParam }
     *     
     */
    public ListSubscriptionParam getListSubscriptionParam() {
        return listSubscriptionParam;
    }

    /**
     * Sets the value of the listSubscriptionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSubscriptionParam }
     *     
     */
    public void setListSubscriptionParam(ListSubscriptionParam value) {
        this.listSubscriptionParam = value;
    }

}
