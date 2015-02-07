
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _CheckingResponse_QNAME = new QName("http://service/", "checkingResponse");
    private final static QName _Checking_QNAME = new QName("http://service/", "checking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Checking }
     * 
     */
    public Checking createChecking() {
        return new Checking();
    }

    /**
     * Create an instance of {@link CheckingResponse }
     * 
     */
    public CheckingResponse createCheckingResponse() {
        return new CheckingResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkingResponse")
    public JAXBElement<CheckingResponse> createCheckingResponse(CheckingResponse value) {
        return new JAXBElement<CheckingResponse>(_CheckingResponse_QNAME, CheckingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checking")
    public JAXBElement<Checking> createChecking(Checking value) {
        return new JAXBElement<Checking>(_Checking_QNAME, Checking.class, null, value);
    }

}
