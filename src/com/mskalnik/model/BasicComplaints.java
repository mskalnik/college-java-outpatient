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
public class BasicComplaints {
    private String statement;
    private String historyOfPrevious;
    private String physicianTreated;

    public String getStatement() {
        return statement;
    }

    public String getHistoryOfPrevious() {
        return historyOfPrevious;
    }

    public String getPhysicianTreated() {
        return physicianTreated;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void setHistoryOfPrevious(String historyOfPrevious) {
        this.historyOfPrevious = historyOfPrevious;
    }

    public void setPhysicianTreated(String physicianTreated) {
        this.physicianTreated = physicianTreated;
    }

    @Override
    public String toString() {
        return "BasicComplaints{" + "statement=" + statement + ", historyOfPrevious=" + historyOfPrevious + ", physicianTreated=" + physicianTreated + '}';
    }
}
