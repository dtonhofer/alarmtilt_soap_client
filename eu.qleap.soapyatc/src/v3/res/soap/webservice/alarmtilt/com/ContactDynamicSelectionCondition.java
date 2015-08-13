
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactDynamicSelectionCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDynamicSelectionCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extendedToAuthorizedMUs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="variableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="variableOp" type="{com.alarmtilt.webservice.soap.res.v3}variableFilterOperator" minOccurs="0"/&gt;
 *         &lt;element name="variableValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDynamicSelectionCondition", propOrder = {
    "extendedToAuthorizedMUs",
    "variableKey",
    "variableOp",
    "variableValue"
})
public class ContactDynamicSelectionCondition {

    protected String extendedToAuthorizedMUs;
    protected String variableKey;
    @XmlSchemaType(name = "string")
    protected VariableFilterOperator variableOp;
    protected String variableValue;

    /**
     * Gets the value of the extendedToAuthorizedMUs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedToAuthorizedMUs() {
        return extendedToAuthorizedMUs;
    }

    /**
     * Sets the value of the extendedToAuthorizedMUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedToAuthorizedMUs(String value) {
        this.extendedToAuthorizedMUs = value;
    }

    /**
     * Gets the value of the variableKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableKey() {
        return variableKey;
    }

    /**
     * Sets the value of the variableKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableKey(String value) {
        this.variableKey = value;
    }

    /**
     * Gets the value of the variableOp property.
     * 
     * @return
     *     possible object is
     *     {@link VariableFilterOperator }
     *     
     */
    public VariableFilterOperator getVariableOp() {
        return variableOp;
    }

    /**
     * Sets the value of the variableOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableFilterOperator }
     *     
     */
    public void setVariableOp(VariableFilterOperator value) {
        this.variableOp = value;
    }

    /**
     * Gets the value of the variableValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * Sets the value of the variableValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableValue(String value) {
        this.variableValue = value;
    }

}
