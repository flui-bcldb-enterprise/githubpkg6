// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "event" })
@XmlRootElement(name = "PostEventRequest")
public class PostEventRequest {
    @XmlElement(name = "Event", required = true)
    protected EventType event;

    public PostEventRequest() {
    }

    public EventType getEvent() {
        return this.event;
    }

    public void setEvent(EventType value) {
        this.event = value;
    }
}
