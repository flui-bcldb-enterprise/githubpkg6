// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "version", "built" })
@XmlRootElement(name = "GetVersionResponse", namespace = "http://common.services.bcldb.com")
public class GetVersionResponse {
    @XmlElement(namespace = "http://common.services.bcldb.com", required = true)
    protected String version;
    @XmlElement(namespace = "http://common.services.bcldb.com")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar built;

    public GetVersionResponse() {
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public XMLGregorianCalendar getBuilt() {
        return this.built;
    }

    public void setBuilt(XMLGregorianCalendar value) {
        this.built = value;
    }
}
