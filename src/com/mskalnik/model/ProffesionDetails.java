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
public class ProffesionDetails {    
    private String occupation;
    private int grossAnnualIncome;

    public ProffesionDetails() {}

    public ProffesionDetails(String occupation, int grossAnnualIncome) {
        this.occupation = occupation;
        this.grossAnnualIncome = grossAnnualIncome;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getGrossAnnualIncome() {
        return grossAnnualIncome;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setGrossAnnualIncome(int grossAnnualIncome) {
        this.grossAnnualIncome = grossAnnualIncome;
    }

    @Override
    public String toString() {
        return "ProffesionDetails{" + "occupation=" + occupation + ", grossAnnualIncome=" + grossAnnualIncome + '}';
    }
}
