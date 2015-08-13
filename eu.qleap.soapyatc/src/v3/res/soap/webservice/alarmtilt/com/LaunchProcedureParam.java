
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchProcedureParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="procedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="procedureOwner" type="{com.alarmtilt.webservice.soap.res.v3}contactUser" minOccurs="0"/&gt;
 *         &lt;element name="steps" type="{com.alarmtilt.webservice.soap.res.v3}step" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="variables" type="{com.alarmtilt.webservice.soap.res.v3}procedureVariable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchProcedureParam", propOrder = {
    "procedureName",
    "procedureOwner",
    "steps",
    "variables"
})
public class LaunchProcedureParam {

    protected String procedureName;
    protected ContactUser procedureOwner;
    @XmlElement(nillable = true)
    protected List<Step> steps;
    @XmlElement(nillable = true)
    protected List<ProcedureVariable> variables;

    /**
     * Gets the value of the procedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * Sets the value of the procedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureName(String value) {
        this.procedureName = value;
    }

    /**
     * Gets the value of the procedureOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ContactUser }
     *     
     */
    public ContactUser getProcedureOwner() {
        return procedureOwner;
    }

    /**
     * Sets the value of the procedureOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactUser }
     *     
     */
    public void setProcedureOwner(ContactUser value) {
        this.procedureOwner = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Step }
     * 
     * 
     */
    public List<Step> getSteps() {
        if (steps == null) {
            steps = new ArrayList<Step>();
        }
        return this.steps;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedureVariable }
     * 
     * 
     */
    public List<ProcedureVariable> getVariables() {
        if (variables == null) {
            variables = new ArrayList<ProcedureVariable>();
        }
        return this.variables;
    }

}
