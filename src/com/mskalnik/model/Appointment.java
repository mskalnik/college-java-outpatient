/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

import java.time.LocalDate;

/**
 *
 * @author mskalnik
 */
public class Appointment {
    private int id;
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;

    public Appointment(int id, Doctor doctor, Patient patient, LocalDate date) {
        this.id = id;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    
    public Appointment(Doctor doctor, Patient patient, LocalDate date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDate(LocalDate date) {
        this.date = date;        
    }

    
    
}
