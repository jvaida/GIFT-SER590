//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:54 PM MST 
//


package generated.learner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.learner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TranslatorImpl_QNAME = new QName("", "translatorImpl");
    private final static QName _ClassifierImpl_QNAME = new QName("", "classifierImpl");
    private final static QName _PredictorImpl_QNAME = new QName("", "predictorImpl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.learner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LearnerConfiguration }
     * 
     */
    public LearnerConfiguration createLearnerConfiguration() {
        return new LearnerConfiguration();
    }

    /**
     * Create an instance of {@link Inputs }
     * 
     */
    public Inputs createInputs() {
        return new Inputs();
    }

    /**
     * Create an instance of {@link Input }
     * 
     */
    public Input createInput() {
        return new Input();
    }

    /**
     * Create an instance of {@link Translator }
     * 
     */
    public Translator createTranslator() {
        return new Translator();
    }

    /**
     * Create an instance of {@link Classifier }
     * 
     */
    public Classifier createClassifier() {
        return new Classifier();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Predictor }
     * 
     */
    public Predictor createPredictor() {
        return new Predictor();
    }

    /**
     * Create an instance of {@link Producers }
     * 
     */
    public Producers createProducers() {
        return new Producers();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link TrainingAppState }
     * 
     */
    public TrainingAppState createTrainingAppState() {
        return new TrainingAppState();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "translatorImpl")
    public JAXBElement<String> createTranslatorImpl(String value) {
        return new JAXBElement<String>(_TranslatorImpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "classifierImpl")
    public JAXBElement<String> createClassifierImpl(String value) {
        return new JAXBElement<String>(_ClassifierImpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "predictorImpl")
    public JAXBElement<String> createPredictorImpl(String value) {
        return new JAXBElement<String>(_PredictorImpl_QNAME, String.class, null, value);
    }

}