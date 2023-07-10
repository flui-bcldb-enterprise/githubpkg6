// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bcldb.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAddressType", namespace = "http://common.services.bcldb.com", propOrder = {})
public class GenericAddressType {
    protected String addressLine1;
    protected String addressLine2;
    protected String cityTown;
    protected String provinceStateRegion;
    protected String postalCodeZip;
    protected String country;
    protected String geoCode;

    public GenericAddressType() {
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    public String getCityTown() {
        return this.cityTown;
    }

    public void setCityTown(String value) {
        this.cityTown = value;
    }

    public String getProvinceStateRegion() {
        return this.provinceStateRegion;
    }

    public void setProvinceStateRegion(String value) {
        this.provinceStateRegion = value;
    }

    public String getPostalCodeZip() {
        return this.postalCodeZip;
    }

    public void setPostalCodeZip(String value) {
        this.postalCodeZip = value;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getGeoCode() {
        return this.geoCode;
    }

    public void setGeoCode(String value) {
        this.geoCode = value;
    }
}
