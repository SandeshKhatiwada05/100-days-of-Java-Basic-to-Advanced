package org.JSP;

import java.sql.*;

public class AllPasses {
    static Connection con;

    public static void main(String[] args) throws Exception {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

