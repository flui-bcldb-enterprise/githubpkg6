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
@XmlType(name = "", propOrder = { "event" })
@XmlRootElement(name = "GetEventsResponse")
public class GetEventsResponse {
    @XmlElement(name = "Event")
    protected List<EventType> event;

    public GetEventsResponse() {
    }

    public List<EventType> getEvent() {
        if (this.event == null) {
            this.event = new ArrayList();
        }

        return this.event;
    }
}
