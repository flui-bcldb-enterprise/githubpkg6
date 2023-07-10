// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "statusEnumType")
@XmlEnum
public enum StatusEnumType {
    SUCCESS,
    FAILURE_BUSINESS,
    FAILURE_SYSTEM;

    private StatusEnumType() {
    }

    public String value() {
        return this.name();
    }

    public static StatusEnumType fromValue(String v) {
        return valueOf(v);
    }
}
