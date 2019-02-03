/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.repo;

import com.mskalnik.dal.sql.DataSourceSignleton;
import com.mskalnik.model.Doctor;
import com.mskalnik.model.Patient;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author mskalnik
 */
public class SqlRepository implements Repository {

    private static final String INSERT_DOCTOR = "{ CALL insertDoctor }";
    private static final String UPDATE_DOCTOR = "{ CALL updateDoctor (?,?,?,?) }";
    private static final String DELETE_DOCTOR = "{ CALL deleteDoctor (?) }";
    private static final String GET_DOCTOR = "{ CALL getDoctor (?) }";
    private static final String GET_DOCTORS = "{ CALL getDoctors }";
    private static final String GET_PATIENTS_FOR_DOCTOR = "{ CALL getPatientsForDoctor (?) }";

    @Override
    public int insertDoctor(Doctor doctor) {
        DataSource dataSource = DataSourceSignleton.getInstance();
        try (Connection con = (Connection) dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(INSERT_DOCTOR)) {
            stmt.executeUpdate();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void updateDoctor(Doctor dummy, int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDoctor(int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor getDoctor(int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> getDoctors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Patient> getPatientsForDoctor(int idDoctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
