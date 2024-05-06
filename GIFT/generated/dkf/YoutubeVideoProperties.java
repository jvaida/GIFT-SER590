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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}size" minOccurs="0"/&gt;
 *         &lt;element ref="{}allowFullScreen" minOccurs="0"/&gt;
 *         &lt;element ref="{}allowAutoPlay" minOccurs="0"/&gt;
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
    "size",
    "allowFullScreen",
    "allowAutoPlay"
})
@XmlRootElement(name = "YoutubeVideoProperties")
public class YoutubeVideoProperties implements Serializable
{

    private final static long serialVersionUID = 123435L;
    protected Size size;
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum allowFullScreen;
    @XmlSchemaType(name = "normalizedString")
    protected BooleanEnum allowAutoPlay;

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the allowFullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getAllowFullScreen() {
        return allowFullScreen;
    }

    /**
     * Sets the value of the allowFullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setAllowFullScreen(BooleanEnum value) {
        this.allowFullScreen = value;
    }

    /**
     * Gets the value of the allowAutoPlay property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanEnum }
     *     
     */
    public BooleanEnum getAllowAutoPlay() {
        return allowAutoPlay;
    }

    /**
     * Sets the value of the allowAutoPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanEnum }
     *     
     */
    public void setAllowAutoPlay(BooleanEnum value) {
        this.allowAutoPlay = value;
    }

}
