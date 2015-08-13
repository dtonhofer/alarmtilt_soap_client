
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertSchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="alertSchemeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERSONAL"/&gt;
 *     &lt;enumeration value="GLOBAL"/&gt;
 *     &lt;enumeration value="MEDIA_SELECTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "alertSchemeType")
@XmlEnum
public enum AlertSchemeType {

    PERSONAL,
    GLOBAL,
    MEDIA_SELECTION;

    public String value() {
        return name();
    }

    public static AlertSchemeType fromValue(String v) {
        return valueOf(v);
    }

}
