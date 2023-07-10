// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "status", "businessEventName", "period" })
@XmlRootElement(name = "GetEventByStatusRequest")
public class GetEventByStatusRequest {
    @XmlElement(name = "Status", required = true)
    protected StatusEnumType status;
    @XmlElement(name = "BusinessEventName")
    protected String businessEventName;
    @XmlElement(name = "Period")
    protected DateRangeType period;

    public GetEventByStatusRequest() {
    }

    public StatusEnumType getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnumType value) {
        this.status = value;
    }

    public String getBusinessEventName() {
        return this.businessEventName;
    }

    public void setBusinessEventName(String value) {
        this.businessEventName = value;
    }

    public DateRangeType getPeriod() {
        return this.period;
    }

    public void setPeriod(DateRangeType value) {
        this.period = value;
    }
}
