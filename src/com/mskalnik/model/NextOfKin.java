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
public class NextOfKin extends Person {
    
    private int idNextOfKin;
    private String relationship;
    
    public NextOfKin(String firstName, String middleName, String lastName, String relationship) {
        super(firstName, middleName, lastName);
        this.relationship = relationship;
    }    
    
    public int getIdNextOfKin() {
        return idNextOfKin;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setIdNextOfKin(int idNextOfKin) {
        this.idNextOfKin = idNextOfKin;
    }

    public void setRelationship(String Relationship) {
        this.relationship = Relationship;
    }

    @Override
    public String toString() {
        return "NextOfKin{" + "idNextOfKin=" + idNextOfKin + ", Relationship=" + relationship + '}';
    }

    
}
