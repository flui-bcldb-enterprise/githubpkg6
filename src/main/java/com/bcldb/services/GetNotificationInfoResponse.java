// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "businessEventName", "businessProcessName", "status", "severity", "primaryEmail",
        "secondaryEmail" })
@XmlRootElement(name = "GetNotificationInfoResponse")
public class GetNotificationInfoResponse {
    @XmlElement(name = "BusinessEventName", required = true)
    protected String businessEventName;
    @XmlElement(name = "BusinessProcessName", required = true)
    protected String businessProcessName;
    @XmlElement(name = "Status", required = true, nillable = true)
    protected StatusEnumType status;
    @XmlElement(name = "Severity", required = true)
    protected SeverityEnumType severity;
    @XmlElement(name = "PrimaryEmail")
    protected String primaryEmail;
    @XmlElement(name = "SecondaryEmail")
    protected String secondaryEmail;

    public GetNotificationInfoResponse() {
    }

    public String getBusinessEventName() {
        return this.businessEventName;
    }

    public void setBusinessEventName(String value) {
        this.businessEventName = value;
    }

    public String getBusinessProcessName() {
        return this.businessProcessName;
    }

    public void setBusinessProcessName(String value) {
        this.businessProcessName = value;
    }

    public StatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnumType value) {
        this.status = value;
    }

    public SeverityEnumType getSeverity() {
        return this.severity;
    }

    public void setSeverity(SeverityEnumType value) {
        this.severity = value;
    }

    public String getPrimaryEmail() {
        return this.primaryEmail;
    }

    public void setPrimaryEmail(String value) {
        this.primaryEmail = value;
    }

    public String getSecondaryEmail() {
        return this.secondaryEmail;
    }

    public void setSecondaryEmail(String value) {
        this.secondaryEmail = value;
    }
}
