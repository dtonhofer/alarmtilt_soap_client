
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="notificationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *     &lt;enumeration value="DELIVERED"/&gt;
 *     &lt;enumeration value="READ"/&gt;
 *     &lt;enumeration value="REPLIED"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="NOT_SENT"/&gt;
 *     &lt;enumeration value="NOT_DELIVERED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "notificationStatus")
@XmlEnum
public enum NotificationStatus {

    IN_PROGRESS,
    SENT,
    DELIVERED,
    READ,
    REPLIED,
    FAILED,
    NOT_SENT,
    NOT_DELIVERED;

    public String value() {
        return name();
    }

    public static NotificationStatus fromValue(String v) {
        return valueOf(v);
    }

}
