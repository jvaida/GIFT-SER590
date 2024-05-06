//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:59 PM MST 
//


package generated.sensor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageCompressionFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImageCompressionFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="LZ4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageCompressionFormat")
@XmlEnum
public enum ImageCompressionFormat {

    PNG("PNG"),
    @XmlEnumValue("LZ4")
    LZ_4("LZ4");
    private final String value;

    ImageCompressionFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageCompressionFormat fromValue(String v) {
        for (ImageCompressionFormat c: ImageCompressionFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
