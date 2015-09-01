
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variableFilterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variableFilterOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILTER_OP_STARTS_WITH"/&gt;
 *     &lt;enumeration value="FILTER_OP_CONTAINS"/&gt;
 *     &lt;enumeration value="FILTER_OP_EQUALS"/&gt;
 *     &lt;enumeration value="FILTER_OP_NOT_EQUALS"/&gt;
 *     &lt;enumeration value="FILTER_OP_LESS_EQUALS"/&gt;
 *     &lt;enumeration value="FILTER_OP_LESS_THAN"/&gt;
 *     &lt;enumeration value="FILTER_OP_GREAT_EQUALS"/&gt;
 *     &lt;enumeration value="FILTER_OP_GREAT_THAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "variableFilterOperator")
@XmlEnum
public enum VariableFilterOperator {

    FILTER_OP_STARTS_WITH,
    FILTER_OP_CONTAINS,
    FILTER_OP_EQUALS,
    FILTER_OP_NOT_EQUALS,
    FILTER_OP_LESS_EQUALS,
    FILTER_OP_LESS_THAN,
    FILTER_OP_GREAT_EQUALS,
    FILTER_OP_GREAT_THAN;

    public String value() {
        return name();
    }

    public static VariableFilterOperator fromValue(String v) {
        return valueOf(v);
    }

}
