
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchProcedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authParam" type="{com.alarmtilt.webservice.soap.res.v3}authParam" minOccurs="0"/&gt;
 *         &lt;element name="launchProcedureParam" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureParam" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchProcedure", propOrder = {
    "authParam",
    "launchProcedureParam"
})
public class LaunchProcedure {

    protected AuthParam authParam;
    protected LaunchProcedureParam launchProcedureParam;

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
     * Gets the value of the launchProcedureParam property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchProcedureParam }
     *     
     */
    public LaunchProcedureParam getLaunchProcedureParam() {
        return launchProcedureParam;
    }

    /**
     * Sets the value of the launchProcedureParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchProcedureParam }
     *     
     */
    public void setLaunchProcedureParam(LaunchProcedureParam value) {
        this.launchProcedureParam = value;
    }

}
