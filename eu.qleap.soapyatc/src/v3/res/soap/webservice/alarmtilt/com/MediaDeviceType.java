
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaDeviceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IOS"/&gt;
 *     &lt;enumeration value="ANDROID"/&gt;
 *     &lt;enumeration value="BLACKBERRY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mediaDeviceType")
@XmlEnum
public enum MediaDeviceType {

    IOS,
    ANDROID,
    BLACKBERRY;

    public String value() {
        return name();
    }

    public static MediaDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
