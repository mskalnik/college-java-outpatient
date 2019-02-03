/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

import java.util.Date;

/**
 *
 * @author mskalnik
 */
public class Patient extends Person {
    private int opid;
    private Date dateOfBirth;
    private char sex;
    private NextOfKin nextOfKin;
    private String Complaint;
    private Contact contact;
    private PersonalDetails personalDetails;
    private ProffesionDetails proffesionDetails;
    private Lifestyle lifestyle;
    private BasicComplaints basicComplaints;
    private MedicalComplaints medicalComplaints;

    public Patient(String firstName, String middleName, String surname, Date dateOfBirth, NextOfKin nextOfKin, String Complaint, Contact contact) {
        super(firstName, middleName, surname);
        this.dateOfBirth = dateOfBirth;
        this.nextOfKin = nextOfKin;
        this.Complaint = Complaint;
        this.contact = contact;
    }
    
    public Patient(String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
    }

    public int getOpid() {
        return opid;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public String getComplaint() {
        return Complaint;
    }

    public Contact getContact() {
        return contact;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public ProffesionDetails getProffesionDetails() {
        return proffesionDetails;
    }

    public Lifestyle getLifestyle() {
        return lifestyle;
    }

    public BasicComplaints getBasicComplaints() {
        return basicComplaints;
    }

    public MedicalComplaints getMedicalComplaints() {
        return medicalComplaints;
    }

    public void setOpid(int opid) {
        this.opid = opid;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setComplaint(String Complaint) {
        this.Complaint = Complaint;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public void setProffesionDetails(ProffesionDetails proffesionDetails) {
        this.proffesionDetails = proffesionDetails;
    }

    public void setLifestyle(Lifestyle lifestyle) {
        this.lifestyle = lifestyle;
    }

    public void setBasicComplaints(BasicComplaints basicComplaints) {
        this.basicComplaints = basicComplaints;
    }

    public void setMedicalComplaints(MedicalComplaints medicalComplaints) {
        this.medicalComplaints = medicalComplaints;
    }

    public NextOfKin getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(NextOfKin nextOfKin) {
        this.nextOfKin = nextOfKin;
    }  
    
    @Override
    public String toString() {
        return "Patient{" + "opid=" + opid + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", Complaint=" + Complaint + ", contact=" + contact + ", personalDetails=" + personalDetails + ", proffesionDetails=" + proffesionDetails + ", lifestyle=" + lifestyle + ", basicComplaints=" + basicComplaints + ", medicalComplaints=" + medicalComplaints + '}';
    }
}
