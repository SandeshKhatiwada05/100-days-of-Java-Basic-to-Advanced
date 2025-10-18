package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRecord extends JInternalFrame implements ActionListener {
    JLabel rollNo, fullName, faculty, level, gender, hobbies;
    JTextField textRollNo, textFullName;
    JComboBox lb1, lb2;
    JRadioButton male, female;
    JCheckBox coding, crying;
    JButton textSave;

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
        add(textSave);

        textSave.addActionListener(this);

        setSize(size);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textSave) {
            // Get all the entered values
            String roll = textRollNo.getText();
            String name = textFullName.getText();
            String selectedFaculty = (String) lb1.getSelectedItem();
            String selectedLevel = (String) lb2.getSelectedItem();
            String selectedGender = male.isSelected() ? "Male" : "Female";
            String[] selectedHobbies = new String[2];
            if (coding.isSelected()) selectedHobbies[0] = "Coding ";
            if (crying.isSelected()) selectedHobbies[1] = "Crying";

            // Call the Display class
            new Display(roll, name, selectedFaculty, selectedLevel, selectedGender, selectedHobbies);
        }
    }

}
