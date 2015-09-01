
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authRoleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authRoleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *     &lt;enumeration value="ADMINISTRATOR"/&gt;
 *     &lt;enumeration value="AUDITOR"/&gt;
 *     &lt;enumeration value="ACCESS_MANAGER"/&gt;
 *     &lt;enumeration value="DIRECTORY_MANAGER"/&gt;
 *     &lt;enumeration value="PROCEDURE_LAUNCHER"/&gt;
 *     &lt;enumeration value="PROCEDURE_MANAGER"/&gt;
 *     &lt;enumeration value="CUSTOM_ROLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "authRoleEnum")
@XmlEnum
public enum AuthRoleEnum {

    DESTINATION,
    ADMINISTRATOR,
    AUDITOR,
    ACCESS_MANAGER,
    DIRECTORY_MANAGER,
    PROCEDURE_LAUNCHER,
    PROCEDURE_MANAGER,
    CUSTOM_ROLE;

    public String value() {
        return name();
    }

    public static AuthRoleEnum fromValue(String v) {
        return valueOf(v);
    }

}
