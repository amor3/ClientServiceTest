
package se.mc_boden.types.faulttypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.mc_boden.types.faulttypes package. 
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

    private final static QName _ErrorMSG_QNAME = new QName("http://www.mc-boden.se/types/faultTypes", "errorMSG");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.mc_boden.types.faulttypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mc-boden.se/types/faultTypes", name = "errorMSG")
    public JAXBElement<String> createErrorMSG(String value) {
        return new JAXBElement<String>(_ErrorMSG_QNAME, String.class, null, value);
    }

}
