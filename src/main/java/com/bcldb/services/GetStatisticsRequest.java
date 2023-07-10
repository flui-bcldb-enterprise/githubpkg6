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
@XmlType(name = "", propOrder = { "businessEventName", "period" })
@XmlRootElement(name = "GetStatisticsRequest")
public class GetStatisticsRequest {
    @XmlElement(name = "BusinessEventName", required = true)
    protected List<String> businessEventName;
    @XmlElement(name = "Period", required = true)
    protected DateRangeType period;

    public GetStatisticsRequest() {
    }

    public List<String> getBusinessEventName() {
        if (this.businessEventName == null) {
            this.businessEventName = new ArrayList();
        }

        return this.businessEventName;
    }

    public DateRangeType getPeriod() {
        return this.period;
    }

    public void setPeriod(DateRangeType value) {
        this.period = value;
    }
}
