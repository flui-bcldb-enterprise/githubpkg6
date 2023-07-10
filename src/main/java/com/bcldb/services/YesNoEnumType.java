// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "yesNoEnumType", namespace = "http://common.services.bcldb.com")
@XmlEnum
public enum YesNoEnumType {
    YES,
    NO;

    private YesNoEnumType() {
    }

    public String value() {
        return this.name();
    }

    public static YesNoEnumType fromValue(String v) {
        return valueOf(v);
    }
}
