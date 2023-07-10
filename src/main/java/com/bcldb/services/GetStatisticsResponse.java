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
@XmlType(name = "", propOrder = { "eventSummary" })
@XmlRootElement(name = "GetStatisticsResponse")
public class GetStatisticsResponse {
    @XmlElement(name = "EventSummary")
    protected List<EventStatisticsType> eventSummary;

    public GetStatisticsResponse() {
    }

    public List<EventStatisticsType> getEventSummary() {
        if (this.eventSummary == null) {
            this.eventSummary = new ArrayList();
        }

        return this.eventSummary;
    }
}
