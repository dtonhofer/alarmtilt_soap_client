
package v3.res.soap.webservice.alarmtilt.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listContactFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterContactDynamicSelection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterContactGroupFunc" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterContactGroupOrg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterContactLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterContactUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterContactUserWithAuth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterSubscriber" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="namefilterOp" type="{com.alarmtilt.webservice.soap.res.v3}filterOpType" minOccurs="0"/&gt;
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listContactFilter", propOrder = {
    "filterContactDynamicSelection",
    "filterContactGroupFunc",
    "filterContactGroupOrg",
    "filterContactLink",
    "filterContactUser",
    "filterContactUserWithAuth",
    "filterSubscriber",
    "name",
    "namefilterOp",
    "pageIndex",
    "pageSize"
})
public class ListContactFilter {

    protected boolean filterContactDynamicSelection;
    protected boolean filterContactGroupFunc;
    protected boolean filterContactGroupOrg;
    protected boolean filterContactLink;
    protected boolean filterContactUser;
    protected boolean filterContactUserWithAuth;
    protected boolean filterSubscriber;
    protected String name;
    @XmlSchemaType(name = "string")
    protected FilterOpType namefilterOp;
    protected Integer pageIndex;
    protected Integer pageSize;

    /**
     * Gets the value of the filterContactDynamicSelection property.
     * 
     */
    public boolean isFilterContactDynamicSelection() {
        return filterContactDynamicSelection;
    }

    /**
     * Sets the value of the filterContactDynamicSelection property.
     * 
     */
    public void setFilterContactDynamicSelection(boolean value) {
        this.filterContactDynamicSelection = value;
    }

    /**
     * Gets the value of the filterContactGroupFunc property.
     * 
     */
    public boolean isFilterContactGroupFunc() {
        return filterContactGroupFunc;
    }

    /**
     * Sets the value of the filterContactGroupFunc property.
     * 
     */
    public void setFilterContactGroupFunc(boolean value) {
        this.filterContactGroupFunc = value;
    }

    /**
     * Gets the value of the filterContactGroupOrg property.
     * 
     */
    public boolean isFilterContactGroupOrg() {
        return filterContactGroupOrg;
    }

    /**
     * Sets the value of the filterContactGroupOrg property.
     * 
     */
    public void setFilterContactGroupOrg(boolean value) {
        this.filterContactGroupOrg = value;
    }

    /**
     * Gets the value of the filterContactLink property.
     * 
     */
    public boolean isFilterContactLink() {
        return filterContactLink;
    }

    /**
     * Sets the value of the filterContactLink property.
     * 
     */
    public void setFilterContactLink(boolean value) {
        this.filterContactLink = value;
    }

    /**
     * Gets the value of the filterContactUser property.
     * 
     */
    public boolean isFilterContactUser() {
        return filterContactUser;
    }

    /**
     * Sets the value of the filterContactUser property.
     * 
     */
    public void setFilterContactUser(boolean value) {
        this.filterContactUser = value;
    }

    /**
     * Gets the value of the filterContactUserWithAuth property.
     * 
     */
    public boolean isFilterContactUserWithAuth() {
        return filterContactUserWithAuth;
    }

    /**
     * Sets the value of the filterContactUserWithAuth property.
     * 
     */
    public void setFilterContactUserWithAuth(boolean value) {
        this.filterContactUserWithAuth = value;
    }

    /**
     * Gets the value of the filterSubscriber property.
     * 
     */
    public boolean isFilterSubscriber() {
        return filterSubscriber;
    }

    /**
     * Sets the value of the filterSubscriber property.
     * 
     */
    public void setFilterSubscriber(boolean value) {
        this.filterSubscriber = value;
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
     * Gets the value of the namefilterOp property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOpType }
     *     
     */
    public FilterOpType getNamefilterOp() {
        return namefilterOp;
    }

    /**
     * Sets the value of the namefilterOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOpType }
     *     
     */
    public void setNamefilterOp(FilterOpType value) {
        this.namefilterOp = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
