
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ApiExceptionFault", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405")
public class ApiException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ApiException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ApiException_Exception(String message, ApiException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ApiException_Exception(String message, ApiException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.google.api.ads.dfp.jaxws.v201405.ApiException
     */
    public ApiException getFaultInfo() {
        return faultInfo;
    }

}
