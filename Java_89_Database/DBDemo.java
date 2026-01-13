package org.JSP;


import java.sql.*;

//1. Connection
//2. Statement
//3. Prepared statement
//4. ResultSet

public class DBDemo {

    public static void main(String[] args) {
        try {
            //1. Load Driver
//            Class.forName("com.mysql.jdbc.Driver");


            //2. Get Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            System.out.printf("%-5s %-20s %-30s %-20s%n", "ID", "Name", "Email", "Course");  // Header
            System.out.printf("%-5s %-20s %-30s %-20s%n", "--", "----", "-----", "------");  // Separator

            while (rs.next()) {
                System.out.printf("%-5d %-20s %-30s %-20s%n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

