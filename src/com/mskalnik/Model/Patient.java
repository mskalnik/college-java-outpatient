/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.Model;

import java.util.Date;

/**
 *
 * @author mskalnik
 */
public class Patient extends Person {
    //Basic
    private int opid;
    private Date dateOfBirth;
    private char sex;
    private String Complaint;
    private Contact contact;
    private PersonalDetails personalDetails;
    private ProffesionDetails proffesionDetails;
    private Lifestyle lifestyle;
    private BasicComplaints basicComplaints;
    private MedicalComplaints medicalComplaints;

    public Patient(String firstName, String surname) {
        super(firstName, surname);
    }

    public Patient(String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
    }

    public Patient(int opid, Date dateOfBirth, char sex, String Complaint, Contact contact, PersonalDetails personalDetails, ProffesionDetails proffesionDetails, Lifestyle lifestyle, BasicComplaints basicComplaints, MedicalComplaints medicalComplaints, String firstName, String surname) {
        super(firstName, surname);
        this.opid = opid;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.Complaint = Complaint;
        this.contact = contact;
        this.personalDetails = personalDetails;
        this.proffesionDetails = proffesionDetails;
        this.lifestyle = lifestyle;
        this.basicComplaints = basicComplaints;
        this.medicalComplaints = medicalComplaints;
    }

    public Patient(int opid, Date dateOfBirth, char sex, String Complaint, Contact contact, PersonalDetails personalDetails, ProffesionDetails proffesionDetails, Lifestyle lifestyle, BasicComplaints basicComplaints, MedicalComplaints medicalComplaints, String firstName, String middleName, String surname) {
        super(firstName, middleName, surname);
        this.opid = opid;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.Complaint = Complaint;
        this.contact = contact;
        this.personalDetails = personalDetails;
        this.proffesionDetails = proffesionDetails;
        this.lifestyle = lifestyle;
        this.basicComplaints = basicComplaints;
        this.medicalComplaints = medicalComplaints;
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

    @Override
    public String toString() {
        return "Patient{" + "opid=" + opid + ", dateOfBirth=" + dateOfBirth + ", sex=" + sex + ", Complaint=" + Complaint + ", contact=" + contact + ", personalDetails=" + personalDetails + ", proffesionDetails=" + proffesionDetails + ", lifestyle=" + lifestyle + ", basicComplaints=" + basicComplaints + ", medicalComplaints=" + medicalComplaints + '}';
    }
}
