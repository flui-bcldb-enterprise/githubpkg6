// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "interfaceID", "eventID", "period", "eventStatus", "keyName", "keyValue" })
@XmlRootElement(name = "GetFilteredEventsRequest")
public class GetFilteredEventsRequest {
    @XmlElement(name = "InterfaceID")
    protected String interfaceID;
    @XmlElement(name = "EventID")
    protected String eventID;
    @XmlElement(name = "Period")
    protected DateRangeType period;
    @XmlElement(name = "EventStatus")
    protected StatusEnumType eventStatus;
    @XmlElement(name = "KeyName")
    protected String keyName;
    @XmlElement(name = "KeyValue")
    protected String keyValue;

    public GetFilteredEventsRequest() {
    }

    public String getInterfaceID() {
        return this.interfaceID;
    }

    public void setInterfaceID(String value) {
        this.interfaceID = value;
    }

    public String getEventID() {
        return this.eventID;
    }

    public void setEventID(String value) {
        this.eventID = value;
    }

    public DateRangeType getPeriod() {
        return this.period;
    }

    public void setPeriod(DateRangeType value) {
        this.period = value;
    }

    public StatusEnumType getEventStatus() {
        return this.eventStatus;
    }

    public void setEventStatus(StatusEnumType value) {
        this.eventStatus = value;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public void setKeyName(String value) {
        this.keyName = value;
    }

    public String getKeyValue() {
        return this.keyValue;
    }

    public void setKeyValue(String value) {
        this.keyValue = value;
    }
}
