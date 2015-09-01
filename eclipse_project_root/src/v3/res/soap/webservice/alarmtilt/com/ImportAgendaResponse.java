
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importAgendaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importAgendaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="importAgendaResult" type="{com.alarmtilt.webservice.soap.res.v3}importAgendaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importAgendaResponse", propOrder = {
    "importAgendaResult"
})
public class ImportAgendaResponse {

    protected ImportAgendaResult importAgendaResult;

    /**
     * Gets the value of the importAgendaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ImportAgendaResult }
     *     
     */
    public ImportAgendaResult getImportAgendaResult() {
        return importAgendaResult;
    }

    /**
     * Sets the value of the importAgendaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportAgendaResult }
     *     
     */
    public void setImportAgendaResult(ImportAgendaResult value) {
        this.importAgendaResult = value;
    }

}
