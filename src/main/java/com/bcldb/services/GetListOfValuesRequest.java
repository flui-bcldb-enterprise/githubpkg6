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
@XmlType(name = "", propOrder = { "lovName" })
@XmlRootElement(name = "GetListOfValuesRequest")
public class GetListOfValuesRequest {
    @XmlElement(required = true)
    protected List<String> lovName;

    public GetListOfValuesRequest() {
    }

    public List<String> getLovName() {
        if (this.lovName == null) {
            this.lovName = new ArrayList();
        }

        return this.lovName;
    }
}
