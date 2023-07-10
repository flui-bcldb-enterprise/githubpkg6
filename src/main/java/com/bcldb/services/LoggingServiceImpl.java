// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "LoggingServiceImpl", targetNamespace = "urn:LogService", wsdlLocation = "file:/D:/tools/Jenkins/workspace/logging-service-wsdl-business-release/target/checkout/src/wsdl/LogService_Business.wsdl")
public class LoggingServiceImpl extends Service {
    private static final URL LOGGINGSERVICEIMPL_WSDL_LOCATION;
    private static final WebServiceException LOGGINGSERVICEIMPL_EXCEPTION;
    private static final QName LOGGINGSERVICEIMPL_QNAME = new QName("urn:LogService", "LoggingServiceImpl");

    public LoggingServiceImpl() {
        super(__getWsdlLocation(), LOGGINGSERVICEIMPL_QNAME);
    }

    public LoggingServiceImpl(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGGINGSERVICEIMPL_QNAME, features);
    }

    public LoggingServiceImpl(URL wsdlLocation) {
        super(wsdlLocation, LOGGINGSERVICEIMPL_QNAME);
    }

    public LoggingServiceImpl(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGGINGSERVICEIMPL_QNAME, features);
    }

    public LoggingServiceImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoggingServiceImpl(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "LoggingServiceImplPort")
    public LoggingPort getLoggingServiceImplPort() {
        return (LoggingPort) super.getPort(new QName("urn:LogService", "LoggingServiceImplPort"), LoggingPort.class);
    }

    @WebEndpoint(name = "LoggingServiceImplPort")
    public LoggingPort getLoggingServiceImplPort(WebServiceFeature... features) {
        return (LoggingPort) super.getPort(new QName("urn:LogService", "LoggingServiceImplPort"), LoggingPort.class,
                features);
    }

    private static URL __getWsdlLocation() {
        if (LOGGINGSERVICEIMPL_EXCEPTION != null) {
            throw LOGGINGSERVICEIMPL_EXCEPTION;
        } else {
            return LOGGINGSERVICEIMPL_WSDL_LOCATION;
        }
    }

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            url = new URL(
                    "file:/D:/tools/Jenkins/workspace/logging-service-wsdl-business-release/target/checkout/src/wsdl/LogService_Business.wsdl");
        } catch (MalformedURLException var3) {
            e = new WebServiceException(var3);
        }

        LOGGINGSERVICEIMPL_WSDL_LOCATION = url;
        LOGGINGSERVICEIMPL_EXCEPTION = e;
    }
}
