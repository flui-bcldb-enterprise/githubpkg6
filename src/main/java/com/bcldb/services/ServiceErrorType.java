// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceErrorType", namespace = "http://type.common.services.bcldb.com", propOrder = { "origin",
        "errorCode", "errorMessage", "timestamp", "severity" })
public class ServiceErrorType {
    protected String origin;
    protected int errorCode;
    @XmlElement(required = true)
    protected String errorMessage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected SeverityType severity;

    public ServiceErrorType() {
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String value) {
        this.origin = value;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    public XMLGregorianCalendar getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    public SeverityType getSeverity() {
        return this.severity;
    }

    public void setSeverity(SeverityType value) {
        this.severity = value;
    }
}
