// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "severityEnumType")
@XmlEnum
public enum SeverityEnumType {
    FATAL,
    ERROR,
    WARNING,
    INFO,
    DEBUG;

    private SeverityEnumType() {
    }

    public String value() {
        return this.name();
    }

    public static SeverityEnumType fromValue(String v) {
        return valueOf(v);
    }
}
