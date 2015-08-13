
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateSubscriptionResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="validateSubscriptionResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_SUBSCRIPTION_KEY"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_ID_OR_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_ALREADY_IN_STATE_VALIDATED"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_KEY_EXPIRED"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *     &lt;enumeration value="PARAM_REQUIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "validateSubscriptionResultEnum")
@XmlEnum
public enum ValidateSubscriptionResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    INVALID_SUBSCRIPTION_KEY,
    SUBSCRIPTION_ID_OR_MEDIA_REQUIRED,
    SUBSCRIPTION_NOT_FOUND,
    SUBSCRIPTION_ALREADY_IN_STATE_VALIDATED,
    SUBSCRIPTION_KEY_EXPIRED,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED;

    public String value() {
        return name();
    }

    public static ValidateSubscriptionResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
