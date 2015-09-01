
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionEvaluationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="conditionEvaluationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERSECTION"/&gt;
 *     &lt;enumeration value="UNION"/&gt;
 *     &lt;enumeration value="EXPRESSION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "conditionEvaluationMode")
@XmlEnum
public enum ConditionEvaluationMode {

    INTERSECTION,
    UNION,
    EXPRESSION;

    public String value() {
        return name();
    }

    public static ConditionEvaluationMode fromValue(String v) {
        return valueOf(v);
    }

}
