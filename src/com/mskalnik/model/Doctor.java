/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

import java.util.Objects;

/**
 *
 * @author mskalnik
 */
public class Doctor extends Person {
    private String title;

    public Doctor(String title, String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Doctor{" + "title=" + title + '}';
    }    
}
