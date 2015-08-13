
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAgenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportAgenda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/&gt;
 *         &lt;element name="exportAgendaParam" type="{com.alarmtilt.webservice.soap.res.v3}exportAgendaParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAgenda", propOrder = {
    "authParam",
    "exportAgendaParam"
})
public class ExportAgenda {

    protected AuthParam authParam;
    protected ExportAgendaParam exportAgendaParam;

    /**
     * Gets the value of the authParam property.
     * 
     * @return
     *     possible object is
     *     {@link AuthParam }
     *     
     */
    public AuthParam getAuthParam() {
        return authParam;
    }

    /**
     * Sets the value of the authParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthParam }
     *     
     */
    public void setAuthParam(AuthParam value) {
        this.authParam = value;
    }

    /**
     * Gets the value of the exportAgendaParam property.
     * 
     * @return
     *     possible object is
     *     {@link ExportAgendaParam }
     *     
     */
    public ExportAgendaParam getExportAgendaParam() {
        return exportAgendaParam;
    }

    /**
     * Sets the value of the exportAgendaParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAgendaParam }
     *     
     */
    public void setExportAgendaParam(ExportAgendaParam value) {
        this.exportAgendaParam = value;
    }

}
