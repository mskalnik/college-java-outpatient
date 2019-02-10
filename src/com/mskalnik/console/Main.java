/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.console;

import com.mskalnik.bl.PatientsHandler;
import com.mskalnik.model.Doctor;
import com.mskalnik.model.Patient;

/**
 *
 * @author mskalnik
 */
public class Main {
    private static final PatientsHandler PATIENTS_HANDLER = new PatientsHandler();
   
    public static void start() {
        System.out.println("Patients:\n--------------------------------------------------");
        for (Patient patient : PATIENTS_HANDLER.getExistingPatients()) {
            System.out.println("ID: " + patient.getOpid() + ", " + patient.getFirstName() + " " + patient.getMiddleName() + " " + patient.getSurname());
        }
    }
}
