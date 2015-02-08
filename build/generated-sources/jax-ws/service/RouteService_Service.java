
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RouteService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/RouteService/RouteService?wsdl")
public class RouteService_Service
    extends Service
{

    private final static URL ROUTESERVICE_WSDL_LOCATION;
    private final static WebServiceException ROUTESERVICE_EXCEPTION;
    private final static QName ROUTESERVICE_QNAME = new QName("http://service/", "RouteService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RouteService/RouteService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROUTESERVICE_WSDL_LOCATION = url;
        ROUTESERVICE_EXCEPTION = e;
    }

    public RouteService_Service() {
        super(__getWsdlLocation(), ROUTESERVICE_QNAME);
    }

    public RouteService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROUTESERVICE_QNAME, features);
    }

    public RouteService_Service(URL wsdlLocation) {
        super(wsdlLocation, ROUTESERVICE_QNAME);
    }

    public RouteService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROUTESERVICE_QNAME, features);
    }

    public RouteService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RouteService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RouteService
     */
    @WebEndpoint(name = "RouteServicePort")
    public RouteService getRouteServicePort() {
        return super.getPort(new QName("http://service/", "RouteServicePort"), RouteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RouteService
     */
    @WebEndpoint(name = "RouteServicePort")
    public RouteService getRouteServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "RouteServicePort"), RouteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROUTESERVICE_EXCEPTION!= null) {
            throw ROUTESERVICE_EXCEPTION;
        }
        return ROUTESERVICE_WSDL_LOCATION;
    }

}
