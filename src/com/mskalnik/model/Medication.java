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
public class Medication {
    private int medicationId;
    private String name;
    private int price;

    public Medication(int medicationId, String name, int price) {
        this.medicationId = medicationId;
        this.name = name;
        this.price = price;
    }

    public Medication(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getMedicationId() {
        return medicationId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setMedicationId(int medicationId) {
        this.medicationId = medicationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medication{" + "medicationId=" + medicationId + ", name=" + name + ", price=" + price + '}';
    }

    
}
