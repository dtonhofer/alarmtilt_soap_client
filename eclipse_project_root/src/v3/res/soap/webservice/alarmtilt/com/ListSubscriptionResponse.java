
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listSubscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listSubscriptionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listSubscriptionResult" type="{com.alarmtilt.webservice.soap.res.v3}listSubscriptionResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listSubscriptionResponse", propOrder = {
    "listSubscriptionResult"
})
public class ListSubscriptionResponse {

    protected ListSubscriptionResult listSubscriptionResult;

    /**
     * Gets the value of the listSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListSubscriptionResult }
     *     
     */
    public ListSubscriptionResult getListSubscriptionResult() {
        return listSubscriptionResult;
    }

    /**
     * Sets the value of the listSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListSubscriptionResult }
     *     
     */
    public void setListSubscriptionResult(ListSubscriptionResult value) {
        this.listSubscriptionResult = value;
    }

}
