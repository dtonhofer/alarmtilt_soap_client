
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportedLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="supportedLanguage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="DU"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "supportedLanguage")
@XmlEnum
public enum SupportedLanguage {

    FR,
    EN,
    DE,
    LU,
    DU,
    DK;

    public String value() {
        return name();
    }

    public static SupportedLanguage fromValue(String v) {
        return valueOf(v);
    }

}
