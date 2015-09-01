
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAgendaResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="exportAgendaResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *     &lt;enumeration value="NAME_REQUIRED"/&gt;
 *     &lt;enumeration value="AGENDA_DOES_NOT_EXISTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "exportAgendaResultEnum")
@XmlEnum
public enum ExportAgendaResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    NAME_REQUIRED,
    AGENDA_DOES_NOT_EXISTS;

    public String value() {
        return name();
    }

    public static ExportAgendaResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
