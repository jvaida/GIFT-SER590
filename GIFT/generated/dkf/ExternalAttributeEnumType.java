//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:35 PM MST 
//


package generated.dkf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalAttributeEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalAttributeEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="AnimationPhase"/&gt;
 *     &lt;enumeration value="Variable"/&gt;
 *     &lt;enumeration value="WeaponState"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalAttributeEnumType")
@XmlEnum
public enum ExternalAttributeEnumType {

    @XmlEnumValue("AnimationPhase")
    ANIMATION_PHASE("AnimationPhase"),
    @XmlEnumValue("Variable")
    VARIABLE("Variable"),
    @XmlEnumValue("WeaponState")
    WEAPON_STATE("WeaponState");
    private final String value;

    ExternalAttributeEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalAttributeEnumType fromValue(String v) {
        for (ExternalAttributeEnumType c: ExternalAttributeEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}