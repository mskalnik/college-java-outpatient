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
public class BloodType {
    private String type;

    public BloodType() {}
    
    public BloodType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BloodType{" + "type=" + type + '}';
    }
}
