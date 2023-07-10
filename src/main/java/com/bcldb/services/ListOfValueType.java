// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfValueType", propOrder = { "name", "values" })
public class ListOfValueType {
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected List<ListValueType> values;

    public ListOfValueType() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public List<ListValueType> getValues() {
        if (this.values == null) {
            this.values = new ArrayList();
        }

        return this.values;
    }
}
