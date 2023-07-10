// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "incidentType", propOrder = { "businessProcessStep", "faultName", "message", "severity",
        "creationDateTime", "optionalField1", "optionalField2", "optionalField3", "optionalField4", "optionalField5" })
public class IncidentType {
    @XmlElementRef(name = "BusinessProcessStep", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessProcessStep;
    @XmlElementRef(name = "FaultName", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> faultName;
    @XmlElementRef(name = "Message", namespace = "http://logservice.services.bcldb.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "Severity", required = true)
    protected SeverityEnumType severity;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
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

    public IncidentType() {
    }

    public JAXBElement<String> getBusinessProcessStep() {
        return this.businessProcessStep;
    }

    public void setBusinessProcessStep(JAXBElement<String> value) {
        this.businessProcessStep = value;
    }

    public JAXBElement<String> getFaultName() {
        return this.faultName;
    }

    public void setFaultName(JAXBElement<String> value) {
        this.faultName = value;
    }

    public JAXBElement<String> getMessage() {
        return this.message;
    }

    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    public SeverityEnumType getSeverity() {
        return this.severity;
    }

    public void setSeverity(SeverityEnumType value) {
        this.severity = value;
    }

    public XMLGregorianCalendar getCreationDateTime() {
        return this.creationDateTime;
    }

    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
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
}
