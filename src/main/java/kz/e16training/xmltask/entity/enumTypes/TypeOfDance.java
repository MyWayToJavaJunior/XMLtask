//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.04 at 12:18:49 AM ALMT 
//


package kz.e16training.xmltask.entity.enumTypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfDance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfDance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ballroom"/>
 *     &lt;enumeration value="folk"/>
 *     &lt;enumeration value="pop"/>
 *     &lt;enumeration value="east"/>
 *     &lt;enumeration value="rock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfDance")
@XmlEnum
public enum TypeOfDance {

    @XmlEnumValue("ballroom")
    BALLROOM("ballroom"),
    @XmlEnumValue("folk")
    FOLK("folk"),
    @XmlEnumValue("pop")
    POP("pop"),
    @XmlEnumValue("east")
    EAST("east"),
    @XmlEnumValue("rock")
    ROCK("rock");
    private final String value;

    TypeOfDance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfDance fromValue(String v) {
        for (TypeOfDance c: TypeOfDance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
