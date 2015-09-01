
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="launchProcedureResultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/&gt;
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/&gt;
 *     &lt;enumeration value="PARAM_REQUIRED"/&gt;
 *     &lt;enumeration value="PROCEDURE_DEFINITION_NOT_FOUND"/&gt;
 *     &lt;enumeration value="PARAM_SIZE_EXCEEDED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_SMS_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_EMAIL_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_VOICE_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_FAX_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_WEB_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_SMARTPHONE_MEDIA_REQUIRED"/&gt;
 *     &lt;enumeration value="MAX_PROC_IN_LAUNCHED_STATE_COUNT_REACHED"/&gt;
 *     &lt;enumeration value="PROCEDURE_DEFINITION_NOT_EXECUTABLE"/&gt;
 *     &lt;enumeration value="PARAM_STEP_NOT_EXIST_WITH_NAME"/&gt;
 *     &lt;enumeration value="PARAM_STEP_NAME_NOT_SET"/&gt;
 *     &lt;enumeration value="PARAM_STEP_CONTACT_ID_OR_NAME_NOT_SET"/&gt;
 *     &lt;enumeration value="PARAM_STEP_CONTACT_NOT_EXIST_WITH_ID"/&gt;
 *     &lt;enumeration value="PARAM_STEP_CONTACT_NOT_EXIST_WITH_NAME"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_NAME_NOT_SET"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_NOT_EXIST_WITH_NAME"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_MANDATORY"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_LIST"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_RADIO"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_NUMBER"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_CHECKBOX"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_DATE"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_DATE_TIME"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_TIME"/&gt;
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_NESTED_LIST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "launchProcedureResultEnum")
@XmlEnum
public enum LaunchProcedureResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    PROCEDURE_DEFINITION_NOT_FOUND,
    PARAM_SIZE_EXCEEDED,
    AT_LEAST_ONE_CONTACT_WITH_SMS_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_EMAIL_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_VOICE_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_FAX_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_WEB_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_SMARTPHONE_MEDIA_REQUIRED,
    MAX_PROC_IN_LAUNCHED_STATE_COUNT_REACHED,
    PROCEDURE_DEFINITION_NOT_EXECUTABLE,
    PARAM_STEP_NOT_EXIST_WITH_NAME,
    PARAM_STEP_NAME_NOT_SET,
    PARAM_STEP_CONTACT_ID_OR_NAME_NOT_SET,
    PARAM_STEP_CONTACT_NOT_EXIST_WITH_ID,
    PARAM_STEP_CONTACT_NOT_EXIST_WITH_NAME,
    PARAM_VARIABLE_NAME_NOT_SET,
    PARAM_VARIABLE_NOT_EXIST_WITH_NAME,
    PARAM_VARIABLE_MANDATORY,
    PARAM_VARIABLE_VALUE_INVALID_LIST,
    PARAM_VARIABLE_VALUE_INVALID_RADIO,
    PARAM_VARIABLE_VALUE_INVALID_NUMBER,
    PARAM_VARIABLE_VALUE_INVALID_CHECKBOX,
    PARAM_VARIABLE_VALUE_INVALID_DATE,
    PARAM_VARIABLE_VALUE_INVALID_DATE_TIME,
    PARAM_VARIABLE_VALUE_INVALID_TIME,
    PARAM_VARIABLE_VALUE_INVALID_NESTED_LIST;

    public String value() {
        return name();
    }

    public static LaunchProcedureResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
