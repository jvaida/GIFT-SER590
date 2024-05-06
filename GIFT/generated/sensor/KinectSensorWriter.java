//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:59 PM MST 
//


package generated.sensor;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;all&gt;
 *         &lt;element ref="{}directoryToWrite" minOccurs="0"/&gt;
 *         &lt;element ref="{}filePrefix"/&gt;
 *         &lt;element ref="{}ColorCompression" minOccurs="0"/&gt;
 *         &lt;element ref="{}DepthCompression" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "KinectSensorWriter")
public class KinectSensorWriter implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(defaultValue = "output/domainSessions")
    protected String directoryToWrite;
    @XmlElement(required = true)
    protected String filePrefix;
    @XmlElement(name = "ColorCompression")
    @XmlSchemaType(name = "normalizedString")
    protected ImageCompressionFormat colorCompression;
    @XmlElement(name = "DepthCompression")
    @XmlSchemaType(name = "normalizedString")
    protected ImageCompressionFormat depthCompression;

    /**
     * Gets the value of the directoryToWrite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryToWrite() {
        return directoryToWrite;
    }

    /**
     * Sets the value of the directoryToWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectoryToWrite(String value) {
        this.directoryToWrite = value;
    }

    /**
     * Gets the value of the filePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePrefix() {
        return filePrefix;
    }

    /**
     * Sets the value of the filePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePrefix(String value) {
        this.filePrefix = value;
    }

    /**
     * Gets the value of the colorCompression property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCompressionFormat }
     *     
     */
    public ImageCompressionFormat getColorCompression() {
        return colorCompression;
    }

    /**
     * Sets the value of the colorCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCompressionFormat }
     *     
     */
    public void setColorCompression(ImageCompressionFormat value) {
        this.colorCompression = value;
    }

    /**
     * Gets the value of the depthCompression property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCompressionFormat }
     *     
     */
    public ImageCompressionFormat getDepthCompression() {
        return depthCompression;
    }

    /**
     * Sets the value of the depthCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCompressionFormat }
     *     
     */
    public void setDepthCompression(ImageCompressionFormat value) {
        this.depthCompression = value;
    }

}
