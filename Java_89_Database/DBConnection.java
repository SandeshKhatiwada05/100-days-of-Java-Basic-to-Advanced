package org.JSP;

import java.sql.*;

public class DBConnection {
    public Connection con;
    public DBConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
