package org.JSP.Frame;

import org.JSP.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModifyRecord extends JInternalFrame implements ActionListener {
    JLabel rollNo, fullName, faculty, level, gender, hobbies;
    JTextField textFullName;
    JComboBox textRollNo, lb1, lb2;
    JRadioButton male, female;
    JCheckBox coding, crying;
    JButton btnUpdate;

    DBConnection dbc = new DBConnection();//database connection
    PreparedStatement pstm;

    public ModifyRecord() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        rollNo = new JLabel("Roll no: ");
        textRollNo = new JComboBox();
        try {
            Statement statement = dbc.con.createStatement();
            ResultSet rs = statement.executeQuery("select rollno from Studentt");
            while (rs.next()) {
                textRollNo.addItem(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        textRollNo.addActionListener(this);


        fullName = new JLabel("Fullname");
        textFullName = new JTextField(30);

        faculty = new JLabel("Faculty");
        lb1 = new JComboBox();
        lb1.addItem("CSIT");
        lb1.addItem("BIM");

        level = new JLabel("Level");
        lb2 = new JComboBox();
        lb2.addItem("1st Semester");
        lb2.addItem("2nd Semester");
        lb2.addItem("3rd Semester");
        lb2.addItem("4th Semester");
        lb2.addItem("5th Semester");
        lb2.addItem("6th Semester");
        lb2.addItem("7th Semester");
        lb2.addItem("8th Semester");

        gender = new JLabel("Gender");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup genderr = new ButtonGroup();
        genderr.add(male);
        genderr.add(female);


        hobbies = new JLabel("Hobbies");
        coding = new JCheckBox("coding");
        crying = new JCheckBox("crying");

        btnUpdate = new JButton("Update");


        setVisible(true);
        setLayout(new FlowLayout());
        setSize(450, 560);

        add(rollNo);
        add(textRollNo);
        add(fullName);
        add(textFullName);
        add(faculty);
        add(lb1);
        add(level);
        add(lb2);
        add(gender);
        add(male);
        add(female);
        add(hobbies);
        add(coding);
        add(crying);
        add(btnUpdate);

        btnUpdate.addActionListener(this);

        setSize(size);
        setClosable(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textRollNo) {
            try {
                PreparedStatement pstm = dbc.con.prepareStatement(
                        "select * from Studentt where rollno=?");
                pstm.setString(1, textRollNo.getSelectedItem().toString());
                ResultSet rs = pstm.executeQuery();
                if (rs.next()) {
                    //name
                    textFullName.setText(rs.getString(2));
                    //faculty
                    lb1.setSelectedItem(rs.getString(3));
                    //level
                    lb2.setSelectedItem(rs.getString(4));
                    //gender
                    if (rs.getString(5).equalsIgnoreCase("male")) {
                        male.setSelected(true);
                    } else {
                        female.setSelected(true);
                    }

                    //hobbies
                    String hobbyString = rs.getString(6);

                    coding.setSelected(false);
                    crying.setSelected(false);

                    if (hobbyString != null && !hobbyString.trim().isEmpty()) {
                        String[] selectedHobbies = hobbyString.split(",");
                        for (String h : selectedHobbies) {
                            String trimmed = h.trim().toLowerCase();
                            if (trimmed.equals("coding")) {
                                coding.setSelected(true);
                            } else if (trimmed.equals("crying")) {
                                crying.setSelected(true);
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == btnUpdate) {
            try {
                ArrayList<String> hobbiesList = new ArrayList<>();

                if (coding.isSelected()) {
                    hobbiesList.add(coding.getText());
                }
                if (crying.isSelected()) {
                    hobbiesList.add(crying.getText());
                }
                // Join the selected hobbies with a comma and space
                String hobbies = String.join(", ", hobbiesList);


                // Get gender
                String gender = male.isSelected() ? "Male" : "Female";

                // Prepare SQL update
                PreparedStatement ps = dbc.con.prepareStatement(
                        "UPDATE Studentt SET fullname=?, faculty=?, level=?, gender=?, hobbies=? WHERE rollno=?"
                );

                // Set values
                ps.setString(1, textFullName.getText());
                ps.setString(2, lb1.getSelectedItem().toString());
                ps.setString(3, lb2.getSelectedItem().toString());
                ps.setString(4, gender);
                ps.setString(5, hobbies);
                ps.setInt(6, Integer.parseInt(textRollNo.getSelectedItem().toString()));

                // Run update
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record Updated Successfully");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }



    }
}


