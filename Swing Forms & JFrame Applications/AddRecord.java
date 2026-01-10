package org.JSP.Frame;

import org.JSP.DBConnection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class AddRecord extends JInternalFrame implements ActionListener {
    JLabel rollNo, fullName, faculty, level, gender, hobbies;
    JTextField textRollNo, textFullName;
    JComboBox lb1, lb2;
    JRadioButton male, female;
    JCheckBox coding, crying;
    JButton textSave;

    DBConnection dbc = new DBConnection();//database connection
    PreparedStatement pstm;

    public AddRecord() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        rollNo = new JLabel("Roll no: ");
        textRollNo = new JTextField(30);

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

        textSave = new JButton("Save");


        setVisible(true);
        setLayout(new FlowLayout());


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
        add(textSave);

        textSave.addActionListener(this);

        setSize(size);
        setClosable(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textSave) {

            String genderrr = (male.isSelected()) ? male.getText() : female.getText();


            // Assuming you have checkboxes coding, crying, etc.

            ArrayList<String> hobbiesList = new ArrayList<>();

            if (coding.isSelected()) {
                hobbiesList.add(coding.getText());
            }
            if (crying.isSelected()) {
                hobbiesList.add(crying.getText());
            }

            // Join the selected hobbies with a comma and space
            String mergedHobbies = String.join(", ", hobbiesList);


            try {
                pstm = dbc.con.prepareStatement("insert into Studentt values(?, ?, ?, ?, ?, ?)");
                pstm.setString(1, textRollNo.getText());
                pstm.setString(2, textFullName.getText());
                pstm.setString(3, lb1.getSelectedItem().toString());
                pstm.setString(4, lb2.getSelectedItem().toString());
                pstm.setString(5, genderrr);
                pstm.setString(6, mergedHobbies);
                int result = pstm.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Record Saved");
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to save");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }


            // Call the Display class
            //new Display(roll, name, selectedFaculty, selectedLevel, selectedGender, selectedHobbies);
        }
    }

}
