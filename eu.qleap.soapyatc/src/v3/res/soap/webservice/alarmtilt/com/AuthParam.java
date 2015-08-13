
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authCustomRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authPw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authRole" type="{com.alarmtilt.webservice.soap.res.v3}authRoleEnum" minOccurs="0"/&gt;
 *         &lt;element name="authType" type="{com.alarmtilt.webservice.soap.res.v3}authType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authParam", propOrder = {
    "authCustomRoleId",
    "authDn",
    "authPw",
    "authRole",
    "authType"
})
public class AuthParam {

    protected String authCustomRoleId;
    protected String authDn;
    protected String authPw;
    @XmlSchemaType(name = "string")
    protected AuthRoleEnum authRole;
    @XmlSchemaType(name = "string")
    protected AuthType authType;

    /**
     * Gets the value of the authCustomRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCustomRoleId() {
        return authCustomRoleId;
    }

    /**
     * Sets the value of the authCustomRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCustomRoleId(String value) {
        this.authCustomRoleId = value;
    }

    /**
     * Gets the value of the authDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDn() {
        return authDn;
    }

    /**
     * Sets the value of the authDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDn(String value) {
        this.authDn = value;
    }

    /**
     * Gets the value of the authPw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPw() {
        return authPw;
    }

    /**
     * Sets the value of the authPw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPw(String value) {
        this.authPw = value;
    }

    /**
     * Gets the value of the authRole property.
     * 
     * @return
     *     possible object is
     *     {@link AuthRoleEnum }
     *     
     */
    public AuthRoleEnum getAuthRole() {
        return authRole;
    }

    /**
     * Sets the value of the authRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthRoleEnum }
     *     
     */
    public void setAuthRole(AuthRoleEnum value) {
        this.authRole = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link AuthType }
     *     
     */
    public AuthType getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthType }
     *     
     */
    public void setAuthType(AuthType value) {
        this.authType = value;
    }

}
