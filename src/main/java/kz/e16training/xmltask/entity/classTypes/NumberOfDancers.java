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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfDancers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfDancers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Mass" type="{}MassType"/>
 *         &lt;element name="Solo" type="{}SoloType"/>
 *         &lt;element name="Pair" type="{}PairType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfDancers", propOrder = {
    "mass",
    "solo",
    "pair"
})
public class NumberOfDancers {

    @XmlElement(name = "Mass")
    protected MassType mass;
    @XmlElement(name = "Solo")
    protected SoloType solo;
    @XmlElement(name = "Pair")
    protected PairType pair;

    /**
     * Gets the value of the mass property.
     * 
     * @return
     *     possible object is
     *     {@link MassType }
     *     
     */
    public MassType getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassType }
     *     
     */
    public void setMass(MassType value) {
        this.mass = value;
    }

    /**
     * Gets the value of the solo property.
     * 
     * @return
     *     possible object is
     *     {@link SoloType }
     *     
     */
    public SoloType getSolo() {
        return solo;
    }

    /**
     * Sets the value of the solo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoloType }
     *     
     */
    public void setSolo(SoloType value) {
        this.solo = value;
    }

    /**
     * Gets the value of the pair property.
     * 
     * @return
     *     possible object is
     *     {@link PairType }
     *     
     */
    public PairType getPair() {
        return pair;
    }

    /**
     * Sets the value of the pair property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairType }
     *     
     */
    public void setPair(PairType value) {
        this.pair = value;
    }

}
