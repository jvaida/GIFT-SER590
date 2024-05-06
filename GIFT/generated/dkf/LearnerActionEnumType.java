//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:38 PM MST 
//


package generated.dkf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LearnerActionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LearnerActionEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Explosive Hazard Spot Report"/&gt;
 *     &lt;enumeration value="Nine Line Report"/&gt;
 *     &lt;enumeration value="Spot Report"/&gt;
 *     &lt;enumeration value="Radio"/&gt;
 *     &lt;enumeration value="Tutor Me"/&gt;
 *     &lt;enumeration value="Start Pace Count"/&gt;
 *     &lt;enumeration value="End Pace Count"/&gt;
 *     &lt;enumeration value="Assess my location"/&gt;
 *     &lt;enumeration value="Apply Strategy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LearnerActionEnumType", namespace = "http://GIFT.com/learnerActions")
@XmlEnum
public enum LearnerActionEnumType {

    @XmlEnumValue("Explosive Hazard Spot Report")
    EXPLOSIVE_HAZARD_SPOT_REPORT("Explosive Hazard Spot Report"),
    @XmlEnumValue("Nine Line Report")
    NINE_LINE_REPORT("Nine Line Report"),
    @XmlEnumValue("Spot Report")
    SPOT_REPORT("Spot Report"),
    @XmlEnumValue("Radio")
    RADIO("Radio"),
    @XmlEnumValue("Tutor Me")
    TUTOR_ME("Tutor Me"),
    @XmlEnumValue("Start Pace Count")
    START_PACE_COUNT("Start Pace Count"),
    @XmlEnumValue("End Pace Count")
    END_PACE_COUNT("End Pace Count"),
    @XmlEnumValue("Assess my location")
    ASSESS_MY_LOCATION("Assess my location"),
    @XmlEnumValue("Apply Strategy")
    APPLY_STRATEGY("Apply Strategy");
    private final String value;

    LearnerActionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LearnerActionEnumType fromValue(String v) {
        for (LearnerActionEnumType c: LearnerActionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
