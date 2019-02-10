/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.bl;

import com.mskalnik.model.Appointment;
import com.mskalnik.model.Bill;
import com.mskalnik.model.Medication;
import com.mskalnik.model.Patient;
import java.util.List;

/**
 *
 * @author mskalnik
 */
public class AppointmentsHandler extends HandlerBase {   
    public void insertAppointments(Appointment appointment) {
        repository.insertAppointments(appointment);
    }
    
    public void insertBill(Bill bill) {
        repository.insertBill(bill);
    }
    
    public List<Appointment> getAppointments() {
        return repository.getAppointments();
    }
    
    public List<Medication> getMedications() {
        return repository.getMedications();
    }
    
    public Medication getMedication(int id) {
        return repository.getMedication(id);
    }
    
    public List<Bill> getBill(int id) {
        return repository.getBill(id);
    }
}
