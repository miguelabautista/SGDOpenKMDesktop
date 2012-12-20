
package com.novatec.services.propertyservice;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OKMProperty", targetNamespace = "http://ws.openkm.com", wsdlLocation = "http://192.168.1.5:8086/OpenKM/services/OKMProperty?wsdl")
public class OKMProperty_Service
    extends Service
{

    private final static URL OKMPROPERTY_WSDL_LOCATION;
    private final static WebServiceException OKMPROPERTY_EXCEPTION;
    private final static QName OKMPROPERTY_QNAME = new QName("http://ws.openkm.com", "OKMProperty");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.5:8086/OpenKM/services/OKMProperty?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OKMPROPERTY_WSDL_LOCATION = url;
        OKMPROPERTY_EXCEPTION = e;
    }

    public OKMProperty_Service() {
        super(__getWsdlLocation(), OKMPROPERTY_QNAME);
    }

    public OKMProperty_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OKMPROPERTY_QNAME, features);
    }

    public OKMProperty_Service(URL wsdlLocation) {
        super(wsdlLocation, OKMPROPERTY_QNAME);
    }

    public OKMProperty_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OKMPROPERTY_QNAME, features);
    }

    public OKMProperty_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OKMProperty_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OKMProperty
     */
    @WebEndpoint(name = "OKMPropertyPort")
    public OKMProperty getOKMPropertyPort() {
        return super.getPort(new QName("http://ws.openkm.com", "OKMPropertyPort"), OKMProperty.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OKMProperty
     */
    @WebEndpoint(name = "OKMPropertyPort")
    public OKMProperty getOKMPropertyPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.openkm.com", "OKMPropertyPort"), OKMProperty.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OKMPROPERTY_EXCEPTION!= null) {
            throw OKMPROPERTY_EXCEPTION;
        }
        return OKMPROPERTY_WSDL_LOCATION;
    }

}
