
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactUserParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dynamicSelection" type="{com.alarmtilt.webservice.soap.res.v3}contactDynamicSelection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactUserParam", propOrder = {
    "dynamicSelection"
})
public class ListContactUserParam {

    protected ContactDynamicSelection dynamicSelection;

    /**
     * Gets the value of the dynamicSelection property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDynamicSelection }
     *     
     */
    public ContactDynamicSelection getDynamicSelection() {
        return dynamicSelection;
    }

    /**
     * Sets the value of the dynamicSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDynamicSelection }
     *     
     */
    public void setDynamicSelection(ContactDynamicSelection value) {
        this.dynamicSelection = value;
    }

}
