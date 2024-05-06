//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.30 at 06:08:42 PM MST 
//


package generated.course;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="loadArgs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://GIFT.com/common}nvpair" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "loadArgs"
})
@XmlRootElement(name = "CustomInteropInputs")
public class CustomInteropInputs implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(required = true)
    protected CustomInteropInputs.LoadArgs loadArgs;

    /**
     * Gets the value of the loadArgs property.
     * 
     * @return
     *     possible object is
     *     {@link CustomInteropInputs.LoadArgs }
     *     
     */
    public CustomInteropInputs.LoadArgs getLoadArgs() {
        return loadArgs;
    }

    /**
     * Sets the value of the loadArgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomInteropInputs.LoadArgs }
     *     
     */
    public void setLoadArgs(CustomInteropInputs.LoadArgs value) {
        this.loadArgs = value;
    }


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
     *         &lt;element ref="{http://GIFT.com/common}nvpair" maxOccurs="unbounded"/&gt;
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
        "nvpair"
    })
    public static class LoadArgs
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(namespace = "http://GIFT.com/common", required = true)
        protected List<Nvpair> nvpair;

        /**
         * Gets the value of the nvpair property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nvpair property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNvpair().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Nvpair }
         * 
         * 
         */
        public List<Nvpair> getNvpair() {
            if (nvpair == null) {
                nvpair = new ArrayList<Nvpair>();
            }
            return this.nvpair;
        }

    }

}
