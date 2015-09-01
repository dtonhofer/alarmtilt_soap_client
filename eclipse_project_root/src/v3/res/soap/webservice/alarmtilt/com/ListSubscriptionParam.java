
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listSubscriptionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listSubscriptionParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionFilter" type="{com.alarmtilt.webservice.soap.res.v3}listSubscriptionFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listSubscriptionParam", propOrder = {
    "subscriptionFilter"
})
public class ListSubscriptionParam {

    protected ListSubscriptionFilter subscriptionFilter;

    /**
     * Gets the value of the subscriptionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ListSubscriptionFilter }
     *     
     */
    public ListSubscriptionFilter getSubscriptionFilter() {
        return subscriptionFilter;
    }

    /**
     * Sets the value of the subscriptionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSubscriptionFilter }
     *     
     */
    public void setSubscriptionFilter(ListSubscriptionFilter value) {
        this.subscriptionFilter = value;
    }

}
