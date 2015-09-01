package v3.res.soap.webservice.alarmtilt.com;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-08-04T19:26:49.097+02:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "ws-res-v3", 
                  wsdlLocation = "file:wsdl.xml",
                  targetNamespace = "com.alarmtilt.webservice.soap.res.v3") 
public class WsResV3 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("com.alarmtilt.webservice.soap.res.v3", "ws-res-v3");
    public final static QName AlarmTILTRestrictedWebServicePort = new QName("com.alarmtilt.webservice.soap.res.v3", "AlarmTILTRestrictedWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:wsdl.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsResV3.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public WsResV3(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsResV3(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsResV3() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WsResV3(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsResV3(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsResV3(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AlarmTILTRestrictedWebService
     */
    @WebEndpoint(name = "AlarmTILTRestrictedWebServicePort")
    public AlarmTILTRestrictedWebService getAlarmTILTRestrictedWebServicePort() {
        return super.getPort(AlarmTILTRestrictedWebServicePort, AlarmTILTRestrictedWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlarmTILTRestrictedWebService
     */
    @WebEndpoint(name = "AlarmTILTRestrictedWebServicePort")
    public AlarmTILTRestrictedWebService getAlarmTILTRestrictedWebServicePort(WebServiceFeature... features) {
        return super.getPort(AlarmTILTRestrictedWebServicePort, AlarmTILTRestrictedWebService.class, features);
    }

}