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
public class MedicalComplaints {
    private String diabetic;
    private String hypertensive;
    private String cardicCondition;
    private String respiratoryCondition;
    private String diagestiveCondition;
    private String orthopedicCondition;
    private String muscularCondition;
    private String neurologicalCondition;
    private String knownAllergies;
    private String knownAdverseReactionToDrugs;
    private String majorSurgeries;

    public MedicalComplaints() {}

    public MedicalComplaints(String diabetic, String hypertensive, String cardicCondition, String respiratoryCondition, String diagestiveCondition, String orthopedicCondition, String muscularCondition, String neurologicalCondition, String knownAllergies, String knownAdverseReactionToDrugs, String majorSurgeries) {
        this.diabetic = diabetic;
        this.hypertensive = hypertensive;
        this.cardicCondition = cardicCondition;
        this.respiratoryCondition = respiratoryCondition;
        this.diagestiveCondition = diagestiveCondition;
        this.orthopedicCondition = orthopedicCondition;
        this.muscularCondition = muscularCondition;
        this.neurologicalCondition = neurologicalCondition;
        this.knownAllergies = knownAllergies;
        this.knownAdverseReactionToDrugs = knownAdverseReactionToDrugs;
        this.majorSurgeries = majorSurgeries;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public String getHypertensive() {
        return hypertensive;
    }

    public String getCardicCondition() {
        return cardicCondition;
    }

    public String getRespiratoryCondition() {
        return respiratoryCondition;
    }

    public String getDiagestiveCondition() {
        return diagestiveCondition;
    }

    public String getOrthopedicCondition() {
        return orthopedicCondition;
    }

    public String getMuscularCondition() {
        return muscularCondition;
    }

    public String getNeurologicalCondition() {
        return neurologicalCondition;
    }

    public String getKnownAllergies() {
        return knownAllergies;
    }

    public String getKnownAdverseReactionToDrugs() {
        return knownAdverseReactionToDrugs;
    }

    public String getMajorSurgeries() {
        return majorSurgeries;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public void setHypertensive(String hypertensive) {
        this.hypertensive = hypertensive;
    }

    public void setCardicCondition(String cardicCondition) {
        this.cardicCondition = cardicCondition;
    }

    public void setRespiratoryCondition(String respiratoryCondition) {
        this.respiratoryCondition = respiratoryCondition;
    }

    public void setDiagestiveCondition(String diagestiveCondition) {
        this.diagestiveCondition = diagestiveCondition;
    }

    public void setOrthopedicCondition(String orthopedicCondition) {
        this.orthopedicCondition = orthopedicCondition;
    }

    public void setMuscularCondition(String muscularCondition) {
        this.muscularCondition = muscularCondition;
    }

    public void setNeurologicalCondition(String neurologicalCondition) {
        this.neurologicalCondition = neurologicalCondition;
    }

    public void setKnownAllergies(String knownAllergies) {
        this.knownAllergies = knownAllergies;
    }

    public void setKnownAdverseReactionToDrugs(String knownAdverseReactionToDrugs) {
        this.knownAdverseReactionToDrugs = knownAdverseReactionToDrugs;
    }

    public void setMajorSurgeries(String majorSurgeries) {
        this.majorSurgeries = majorSurgeries;
    }

    @Override
    public String toString() {
        return "MedicalComplaints{" + "diabetic=" + diabetic + ", hypertensive=" + hypertensive + ", cardicCondition=" + cardicCondition + ", respiratoryCondition=" + respiratoryCondition + ", diagestiveCondition=" + diagestiveCondition + ", orthopedicCondition=" + orthopedicCondition + ", muscularCondition=" + muscularCondition + ", neurologicalCondition=" + neurologicalCondition + ", knownAllergies=" + knownAllergies + ", knownAdverseReactionToDrugs=" + knownAdverseReactionToDrugs + ", majorSurgeries=" + majorSurgeries + '}';
    }
}
