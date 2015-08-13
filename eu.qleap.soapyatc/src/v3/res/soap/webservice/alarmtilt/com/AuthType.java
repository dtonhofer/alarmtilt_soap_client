
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BASIC"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="PHONE"/&gt;
 *     &lt;enumeration value="HEX64"/&gt;
 *     &lt;enumeration value="SNMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "authType")
@XmlEnum
public enum AuthType {

    BASIC("BASIC"),
    CERT("CERT"),
    EMAIL("EMAIL"),
    PHONE("PHONE"),
    @XmlEnumValue("HEX64")
    HEX_64("HEX64"),
    SNMP("SNMP");
    private final String value;

    AuthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthType fromValue(String v) {
        for (AuthType c: AuthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
