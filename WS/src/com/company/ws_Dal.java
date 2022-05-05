package com.company;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ws_Dal {

    static String username ="root";
    static String password ="";
    static String URL="jdbc:mysql://localhost:3306/ws";
    public Connection getConnection() throws SQLException {

        return (Connection) DriverManager.getConnection(URL,username,password);
    }

    public void  ShowError(SQLException exception){

        System.out.println("Error:"+exception.getMessage());

        System.out.println("Error code:"+exception.getErrorCode());
    }
}



