
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listContactUserResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="PARAM_REQUIRED"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "listContactUserResultEnum")
@XmlEnum
public enum ListContactUserResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    PARAM_REQUIRED,
    AUTHORIZATION_ERROR;

    public String value() {
        return name();
    }

    public static ListContactUserResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
