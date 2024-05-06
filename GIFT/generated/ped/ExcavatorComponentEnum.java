//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:09:03 PM MST 
//


package generated.ped;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcavatorComponentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExcavatorComponentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="bucket"/&gt;
 *     &lt;enumeration value="boom"/&gt;
 *     &lt;enumeration value="arm"/&gt;
 *     &lt;enumeration value="swing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExcavatorComponentEnum", namespace = "http://GIFT.com/common")
@XmlEnum
public enum ExcavatorComponentEnum {

    @XmlEnumValue("bucket")
    BUCKET("bucket"),
    @XmlEnumValue("boom")
    BOOM("boom"),
    @XmlEnumValue("arm")
    ARM("arm"),
    @XmlEnumValue("swing")
    SWING("swing");
    private final String value;

    ExcavatorComponentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExcavatorComponentEnum fromValue(String v) {
        for (ExcavatorComponentEnum c: ExcavatorComponentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
