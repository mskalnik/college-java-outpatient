/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.bl;

import com.mskalnik.model.Doctor;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mskalnik
 */
public class DoctorHandler extends HandlerBase {
    
    public int insertDoctor(Doctor doctor) {
        return repository.insertDoctor(doctor);        
    }

    public void updateDoctor(Doctor doctor, int id) {
        repository.updateDoctor(doctor, id);        
    }

    public void deleteDoctor(int id) {
        repository.deleteDoctor(id);        
    }

    public Doctor getDoctor(int id) {
        return repository.getDoctor(id);
    }

    public List<Doctor> getDoctors() {
        return repository.getDoctors();
    }
    
    public List<Doctor> getDoctorsSortedBySurname() {
        List<Doctor> doctors = getDoctors();
        doctors.sort(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor d1, Doctor d2) {
                return d1.getSurname().compareTo(d2.getSurname());
            }
        });
        return doctors;       
    }
    
}
