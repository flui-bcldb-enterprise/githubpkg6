// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastChangeType", namespace = "http://common.services.bcldb.com", propOrder = {})
public class LastChangeType {
    protected String lastUpdatedBy;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastChangedDateTime;

    public LastChangeType() {
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
