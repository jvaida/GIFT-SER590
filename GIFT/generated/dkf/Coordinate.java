//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:52 PM MST 
//


package generated.dkf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://GIFT.com/common}GCC"/&gt;
 *           &lt;element ref="{http://GIFT.com/common}GDC"/&gt;
 *           &lt;element ref="{http://GIFT.com/common}AGL"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type"
})
@XmlRootElement(name = "coordinate", namespace = "http://GIFT.com/common")
public class Coordinate
    implements Serializable
{

    private final static long serialVersionUID = 123435L;
    @XmlElements({
        @XmlElement(name = "GCC", namespace = "http://GIFT.com/common", type = GCC.class),
        @XmlElement(name = "GDC", namespace = "http://GIFT.com/common", type = GDC.class),
        @XmlElement(name = "AGL", namespace = "http://GIFT.com/common", type = AGL.class)
    })
    protected Serializable type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GCC }
     *     {@link GDC }
     *     {@link AGL }
     *     
     */
    public Serializable getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCC }
     *     {@link GDC }
     *     {@link AGL }
     *     
     */
    public void setType(Serializable value) {
        this.type = value;
    }

}
