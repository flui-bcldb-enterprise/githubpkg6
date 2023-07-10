// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryValueType", namespace = "http://common.services.bcldb.com", propOrder = { "value",
        "currencyLabel" })
public class MonetaryValueType {
    @XmlElement(required = true, defaultValue = "0")
    protected String value;
    @XmlElement(required = true, defaultValue = "CAD")
    protected String currencyLabel;

    public MonetaryValueType() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrencyLabel() {
        return this.currencyLabel;
    }

    public void setCurrencyLabel(String value) {
        this.currencyLabel = value;
    }
}
