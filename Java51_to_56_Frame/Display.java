package Frame;

import javax.swing.*;
import java.awt.*;

public class Display extends JInternalFrame {
    public Display(String roll, String name, String faculty, String level, String gender, String[] hobbies) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Display Information");
        setLayout(new GridLayout(6, 1));
        setSize(size);


        add(new JLabel("Roll No: " + roll));
        add(new JLabel("Full Name: " + name));
        add(new JLabel("Faculty: " + faculty));
        add(new JLabel("Level: " + level));
        add(new JLabel("Gender: " + gender));
        add(new JLabel(("Hobbies:")));
        for(int i=0; i<hobbies.length; i++) {
            add(new JLabel( hobbies[i]));
        }
        setVisible(true);

    }
}

