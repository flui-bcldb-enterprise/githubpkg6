// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processType", propOrder = { "processID", "businessProcessName", "instanceID", "sourceSystemName",
        "targetSystemName", "status", "domainName", "optionalField1", "optionalField2", "optionalField3",
        "optionalField4", "optionalField5", "messagePayLoad", "creationDateTime", "lastChangeDateTime", "incident" })
public class ProcessType {
    @XmlElement(name = "ProcessID", required = true)
    protected String processID;
    @XmlElement(name = "BusinessProcessName", required = true)
    protected String businessProcessName;
    @XmlElementRef(name = "InstanceID", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceID;
    @XmlElementRef(name = "SourceSystemName", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSystemName;
    @XmlElementRef(name = "TargetSystemName", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetSystemName;
    @XmlElementRef(name = "Status", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<StatusEnumType> status;
    @XmlElementRef(name = "DomainName", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domainName;
    @XmlElementRef(name = "OptionalField1", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optionalField1;
    @XmlElementRef(name = "OptionalField2", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optionalField2;
    @XmlElementRef(name = "OptionalField3", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optionalField3;
    @XmlElementRef(name = "OptionalField4", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optionalField4;
    @XmlElementRef(name = "OptionalField5", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optionalField5;
    @XmlElementRef(name = "MessagePayLoad", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messagePayLoad;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "LastChangeDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDateTime;
    @XmlElement(name = "Incident", nillable = true)
    protected List<IncidentType> incident;

    public ProcessType() {
    }

    public String getProcessID() {
        return this.processID;
    }

    public void setProcessID(String value) {
        this.processID = value;
    }

    public String getBusinessProcessName() {
        return this.businessProcessName;
    }

    public void setBusinessProcessName(String value) {
        this.businessProcessName = value;
    }

    public JAXBElement<String> getInstanceID() {
        return this.instanceID;
    }

    public void setInstanceID(JAXBElement<String> value) {
        this.instanceID = value;
    }

    public JAXBElement<String> getSourceSystemName() {
        return this.sourceSystemName;
    }

    public void setSourceSystemName(JAXBElement<String> value) {
        this.sourceSystemName = value;
    }

    public JAXBElement<String> getTargetSystemName() {
        return this.targetSystemName;
    }

    public void setTargetSystemName(JAXBElement<String> value) {
        this.targetSystemName = value;
    }

    public JAXBElement<StatusEnumType> getStatus() {
        return this.status;
    }

    public void setStatus(JAXBElement<StatusEnumType> value) {
        this.status = value;
    }

    public JAXBElement<String> getDomainName() {
        return this.domainName;
    }

    public void setDomainName(JAXBElement<String> value) {
        this.domainName = value;
    }

    public JAXBElement<String> getOptionalField1() {
        return this.optionalField1;
    }

    public void setOptionalField1(JAXBElement<String> value) {
        this.optionalField1 = value;
    }

    public JAXBElement<String> getOptionalField2() {
        return this.optionalField2;
    }

    public void setOptionalField2(JAXBElement<String> value) {
        this.optionalField2 = value;
    }

    public JAXBElement<String> getOptionalField3() {
        return this.optionalField3;
    }

    public void setOptionalField3(JAXBElement<String> value) {
        this.optionalField3 = value;
    }

    public JAXBElement<String> getOptionalField4() {
        return this.optionalField4;
    }

    public void setOptionalField4(JAXBElement<String> value) {
        this.optionalField4 = value;
    }

    public JAXBElement<String> getOptionalField5() {
        return this.optionalField5;
    }

    public void setOptionalField5(JAXBElement<String> value) {
        this.optionalField5 = value;
    }

    public JAXBElement<String> getMessagePayLoad() {
        return this.messagePayLoad;
    }

    public void setMessagePayLoad(JAXBElement<String> value) {
        this.messagePayLoad = value;
    }

    public XMLGregorianCalendar getCreationDateTime() {
        return this.creationDateTime;
    }

    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    public XMLGregorianCalendar getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    public void setLastChangeDateTime(XMLGregorianCalendar value) {
        this.lastChangeDateTime = value;
    }

    public List<IncidentType> getIncident() {
        if (this.incident == null) {
            this.incident = new ArrayList();
        }

        return this.incident;
    }
}
