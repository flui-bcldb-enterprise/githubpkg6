// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", namespace = "http://common.services.bcldb.com", propOrder = {})
public class ContactType {
    protected String department;
    protected String contactPerson;
    protected String email;
    protected String phoneNum;
    protected String faxNum;

    public ContactType() {
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String value) {
        this.department = value;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    public String getFaxNum() {
        return this.faxNum;
    }

    public void setFaxNum(String value) {
        this.faxNum = value;
    }
}
