
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

    private final static QName _CheckRouteResponse_QNAME = new QName("http://service/", "checkRouteResponse");
    private final static QName _CheckRoute_QNAME = new QName("http://service/", "checkRoute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckRoute }
     * 
     */
    public CheckRoute createCheckRoute() {
        return new CheckRoute();
    }

    /**
     * Create an instance of {@link CheckRouteResponse }
     * 
     */
    public CheckRouteResponse createCheckRouteResponse() {
        return new CheckRouteResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkRouteResponse")
    public JAXBElement<CheckRouteResponse> createCheckRouteResponse(CheckRouteResponse value) {
        return new JAXBElement<CheckRouteResponse>(_CheckRouteResponse_QNAME, CheckRouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "checkRoute")
    public JAXBElement<CheckRoute> createCheckRoute(CheckRoute value) {
        return new JAXBElement<CheckRoute>(_CheckRoute_QNAME, CheckRoute.class, null, value);
    }

}
