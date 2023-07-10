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
@XmlType(name = "", propOrder = { "eventID" })
@XmlRootElement(name = "GetEventsRequest")
public class GetEventsRequest {
    @XmlElement(name = "EventID", required = true)
    protected List<String> eventID;

    public GetEventsRequest() {
    }

    public List<String> getEventID() {
        if (this.eventID == null) {
            this.eventID = new ArrayList();
        }

        return this.eventID;
    }
}
