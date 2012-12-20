
package com.novatec.services.documentservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UserQuotaExceededException", targetNamespace = "http://ws.openkm.com")
public class UserQuotaExceededException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UserQuotaExceededException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UserQuotaExceededException_Exception(String message, UserQuotaExceededException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UserQuotaExceededException_Exception(String message, UserQuotaExceededException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.novatec.services.documentservice.UserQuotaExceededException
     */
    public UserQuotaExceededException getFaultInfo() {
        return faultInfo;
    }

}