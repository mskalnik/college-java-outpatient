/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.bl;

import com.mskalnik.model.Patient;

/**
 *
 * @author mskalnik
 */
public class PatientsHandler extends HandlerBase {
    
    public void insertPatientMiniForm(Patient patient) {
        repository.insertPatientMiniForm(patient);        
    }
    
    
}
