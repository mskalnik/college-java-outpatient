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
public class PersonalDetails {
    private Martial martialStatus;
    private int noOfDependents;
    private double height;
    private double weight;
    private BloodType bloodType;

    public PersonalDetails() {
    }

    public PersonalDetails(Martial martialStatus, int noOfDependents, double height, double weight, BloodType bloodType) {
        this.martialStatus = martialStatus;
        this.noOfDependents = noOfDependents;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    public Martial getMartialStatus() {
        return martialStatus;
    }

    public int getNoOfDependents() {
        return noOfDependents;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setMartialStatus(Martial martialStatus) {
        this.martialStatus = martialStatus;
    }

    public void setNoOfDependents(int noOfDependents) {
        this.noOfDependents = noOfDependents;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" + "martialStatus=" + martialStatus + ", noOfDependents=" + noOfDependents + ", height=" + height + ", weight=" + weight + ", bloodType=" + bloodType + '}';
    }
}
