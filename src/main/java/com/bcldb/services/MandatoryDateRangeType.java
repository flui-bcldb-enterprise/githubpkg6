// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandatoryDateRangeType", namespace = "http://common.services.bcldb.com", propOrder = { "dateFrom",
        "dateTo" })
public class MandatoryDateRangeType {
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;

    public MandatoryDateRangeType() {
    }

    public XMLGregorianCalendar getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    public XMLGregorianCalendar getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }
}
