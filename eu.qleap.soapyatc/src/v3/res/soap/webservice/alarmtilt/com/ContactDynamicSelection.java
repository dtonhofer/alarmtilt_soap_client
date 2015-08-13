
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactDynamicSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDynamicSelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conditionEvaluationMode" type="{com.alarmtilt.webservice.soap.res.v3}conditionEvaluationMode" minOccurs="0"/&gt;
 *         &lt;element name="conditions" type="{com.alarmtilt.webservice.soap.res.v3}contactDynamicSelectionCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDynamicSelection", propOrder = {
    "conditionEvaluationMode",
    "conditions",
    "expression"
})
public class ContactDynamicSelection {

    @XmlSchemaType(name = "string")
    protected ConditionEvaluationMode conditionEvaluationMode;
    @XmlElement(nillable = true)
    protected List<ContactDynamicSelectionCondition> conditions;
    protected String expression;

    /**
     * Gets the value of the conditionEvaluationMode property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEvaluationMode }
     *     
     */
    public ConditionEvaluationMode getConditionEvaluationMode() {
        return conditionEvaluationMode;
    }

    /**
     * Sets the value of the conditionEvaluationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEvaluationMode }
     *     
     */
    public void setConditionEvaluationMode(ConditionEvaluationMode value) {
        this.conditionEvaluationMode = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDynamicSelectionCondition }
     * 
     * 
     */
    public List<ContactDynamicSelectionCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<ContactDynamicSelectionCondition>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

}
