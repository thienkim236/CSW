
package ws;

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
@WebServiceClient(name = "WorkeerWS", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Demo3/WorkeerWS?wsdl")
public class WorkeerWS_Service
    extends Service
{

    private final static URL WORKEERWS_WSDL_LOCATION;
    private final static WebServiceException WORKEERWS_EXCEPTION;
    private final static QName WORKEERWS_QNAME = new QName("http://ws/", "WorkeerWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Demo3/WorkeerWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKEERWS_WSDL_LOCATION = url;
        WORKEERWS_EXCEPTION = e;
    }

    public WorkeerWS_Service() {
        super(__getWsdlLocation(), WORKEERWS_QNAME);
    }

    public WorkeerWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKEERWS_QNAME, features);
    }

    public WorkeerWS_Service(URL wsdlLocation) {
        super(wsdlLocation, WORKEERWS_QNAME);
    }

    public WorkeerWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKEERWS_QNAME, features);
    }

    public WorkeerWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkeerWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkeerWS
     */
    @WebEndpoint(name = "WorkeerWSPort")
    public WorkeerWS getWorkeerWSPort() {
        return super.getPort(new QName("http://ws/", "WorkeerWSPort"), WorkeerWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkeerWS
     */
    @WebEndpoint(name = "WorkeerWSPort")
    public WorkeerWS getWorkeerWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WorkeerWSPort"), WorkeerWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKEERWS_EXCEPTION!= null) {
            throw WORKEERWS_EXCEPTION;
        }
        return WORKEERWS_WSDL_LOCATION;
    }

}