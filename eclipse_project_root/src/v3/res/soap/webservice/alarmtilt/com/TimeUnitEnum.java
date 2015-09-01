
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeUnitEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeUnitEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MINUTE"/&gt;
 *     &lt;enumeration value="HOUR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "timeUnitEnum")
@XmlEnum
public enum TimeUnitEnum {

    MINUTE,
    HOUR;

    public String value() {
        return name();
    }

    public static TimeUnitEnum fromValue(String v) {
        return valueOf(v);
    }

}
