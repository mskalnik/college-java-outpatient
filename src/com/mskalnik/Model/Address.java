/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.Model;

/**
 *
 * @author mskalnik
 */
public class Address {
    private String door;
    private String street;
    private String area;
    private String city;
    private String state;
    private String pincode;

    public Address() {}  
    
    public Address(String door, String street, String area, String city, String state, String pincode) {
        this.door = door;
        this.street = street;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getDoor() {
        return door;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "door=" + door + ", street=" + street + ", area=" + area + ", city=" + city + ", state=" + state + ", pincode=" + pincode + '}';
    }
}
