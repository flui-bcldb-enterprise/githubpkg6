// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastChangeDateTimeType", namespace = "http://common.services.bcldb.com", propOrder = {})
public class LastChangeDateTimeType {
    protected String lastUpdatedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangedDateTime;

    public LastChangeDateTimeType() {
    }

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    public XMLGregorianCalendar getLastChangedDateTime() {
        return this.lastChangedDateTime;
    }

    public void setLastChangedDateTime(XMLGregorianCalendar value) {
        this.lastChangedDateTime = value;
    }
}
