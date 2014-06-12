
package com.google.api.ads.dfp.jaxws.v201405;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ForecastService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201405", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201405/ForecastService?wsdl")
public class ForecastService
    extends Service
{

    private final static URL FORECASTSERVICE_WSDL_LOCATION;
    private final static WebServiceException FORECASTSERVICE_EXCEPTION;
    private final static QName FORECASTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201405", "ForecastService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201405/ForecastService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FORECASTSERVICE_WSDL_LOCATION = url;
        FORECASTSERVICE_EXCEPTION = e;
    }

    public ForecastService() {
        super(__getWsdlLocation(), FORECASTSERVICE_QNAME);
    }

    public ForecastService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ForecastServiceInterface
     */
    @WebEndpoint(name = "ForecastServiceInterfacePort")
    public ForecastServiceInterface getForecastServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ForecastServiceInterfacePort"), ForecastServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ForecastServiceInterface
     */
    @WebEndpoint(name = "ForecastServiceInterfacePort")
    public ForecastServiceInterface getForecastServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201405", "ForecastServiceInterfacePort"), ForecastServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FORECASTSERVICE_EXCEPTION!= null) {
            throw FORECASTSERVICE_EXCEPTION;
        }
        return FORECASTSERVICE_WSDL_LOCATION;
    }

}
