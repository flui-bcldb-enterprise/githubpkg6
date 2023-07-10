// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventStatisticsType", propOrder = { "businessEventName", "period", "numberOfRun", "numberOfFailure",
        "lastRun", "avgRunTime" })
public class EventStatisticsType {
    @XmlElement(name = "BusinessEventName", required = true)
    protected String businessEventName;
    @XmlElement(name = "Period")
    protected DateRangeType period;
    @XmlElement(name = "NumberOfRun")
    protected int numberOfRun;
    @XmlElement(name = "NumberOfFailure")
    protected int numberOfFailure;
    @XmlElement(name = "LastRun")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRun;
    @XmlElement(name = "AVGRunTime")
    protected BigDecimal avgRunTime;

    public EventStatisticsType() {
    }

    public String getBusinessEventName() {
        return this.businessEventName;
    }

    public void setBusinessEventName(String value) {
        this.businessEventName = value;
    }

    public DateRangeType getPeriod() {
        return this.period;
    }

    public void setPeriod(DateRangeType value) {
        this.period = value;
    }

    public int getNumberOfRun() {
        return this.numberOfRun;
    }

    public void setNumberOfRun(int value) {
        this.numberOfRun = value;
    }

    public int getNumberOfFailure() {
        return this.numberOfFailure;
    }

    public void setNumberOfFailure(int value) {
        this.numberOfFailure = value;
    }

    public XMLGregorianCalendar getLastRun() {
        return this.lastRun;
    }

    public void setLastRun(XMLGregorianCalendar value) {
        this.lastRun = value;
    }

    public BigDecimal getAVGRunTime() {
        return this.avgRunTime;
    }

    public void setAVGRunTime(BigDecimal value) {
        this.avgRunTime = value;
    }
}
