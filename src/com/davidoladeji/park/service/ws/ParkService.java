
package com.davidoladeji.park.service.ws;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ParkService", targetNamespace = "http://ws.service.park.davidoladeji.com/", wsdlLocation = "http://localhost:8080/ParkService/ParkSOAPService?wsdl")
public class ParkService
    extends Service
{

    private final static URL PARKSERVICE_WSDL_LOCATION;
    private final static WebServiceException PARKSERVICE_EXCEPTION;
    private final static QName PARKSERVICE_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "ParkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ParkService/ParkSOAPService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARKSERVICE_WSDL_LOCATION = url;
        PARKSERVICE_EXCEPTION = e;
    }

    public ParkService() {
        super(__getWsdlLocation(), PARKSERVICE_QNAME);
    }

    public ParkService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARKSERVICE_QNAME, features);
    }

    public ParkService(URL wsdlLocation) {
        super(wsdlLocation, PARKSERVICE_QNAME);
    }

    public ParkService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARKSERVICE_QNAME, features);
    }

    public ParkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParkService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ParkSOAPService
     */
    @WebEndpoint(name = "ParkSOAPServicePort")
    public ParkSOAPService getParkSOAPServicePort() {
        return super.getPort(new QName("http://ws.service.park.davidoladeji.com/", "ParkSOAPServicePort"), ParkSOAPService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParkSOAPService
     */
    @WebEndpoint(name = "ParkSOAPServicePort")
    public ParkSOAPService getParkSOAPServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.service.park.davidoladeji.com/", "ParkSOAPServicePort"), ParkSOAPService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARKSERVICE_EXCEPTION!= null) {
            throw PARKSERVICE_EXCEPTION;
        }
        return PARKSERVICE_WSDL_LOCATION;
    }

}
