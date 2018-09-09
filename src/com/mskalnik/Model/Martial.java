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
public class Martial {
    private String martialStatus;

    public Martial() {}  

    public Martial(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    @Override
    public String toString() {
        return "Martial{" + "martialStatus=" + martialStatus + '}';
    }
}
