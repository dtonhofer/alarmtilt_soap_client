
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestSubscriptionResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="requestSubscriptionResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_PARAMETER_REQUIRED"/&gt;
 *     &lt;enumeration value="FIRSTNAME_REQUIRED"/&gt;
 *     &lt;enumeration value="LASTNAME_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_EXISTS_WITH_SAME_NAME"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_EXISTS_WITH_ONE_OF_ADDRESS"/&gt;
 *     &lt;enumeration value="SUBSCRIBER_NOT_EXISTS"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "requestSubscriptionResultEnum")
@XmlEnum
public enum RequestSubscriptionResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    SUBSCRIPTION_PARAMETER_REQUIRED,
    FIRSTNAME_REQUIRED,
    LASTNAME_REQUIRED,
    AT_LEAST_ONE_MEDIA_REQUIRED,
    SUBSCRIPTION_EXISTS_WITH_SAME_NAME,
    SUBSCRIPTION_EXISTS_WITH_ONE_OF_ADDRESS,
    SUBSCRIBER_NOT_EXISTS,
    AUTHORIZATION_ERROR;

    public String value() {
        return name();
    }

    public static RequestSubscriptionResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
