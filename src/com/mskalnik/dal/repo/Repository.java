/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.repo;

import com.mskalnik.model.Doctor;
import com.mskalnik.model.Patient;
import com.mskalnik.model.Appointment;
import com.mskalnik.model.Bill;
import com.mskalnik.model.Medication;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author mskalnik
 */
public interface Repository {
    //Patient actions
    void insertPatientMiniForm(Patient patient);
    List<Patient> getExistingPatients();
    Patient getExistingPatient(int id);
    void insertPatientComprahensiveForm(int id, Patient patient);
    
    //Doctor actions
    void insertDoctor(Doctor doctor);
    void updateDoctor(Doctor dummy, int idDoctor);
    void deleteDoctor(int id);
    Doctor getDoctor(int id);
    List<Doctor> getDoctors();    
    List<Patient> getPatientsForDoctor(int id);
    
    //Appointments
    void insertAppointments(Appointment appointment);
    void insertBill(Bill bill);
    List<Patient> getAppointment(int id);    
    List<Appointment> getAppointments();
    List<Medication> getMedications();
    Medication getMedication(int id);
    List<Bill> getBill(int id);
}
