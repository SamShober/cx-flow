//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="newScanId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionId",
    "oldScanId",
    "newScanId"
})
@XmlRootElement(name = "GetScanCompareSummary")
public class GetScanCompareSummary {

    protected String sessionId;
    protected long oldScanId;
    protected long newScanId;

    /**
     * Gets the value of the sessionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the oldScanId property.
     *
     */
    public long getOldScanId() {
        return oldScanId;
    }

    /**
     * Sets the value of the oldScanId property.
     *
     */
    public void setOldScanId(long value) {
        this.oldScanId = value;
    }

    /**
     * Gets the value of the newScanId property.
     *
     */
    public long getNewScanId() {
        return newScanId;
    }

    /**
     * Sets the value of the newScanId property.
     *
     */
    public void setNewScanId(long value) {
        this.newScanId = value;
    }

}
