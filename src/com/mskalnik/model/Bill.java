/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

import java.util.List;

/**
 *
 * @author mskalnik
 */
public class Bill {
    private int idBill;
    private Patient patient;
    private Medication medication;
    private Integer diagnosis;
    private Boolean payed;

    public Bill(int idBill, Patient patient, Medication medication, Integer diagnosis, Boolean payed) {
        this.idBill = idBill;
        this.patient = patient;
        this.medication = medication;
        this.diagnosis = diagnosis;
        this.payed = payed;
    }

    public Bill(Patient patient, Medication medication, Integer diagnosis, Boolean payed) {
        this.patient = patient;
        this.medication = medication;
        this.diagnosis = diagnosis;
        this.payed = payed;
    }

    public int getIdBill() {
        return idBill;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medication getMedication() {
        return medication;
    }

    public Integer getDiagnosis() {
        return diagnosis;
    }

    public Boolean getPayed() {
        return payed;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public void setDiagnosis(Integer diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    @Override
    public String toString() {
        return "Bill{" + "idBill=" + idBill + ", patient=" + patient + ", medication=" + medication + ", diagnosis=" + diagnosis + ", payed=" + payed + '}';
    }

    
    
}
