
package com.novatec.services.documentservice;

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
@WebServiceClient(name = "OKMDocument", targetNamespace = "http://ws.openkm.com", wsdlLocation = "http://192.168.1.5:8086/OpenKM/services/OKMDocument?wsdl")
public class OKMDocument_Service
    extends Service
{

    private final static URL OKMDOCUMENT_WSDL_LOCATION;
    private final static WebServiceException OKMDOCUMENT_EXCEPTION;
    private final static QName OKMDOCUMENT_QNAME = new QName("http://ws.openkm.com", "OKMDocument");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.5:8086/OpenKM/services/OKMDocument?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OKMDOCUMENT_WSDL_LOCATION = url;
        OKMDOCUMENT_EXCEPTION = e;
    }

    public OKMDocument_Service() {
        super(__getWsdlLocation(), OKMDOCUMENT_QNAME);
    }

    public OKMDocument_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OKMDOCUMENT_QNAME, features);
    }

    public OKMDocument_Service(URL wsdlLocation) {
        super(wsdlLocation, OKMDOCUMENT_QNAME);
    }

    public OKMDocument_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OKMDOCUMENT_QNAME, features);
    }

    public OKMDocument_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OKMDocument_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OKMDocument
     */
    @WebEndpoint(name = "OKMDocumentPort")
    public OKMDocument getOKMDocumentPort() {
        return super.getPort(new QName("http://ws.openkm.com", "OKMDocumentPort"), OKMDocument.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OKMDocument
     */
    @WebEndpoint(name = "OKMDocumentPort")
    public OKMDocument getOKMDocumentPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.openkm.com", "OKMDocumentPort"), OKMDocument.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OKMDOCUMENT_EXCEPTION!= null) {
            throw OKMDOCUMENT_EXCEPTION;
        }
        return OKMDOCUMENT_WSDL_LOCATION;
    }

}