//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.04 at 12:18:49 AM ALMT 
//


package kz.e16training.xmltask.entity.classTypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DanceGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanceGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DanceGroupName" type="{}NameOfDanceGroup"/>
 *         &lt;element name="DanceGroupAge" type="{}AgeOfDanceGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanceGroup", propOrder = {
    "danceGroupName",
    "danceGroupAge"
})
public class DanceGroup {

    @XmlElement(name = "DanceGroupName", required = true)
    protected String danceGroupName;
    @XmlElement(name = "DanceGroupAge")
    @XmlSchemaType(name = "integer")
    protected int danceGroupAge;

    /**
     * Gets the value of the danceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanceGroupName() {
        return danceGroupName;
    }

    /**
     * Sets the value of the danceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanceGroupName(String value) {
        this.danceGroupName = value;
    }

    /**
     * Gets the value of the danceGroupAge property.
     * 
     */
    public int getDanceGroupAge() {
        return danceGroupAge;
    }

    /**
     * Sets the value of the danceGroupAge property.
     * 
     */
    public void setDanceGroupAge(int value) {
        this.danceGroupAge = value;
    }

}
