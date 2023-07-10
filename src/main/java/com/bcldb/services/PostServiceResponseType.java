// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postServiceResponseType", namespace = "http://type.common.services.bcldb.com", propOrder = { "success",
        "serviceError", "auxMessage" })
public class PostServiceResponseType {
    protected boolean success;
    protected ServiceErrorType serviceError;
    protected String auxMessage;

    public PostServiceResponseType() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean value) {
        this.success = value;
    }

    public ServiceErrorType getServiceError() {
        return this.serviceError;
    }

    public void setServiceError(ServiceErrorType value) {
        this.serviceError = value;
    }

    public String getAuxMessage() {
        return this.auxMessage;
    }

    public void setAuxMessage(String value) {
        this.auxMessage = value;
    }
}
