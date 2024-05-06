//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:59 PM MST 
//


package generated.sensor;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}name"/&gt;
 *         &lt;element ref="{}writerImpl"/&gt;
 *         &lt;element ref="{}writerInput"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "writerImpl",
    "writerInput"
})
@XmlRootElement(name = "Writer")
public class Writer
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String writerImpl;
    @XmlElement(required = true)
    protected WriterInput writerInput;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the writerImpl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriterImpl() {
        return writerImpl;
    }

    /**
     * Sets the value of the writerImpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriterImpl(String value) {
        this.writerImpl = value;
    }

    /**
     * Gets the value of the writerInput property.
     * 
     * @return
     *     possible object is
     *     {@link WriterInput }
     *     
     */
    public WriterInput getWriterInput() {
        return writerInput;
    }

    /**
     * Sets the value of the writerInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriterInput }
     *     
     */
    public void setWriterInput(WriterInput value) {
        this.writerInput = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
