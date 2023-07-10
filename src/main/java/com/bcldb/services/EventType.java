// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventType", propOrder = { "eventID", "businessEventName", "instanceID", "process",
        "referenceInformation" })
public class EventType {
    @XmlElement(name = "EventID")
    protected String eventID;
    @XmlElement(name = "BusinessEventName", required = true)
    protected String businessEventName;
    @XmlElementRef(name = "InstanceID", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceID;
    @XmlElement(name = "Process", required = true, nillable = true)
    protected List<ProcessType> process;
    @XmlElement(name = "ReferenceInformation")
    protected ReferenceType referenceInformation;

    public EventType() {
    }

    public String getEventID() {
        return this.eventID;
    }

    public void setEventID(String value) {
        this.eventID = value;
    }

    public String getBusinessEventName() {
        return this.businessEventName;
    }

    public void setBusinessEventName(String value) {
        this.businessEventName = value;
    }

    public JAXBElement<String> getInstanceID() {
        return this.instanceID;
    }

    public void setInstanceID(JAXBElement<String> value) {
        this.instanceID = value;
    }

    public List<ProcessType> getProcess() {
        if (this.process == null) {
            this.process = new ArrayList();
        }

        return this.process;
    }

    public ReferenceType getReferenceInformation() {
        return this.referenceInformation;
    }

    public void setReferenceInformation(ReferenceType value) {
        this.referenceInformation = value;
    }
}
