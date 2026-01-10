package org.JSP.Frame;

import org.JSP.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingleDisplay extends JInternalFrame implements ActionListener {
    ResultSet rs;
    PreparedStatement preparedStatement;
    DBConnection dbc;

    JTable table;
    DefaultTableModel model;

    JLabel rollNo;
    JTextField txtRollNo;
    JButton search;

    SingleDisplay() {
        // Input panel
        rollNo = new JLabel("Roll no: ");
        txtRollNo = new JTextField(10);
        search = new JButton("Search");
        search.addActionListener(this);

        JPanel topPanel = new JPanel();
        topPanel.add(rollNo);
        topPanel.add(txtRollNo);
        topPanel.add(search);
        add(topPanel, BorderLayout.NORTH);

        // Table and model (created only once)
        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp, BorderLayout.CENTER);

        // Define columns once
        model.addColumn("Rollno");
        model.addColumn("Fullname");
        model.addColumn("Faculty");
        model.addColumn("Level");
        model.addColumn("Gender");
        model.addColumn("Hobbies");

        // Frame setup
        setTitle("Display Students");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String rollText = txtRollNo.getText().trim();
            if (rollText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter a Roll Number");
                return;
            }

            try {
                int roll = Integer.parseInt(rollText);

                dbc = new DBConnection();
                preparedStatement = dbc.con.prepareStatement("SELECT * FROM studentt WHERE rollno = ?");
                preparedStatement.setInt(1, roll);
                rs = preparedStatement.executeQuery();

                model.setRowCount(0); // clear previous data

                if (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "No record found for Roll No: " + roll);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Roll Number");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }
}
