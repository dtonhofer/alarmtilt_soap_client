
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriptionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subscriptionState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUBSCRIPTION_REQUESTED"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_VALIDATED"/&gt;
 *     &lt;enumeration value="UNSUBSCRIPTION_REQUESTED"/&gt;
 *     &lt;enumeration value="UNSUBSCRIPTION_VALIDATED"/&gt;
 *     &lt;enumeration value="CONTACT_DELETED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "subscriptionState")
@XmlEnum
public enum SubscriptionState {

    SUBSCRIPTION_REQUESTED,
    SUBSCRIPTION_VALIDATED,
    UNSUBSCRIPTION_REQUESTED,
    UNSUBSCRIPTION_VALIDATED,
    CONTACT_DELETED;

    public String value() {
        return name();
    }

    public static SubscriptionState fromValue(String v) {
        return valueOf(v);
    }

}
