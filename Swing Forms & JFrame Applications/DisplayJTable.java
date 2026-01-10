package org.JSP.Frame;

import org.JSP.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayJTable extends JInternalFrame {
    ResultSet rs;
    Statement stmt;
    DBConnection dbc;
    JTable table;
    DefaultTableModel model;

    DisplayJTable() {
        // Create table model and JTable
        model = new DefaultTableModel();
        table = new JTable(model);

        // Define columns
        model.addColumn("Rollno");
        model.addColumn("Fullname");
        model.addColumn("Faculty");
        model.addColumn("Level");
        model.addColumn("Gender");
        model.addColumn("Hobbies");

        // Populate data
        try {
            dbc = new DBConnection();
            stmt = dbc.con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM studentt");
            System.out.println(rs);
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ScrollPane setup
        JScrollPane jsp = new JScrollPane(table);
        setLayout(new BorderLayout()); // Fix applied here
        add(jsp, BorderLayout.CENTER);

        setVisible(true);
        setSize(700, 400);
        setTitle("Display Students");
        setClosable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
