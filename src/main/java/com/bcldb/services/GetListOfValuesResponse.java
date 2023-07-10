// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "listOfValues" })
@XmlRootElement(name = "GetListOfValuesResponse")
public class GetListOfValuesResponse {
    @XmlElement(name = "ListOfValues", required = true)
    protected List<ListOfValueType> listOfValues;

    public GetListOfValuesResponse() {
    }

    public List<ListOfValueType> getListOfValues() {
        if (this.listOfValues == null) {
            this.listOfValues = new ArrayList();
        }

        return this.listOfValues;
    }
}
