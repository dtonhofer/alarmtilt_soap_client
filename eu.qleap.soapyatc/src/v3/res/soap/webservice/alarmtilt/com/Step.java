
package v3.res.soap.webservice.alarmtilt.com;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for step complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="step"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertSchemeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alertSchemeType" type="{com.alarmtilt.webservice.soap.res.v3}alertSchemeType" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{com.alarmtilt.webservice.soap.res.v3}wsAttachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listOfContacts" type="{com.alarmtilt.webservice.soap.res.v3}stepContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="messageType" type="{com.alarmtilt.webservice.soap.res.v3}messageType" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="runTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="runTimeoutUnit" type="{com.alarmtilt.webservice.soap.res.v3}timeUnitEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "step", propOrder = {
    "alertSchemeName",
    "alertSchemeType",
    "attachments",
    "listOfContacts",
    "messageType",
    "name",
    "runTimeout",
    "runTimeoutUnit"
})
public class Step {

    protected String alertSchemeName;
    @XmlSchemaType(name = "string")
    protected AlertSchemeType alertSchemeType;
    @XmlElement(nillable = true)
    protected List<WsAttachment> attachments;
    @XmlElement(nillable = true)
    protected List<StepContact> listOfContacts;
    @XmlSchemaType(name = "string")
    protected MessageType messageType;
    protected String name;
    protected Integer runTimeout;
    @XmlSchemaType(name = "string")
    protected TimeUnitEnum runTimeoutUnit;

    /**
     * Gets the value of the alertSchemeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertSchemeName() {
        return alertSchemeName;
    }

    /**
     * Sets the value of the alertSchemeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertSchemeName(String value) {
        this.alertSchemeName = value;
    }

    /**
     * Gets the value of the alertSchemeType property.
     * 
     * @return
     *     possible object is
     *     {@link AlertSchemeType }
     *     
     */
    public AlertSchemeType getAlertSchemeType() {
        return alertSchemeType;
    }

    /**
     * Sets the value of the alertSchemeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertSchemeType }
     *     
     */
    public void setAlertSchemeType(AlertSchemeType value) {
        this.alertSchemeType = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsAttachment }
     * 
     * 
     */
    public List<WsAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<WsAttachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the listOfContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepContact }
     * 
     * 
     */
    public List<StepContact> getListOfContacts() {
        if (listOfContacts == null) {
            listOfContacts = new ArrayList<StepContact>();
        }
        return this.listOfContacts;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageType(MessageType value) {
        this.messageType = value;
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

    /**
     * Gets the value of the runTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunTimeout() {
        return runTimeout;
    }

    /**
     * Sets the value of the runTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunTimeout(Integer value) {
        this.runTimeout = value;
    }

    /**
     * Gets the value of the runTimeoutUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitEnum }
     *     
     */
    public TimeUnitEnum getRunTimeoutUnit() {
        return runTimeoutUnit;
    }

    /**
     * Sets the value of the runTimeoutUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitEnum }
     *     
     */
    public void setRunTimeoutUnit(TimeUnitEnum value) {
        this.runTimeoutUnit = value;
    }

}
