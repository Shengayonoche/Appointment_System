/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finals_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {



    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinic_appointment"; 
            String user = "root";
            String password = "";

            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Successfully connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}


