/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.repo;

import com.mskalnik.model.Doctor;
import com.mskalnik.model.Patient;
import java.util.List;

/**
 *
 * @author mskalnik
 */
public interface Repository {
    int insertDoctor(Doctor doctor);
    void updateDoctor(Doctor dummy, int idDoctor);
    void deleteDoctor(int idDoctor);
    Doctor getDoctor(int idDoctor);
    List<Doctor> getDoctors();    
    List<Patient> getPatientsForDoctor(int idDoctor);
}
