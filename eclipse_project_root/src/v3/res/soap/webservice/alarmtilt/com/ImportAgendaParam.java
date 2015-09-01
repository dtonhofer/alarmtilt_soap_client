
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importAgendaParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importAgendaParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clearAgenda" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="icalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importAgendaParam", propOrder = {
    "clearAgenda",
    "icalText",
    "name"
})
public class ImportAgendaParam {

    protected boolean clearAgenda;
    protected String icalText;
    protected String name;

    /**
     * Gets the value of the clearAgenda property.
     * 
     */
    public boolean isClearAgenda() {
        return clearAgenda;
    }

    /**
     * Sets the value of the clearAgenda property.
     * 
     */
    public void setClearAgenda(boolean value) {
        this.clearAgenda = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
