
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAgendaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportAgendaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="icalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}exportAgendaResultEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAgendaResult", propOrder = {
    "icalText",
    "result"
})
public class ExportAgendaResult {

    protected String icalText;
    @XmlSchemaType(name = "string")
    protected ExportAgendaResultEnum result;

    /**
     * Gets the value of the icalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcalText() {
        return icalText;
    }

    /**
     * Sets the value of the icalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcalText(String value) {
        this.icalText = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ExportAgendaResultEnum }
     *     
     */
    public ExportAgendaResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAgendaResultEnum }
     *     
     */
    public void setResult(ExportAgendaResultEnum value) {
        this.result = value;
    }

}
