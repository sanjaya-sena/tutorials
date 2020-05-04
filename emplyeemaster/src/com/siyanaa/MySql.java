package com.siyanaa;

import java.sql.*;

public class MySql {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3301/employeemaster";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "1234";

    public void saveEmployee(Employee employee){
        Connection conn = null;
        Statement stmt = null;

        try{
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Open connection
            conn = DriverManager.getConnection(JDBC_URL,DB_USERNAME,DB_PASSWORD);

            //Execute query
            stmt = conn.createStatement();
            String values = employee.getEmployeeId()+",'"+employee.getName()+"'";
            String sqlQuery = "INSERT INTO employee(employeeId,employeeName) VALUES ("+values+")";
            System.out.println(sqlQuery);
            stmt.execute(sqlQuery);

            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
