/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

/**
 *
 * @author mskalnik
 */
public class Contact {
    private Address presentAddress;
    private Address permanentAddress;
    private String telephoneWork;
    private String telephoneHome;
    private String mobile;
    private String pager;
    private String fax;

    public Contact() {}

    public Contact(Address presentAddress, Address permanentAddress, String telephoneWork, String telephoneHome, String mobile, String pager, String fax) {
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.telephoneWork = telephoneWork;
        this.telephoneHome = telephoneHome;
        this.mobile = mobile;
        this.pager = pager;
        this.fax = fax;
    }

    public Address getPresentAddress() {
        return presentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public String getTelephoneWork() {
        return telephoneWork;
    }

    public String getTelephoneHome() {
        return telephoneHome;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPager() {
        return pager;
    }

    public String getFax() {
        return fax;
    }

    public void setPresentAddress(Address presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setTelephoneWork(String telephoneWork) {
        this.telephoneWork = telephoneWork;
    }

    public void setTelephoneHome(String telephoneHome) {
        this.telephoneHome = telephoneHome;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Contact{" + "presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress + ", telephoneWork=" + telephoneWork + ", telephoneHome=" + telephoneHome + ", mobile=" + mobile + ", pager=" + pager + ", fax=" + fax + '}';
    } 
}
