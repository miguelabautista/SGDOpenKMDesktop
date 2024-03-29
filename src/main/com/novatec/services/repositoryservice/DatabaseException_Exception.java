
package com.novatec.services.repositoryservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DatabaseException", targetNamespace = "http://ws.openkm.com")
public class DatabaseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DatabaseException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public DatabaseException_Exception(String message, DatabaseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.novatec.services.repositoryservice.DatabaseException
     */
    public DatabaseException getFaultInfo() {
        return faultInfo;
    }

}
