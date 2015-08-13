
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importAgendaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importAgendaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}importAgendaResultEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importAgendaResult", propOrder = {
    "result"
})
public class ImportAgendaResult {

    @XmlSchemaType(name = "string")
    protected ImportAgendaResultEnum result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ImportAgendaResultEnum }
     *     
     */
    public ImportAgendaResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportAgendaResultEnum }
     *     
     */
    public void setResult(ImportAgendaResultEnum value) {
        this.result = value;
    }

}
