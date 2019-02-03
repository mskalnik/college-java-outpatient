/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.dal.sql;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import javax.sql.DataSource;

/**
 *
 * @author mskalnik
 */
public class DataSourceSignleton {
    private static final String SERVER_NAME = ".\\SQLSERVER";
    private static final String DATABASE_NAME = "OutPatientManagement";
    private static final String USER = "sa";
    private static final String PASSWORD = "SQL";    

    public DataSourceSignleton() {}
    
    private static DataSource instance;
    
    public static DataSource getInstance() {
        if (instance == null)
            instance = createInstance();
        return instance;
    }
    
    private static DataSource createInstance() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DATABASE_NAME);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }
}
