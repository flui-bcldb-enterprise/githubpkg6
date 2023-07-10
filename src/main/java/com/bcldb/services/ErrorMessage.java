// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.ws.WebFault;

@WebFault(name = "ServiceError", targetNamespace = "http://type.common.services.bcldb.com")
public class ErrorMessage extends Exception {
    private ServiceErrorType faultInfo;

    public ErrorMessage(String message, ServiceErrorType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public ErrorMessage(String message, ServiceErrorType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public ServiceErrorType getFaultInfo() {
        return this.faultInfo;
    }
}
