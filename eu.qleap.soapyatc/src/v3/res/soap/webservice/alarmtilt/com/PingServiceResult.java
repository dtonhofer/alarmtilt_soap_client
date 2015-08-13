
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pingServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pingServiceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}pingServiceResultEnum" minOccurs="0"/&gt;
 *         &lt;element name="serviceAccessDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pingServiceResult", propOrder = {
    "result",
    "serviceAccessDate",
    "stage"
})
public class PingServiceResult {

    @XmlSchemaType(name = "string")
    protected PingServiceResultEnum result;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceAccessDate;
    protected String stage;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link PingServiceResultEnum }
     *     
     */
    public PingServiceResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingServiceResultEnum }
     *     
     */
    public void setResult(PingServiceResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the serviceAccessDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceAccessDate() {
        return serviceAccessDate;
    }

    /**
     * Sets the value of the serviceAccessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceAccessDate(XMLGregorianCalendar value) {
        this.serviceAccessDate = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

}
