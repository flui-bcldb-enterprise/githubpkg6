// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id" })
@XmlRootElement(name = "GetIDResponse")
public class GetIDResponse {
    @XmlElement(name = "ID", required = true)
    protected String id;

    public GetIDResponse() {
    }

    public String getID() {
        return this.id;
    }

    public void setID(String value) {
        this.id = value;
    }
}
