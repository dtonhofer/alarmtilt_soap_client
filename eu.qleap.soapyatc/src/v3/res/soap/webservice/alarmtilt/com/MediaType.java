
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="POSTAL"/&gt;
 *     &lt;enumeration value="VOICE"/&gt;
 *     &lt;enumeration value="FAX"/&gt;
 *     &lt;enumeration value="IM"/&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="SMARTPHONE"/&gt;
 *     &lt;enumeration value="GENERIC"/&gt;
 *     &lt;enumeration value="FORM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mediaType")
@XmlEnum
public enum MediaType {

    SMS,
    EMAIL,
    POSTAL,
    VOICE,
    FAX,
    IM,
    WEB,
    SMARTPHONE,
    GENERIC,
    FORM;

    public String value() {
        return name();
    }

    public static MediaType fromValue(String v) {
        return valueOf(v);
    }

}
