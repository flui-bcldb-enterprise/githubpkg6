// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "severityType", namespace = "http://type.common.services.bcldb.com")
@XmlEnum
public enum SeverityType {
    WARN,
    MINOR,
    MAJOR,
    CRITICAL;

    private SeverityType() {
    }

    public String value() {
        return this.name();
    }

    public static SeverityType fromValue(String v) {
        return valueOf(v);
    }
}
