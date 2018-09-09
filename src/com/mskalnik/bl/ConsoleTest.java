/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.bl;

/**
 *
 * @author mskalnik
 */
public class ConsoleTest {    
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. House");
        doctor.setSurname("Pizda");
        
        System.out.println(doctor + " Pizda: " + isPizda(doctor.getSurname()).toString());
    }
    
    public static Boolean isPizda(String text) {
        return text.equals("Pizda");
    }
    
}
