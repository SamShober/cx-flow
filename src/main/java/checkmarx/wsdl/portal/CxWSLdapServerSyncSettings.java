//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CxWSLdapServerSyncSettings complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CxWSLdapServerSyncSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AdditionalGroupDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupObjectClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupObjectFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupIdAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupNameAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupMembersAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserMemberShipAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LdapRoleMapping" type="{http://Checkmarx.com}CxWSLdapRoleMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CxWSLdapServerSyncSettings", propOrder = {
    "enabled",
    "additionalGroupDN",
    "groupObjectClass",
    "groupObjectFilter",
    "groupIdAttribute",
    "groupNameAttribute",
    "groupMembersAttribute",
    "userMemberShipAttribute",
    "ldapRoleMapping"
})
public class CxWSLdapServerSyncSettings {

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "AdditionalGroupDN")
    protected String additionalGroupDN;
    @XmlElement(name = "GroupObjectClass")
    protected String groupObjectClass;
    @XmlElement(name = "GroupObjectFilter")
    protected String groupObjectFilter;
    @XmlElement(name = "GroupIdAttribute")
    protected String groupIdAttribute;
    @XmlElement(name = "GroupNameAttribute")
    protected String groupNameAttribute;
    @XmlElement(name = "GroupMembersAttribute")
    protected String groupMembersAttribute;
    @XmlElement(name = "UserMemberShipAttribute")
    protected String userMemberShipAttribute;
    @XmlElement(name = "LdapRoleMapping")
    protected CxWSLdapRoleMapping ldapRoleMapping;

    /**
     * Gets the value of the enabled property.
     *
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     *
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the additionalGroupDN property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalGroupDN() {
        return additionalGroupDN;
    }

    /**
     * Sets the value of the additionalGroupDN property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalGroupDN(String value) {
        this.additionalGroupDN = value;
    }

    /**
     * Gets the value of the groupObjectClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupObjectClass() {
        return groupObjectClass;
    }

    /**
     * Sets the value of the groupObjectClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupObjectClass(String value) {
        this.groupObjectClass = value;
    }

    /**
     * Gets the value of the groupObjectFilter property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupObjectFilter() {
        return groupObjectFilter;
    }

    /**
     * Sets the value of the groupObjectFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupObjectFilter(String value) {
        this.groupObjectFilter = value;
    }

    /**
     * Gets the value of the groupIdAttribute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupIdAttribute() {
        return groupIdAttribute;
    }

    /**
     * Sets the value of the groupIdAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupIdAttribute(String value) {
        this.groupIdAttribute = value;
    }

    /**
     * Gets the value of the groupNameAttribute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupNameAttribute() {
        return groupNameAttribute;
    }

    /**
     * Sets the value of the groupNameAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupNameAttribute(String value) {
        this.groupNameAttribute = value;
    }

    /**
     * Gets the value of the groupMembersAttribute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupMembersAttribute() {
        return groupMembersAttribute;
    }

    /**
     * Sets the value of the groupMembersAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupMembersAttribute(String value) {
        this.groupMembersAttribute = value;
    }

    /**
     * Gets the value of the userMemberShipAttribute property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserMemberShipAttribute() {
        return userMemberShipAttribute;
    }

    /**
     * Sets the value of the userMemberShipAttribute property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserMemberShipAttribute(String value) {
        this.userMemberShipAttribute = value;
    }

    /**
     * Gets the value of the ldapRoleMapping property.
     *
     * @return
     *     possible object is
     *     {@link CxWSLdapRoleMapping }
     *
     */
    public CxWSLdapRoleMapping getLdapRoleMapping() {
        return ldapRoleMapping;
    }

    /**
     * Sets the value of the ldapRoleMapping property.
     *
     * @param value
     *     allowed object is
     *     {@link CxWSLdapRoleMapping }
     *
     */
    public void setLdapRoleMapping(CxWSLdapRoleMapping value) {
        this.ldapRoleMapping = value;
    }

}
