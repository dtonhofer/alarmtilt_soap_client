
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listContactFilter" type="{com.alarmtilt.webservice.soap.res.v3}listContactFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactParam", propOrder = {
    "listContactFilter"
})
public class ListContactParam {

    protected ListContactFilter listContactFilter;

    /**
     * Gets the value of the listContactFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ListContactFilter }
     *     
     */
    public ListContactFilter getListContactFilter() {
        return listContactFilter;
    }

    /**
     * Sets the value of the listContactFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListContactFilter }
     *     
     */
    public void setListContactFilter(ListContactFilter value) {
        this.listContactFilter = value;
    }

}
