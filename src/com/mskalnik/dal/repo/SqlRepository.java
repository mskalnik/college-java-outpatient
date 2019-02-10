/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.repo;

import com.mskalnik.dal.sql.DataSourceSignleton;
import com.mskalnik.model.Appointment;
import com.mskalnik.model.Contact;
import com.mskalnik.model.Doctor;
import com.mskalnik.model.Medication;
import com.mskalnik.model.NextOfKin;
import com.mskalnik.model.Patient;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author mskalnik
 */
public class SqlRepository implements Repository {
    //Patient
    private static final String INSERT_PATIENT_MINI_FORM = "{ CALL insertPatientMiniForm (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
    private static final String GET_EXISTING_PATIENTS = "{ CALL getExistingPatients }";
    private static final String GET_EXISTING_PATIENT = "{ CALL getExistingPatient (?) }";
    
    private static final String INSERT_DOCTOR = "{ CALL insertDoctor (?, ?, ?, ?) }";
    private static final String UPDATE_DOCTOR = "{ CALL updateDoctor (?,?,?,?) }";
    private static final String DELETE_DOCTOR = "{ CALL deleteDoctor (?) }";
    private static final String GET_DOCTOR = "{ CALL getDoctor (?) }";
    private static final String GET_DOCTORS = "{ CALL getDoctors }";
    private static final String GET_PATIENTS_FOR_DOCTOR = "{ CALL getPatientsForDoctor (?) }";
    
    private static final String INSERT_APPOINTMENTS = "{ CALL insertAppointments (?, ?, ?) }";
    private static final String GET_APPOINTMENTS = "{ CALL getAppointments }";
    private static final String GET_APPOINTMENT = "{ CALL getAppointment (?) }";
    private static final String GET_MEDICATIONS = "{ CALL getMedications }";
    
    @Override
    public void insertDoctor(Doctor doctor) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = (Connection) dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_DOCTOR)) {
            stmt.setString(1, doctor.getFirstName());
            stmt.setString(2, doctor.getMiddleName());
            stmt.setString(3, doctor.getSurname());            
            stmt.setString(4, doctor.getTitle());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(Doctor dummy, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDoctor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor getDoctor(int id) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTOR)){
                stmt.setInt(1, id);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Doctor(
                        resultSet.getInt("IDDoctor"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("MiddleName"),
                        resultSet.getString("Surname"),
                        resultSet.getString("Title"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTORS);
                ResultSet resultSet = stmt.executeQuery()) {
                    while (resultSet.next()) {
                        doctors.add(
                            new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getString("Title"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MiddleName"),
                                resultSet.getString("Surname"))
                            );
                    }
            return doctors;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public List<Patient> getPatientsForDoctor(int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertPatientMiniForm(Patient patient) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = (Connection) dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_PATIENT_MINI_FORM)) {
            stmt.setString(1, patient.getFirstName());
            stmt.setString(2, patient.getMiddleName());
            stmt.setString(3, patient.getSurname());            
            stmt.setDate(4, Date.valueOf(patient.getDateOfBirth())); 
            stmt.setString(5, patient.getComplaint());
            stmt.setString(6, patient.getContact().getTelephoneHome());            
            stmt.setString(7, patient.getContact().getTelephoneWork());
            stmt.setString(8, patient.getNextOfKin().getFirstName());            
            stmt.setString(9, patient.getNextOfKin().getMiddleName());          
            stmt.setString(10, patient.getNextOfKin().getSurname());        
            stmt.setString(11, patient.getNextOfKin().getRelationship());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void insertPatientComprahensiveForm(int id, Patient patient) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = (Connection) dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_PATIENT_MINI_FORM)) {            
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Patient> getExistingPatients() {
        List<Patient> patients = new ArrayList<>();
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_EXISTING_PATIENTS);
                ResultSet resultSet = stmt.executeQuery()) {
                    while (resultSet.next()) {
                        patients.add(
                            new Patient(
                                resultSet.getInt("OPID"),
                                resultSet.getString("FirstName"),
                                resultSet.getString("MiddleName"),
                                resultSet.getString("Surname"),
                                resultSet.getDate("DateOfBirth").toLocalDate(),
                                new NextOfKin(
                                    resultSet.getString("KinFirstName"),
                                    resultSet.getString("KinMiddleName"),
                                    resultSet.getString("KinLastName"),
                                    resultSet.getString("Relationship")),
                                resultSet.getString("Complaint"),
                                new Contact(
                                    resultSet.getString("TelephoneHome"),
                                    resultSet.getString("TelephoneWork"))
                            ));
                    }
            return patients;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return patients;
    }
    
    @Override
    public Patient getExistingPatient(int id) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_EXISTING_PATIENT)){
                stmt.setInt(1, id);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Patient(
                        resultSet.getInt("OPID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("MiddleName"),
                        resultSet.getString("Surname"),
                        resultSet.getDate("DateOfBirth").toLocalDate(),
                        new NextOfKin(
                            resultSet.getString("KinFirstName"),
                            resultSet.getString("KinMiddleName"),
                            resultSet.getString("KinLastName"),
                            resultSet.getString("Relationship")),
                        resultSet.getString("Complaint"),
                        new Contact(
                            resultSet.getString("TelephoneHome"),
                            resultSet.getString("TelephoneWork")));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insertAppointments(Appointment appointment) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = (Connection) dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_APPOINTMENTS)) {  
            stmt.setInt(1, appointment.getDoctor().getIdDoctor());
            stmt.setInt(2, appointment.getPatient().getOpid());
            stmt.setDate(3, Date.valueOf(appointment.getDate())); 
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Appointment> getAppointment(int doctorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Appointment> getAppointments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medication> getMedications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
