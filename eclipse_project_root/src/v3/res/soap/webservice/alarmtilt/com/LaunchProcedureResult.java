
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchProcedureResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="procedureInstance" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureInstance" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureResultEnum" minOccurs="0"/&gt;
 *         &lt;element name="resultInfos" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureResultInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchProcedureResult", propOrder = {
    "procedureInstance",
    "result",
    "resultInfos"
})
public class LaunchProcedureResult {

    protected LaunchProcedureInstance procedureInstance;
    @XmlSchemaType(name = "string")
    protected LaunchProcedureResultEnum result;
    @XmlElement(nillable = true)
    protected List<LaunchProcedureResultInfo> resultInfos;

    /**
     * Gets the value of the procedureInstance property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchProcedureInstance }
     *     
     */
    public LaunchProcedureInstance getProcedureInstance() {
        return procedureInstance;
    }

    /**
     * Sets the value of the procedureInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchProcedureInstance }
     *     
     */
    public void setProcedureInstance(LaunchProcedureInstance value) {
        this.procedureInstance = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchProcedureResultEnum }
     *     
     */
    public LaunchProcedureResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchProcedureResultEnum }
     *     
     */
    public void setResult(LaunchProcedureResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaunchProcedureResultInfo }
     * 
     * 
     */
    public List<LaunchProcedureResultInfo> getResultInfos() {
        if (resultInfos == null) {
            resultInfos = new ArrayList<LaunchProcedureResultInfo>();
        }
        return this.resultInfos;
    }

}
