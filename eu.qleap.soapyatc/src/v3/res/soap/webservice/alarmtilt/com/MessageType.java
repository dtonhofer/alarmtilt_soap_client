
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="ALERT"/&gt;
 *     &lt;enumeration value="CONFIRM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {

    INFO,
    ALERT,
    CONFIRM;

    public String value() {
        return name();
    }

    public static MessageType fromValue(String v) {
        return valueOf(v);
    }

}
