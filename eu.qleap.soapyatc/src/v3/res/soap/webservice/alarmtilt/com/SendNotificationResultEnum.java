
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotificationResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sendNotificationResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="PARAM_REQUIRED"/&gt;
 *     &lt;enumeration value="MEDIA_NOT_SET"/&gt;
 *     &lt;enumeration value="LANGUAGE_NOT_SET"/&gt;
 *     &lt;enumeration value="SUBJECT_NOT_SET"/&gt;
 *     &lt;enumeration value="BODY_NOT_SET"/&gt;
 *     &lt;enumeration value="EMPTY_ADDRESS_LIST"/&gt;
 *     &lt;enumeration value="INVALID_ADDRESS_LIST"/&gt;
 *     &lt;enumeration value="INVALID_ATTACHMENT"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sendNotificationResultEnum")
@XmlEnum
public enum SendNotificationResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    PARAM_REQUIRED,
    MEDIA_NOT_SET,
    LANGUAGE_NOT_SET,
    SUBJECT_NOT_SET,
    BODY_NOT_SET,
    EMPTY_ADDRESS_LIST,
    INVALID_ADDRESS_LIST,
    INVALID_ATTACHMENT,
    AUTHORIZATION_ERROR;

    public String value() {
        return name();
    }

    public static SendNotificationResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
