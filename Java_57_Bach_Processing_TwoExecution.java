package org.JSP;
import java.sql.*;

public class TwoExecution {
    static Connection con;
    public static void main(String[] args) throws Exception{
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");
        }
        catch (Exception e){
            e.printStackTrace();
        }


        Statement stmt = con.createStatement();
        con.setAutoCommit(false);

        stmt.addBatch("update studentt set fullname='Saisa Koirala' where fullname ='I am Aerobin' ");
        stmt.addBatch("insert into studentt values ('22', 'Saima', 'CSIT', '8th Semester', 'Female', 'coding')");

        try{
            stmt.executeBatch();
            System.out.println("Batch Executed");
            con.commit();
        }
        catch (Exception ex){
            try{
                con.rollback();
                System.out.println("Batch Cancalled");
                ex.printStackTrace();
            }
            catch (Exception el){
                System.out.println(el);
            }
        }

    }
}