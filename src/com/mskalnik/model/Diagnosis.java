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
public class Diagnosis {
    private Doctor doctor;
    private Patient patient;
    private String diagnosis;
    private Medication medication;
    private Doctor specialist;
    private Boolean payed;

    public Diagnosis(Doctor doctor, Patient patient, String diagnosis, Medication medication, Doctor specialist,Boolean payed) {
        this.doctor = doctor;
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.medication = medication;
        this.specialist = specialist;
        this.payed = payed;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Medication getMedication() {
        return medication;
    }

    public Doctor getSpecialist() {
        return specialist;
    }

    public Boolean getPayed() {
        return payed;
    }   

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public void setSpecialist(Doctor specialist) {
        this.specialist = specialist;
    }

    public void setPayed(Boolean payed) {
        this.payed = payed;
    }
    
    @Override
    public String toString() {
        return "Diagnosis{" + "doctor=" + doctor + ", patient=" + patient + ", diagnosis=" + diagnosis + ", medication=" + medication + ", specialist=" + specialist + '}';
    }

    
}
