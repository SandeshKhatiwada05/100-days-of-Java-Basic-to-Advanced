package org.javaFX.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionCommandDemo implements ActionListener {
    JButton redButton, greenButton, blueButton;
    JLabel label;

    public ActionCommandDemo() {
        JFrame frame = new JFrame("ActionCommand Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        label = new JLabel("Choose a color");
        frame.add(label);

        redButton = new JButton("Red");
        redButton.setActionCommand("RED");
        redButton.addActionListener(this);
        frame.add(redButton);

        greenButton = new JButton("Green");
        greenButton.setActionCommand("GREEN");
        greenButton.addActionListener(this);
        frame.add(greenButton);

        blueButton = new JButton("Blue");
        blueButton.setActionCommand("BLUE");
        blueButton.addActionListener(this);
        frame.add(blueButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand(); // 🎯 identify source
        switch (cmd) {
            case "RED":
                label.setText("You chose Red");
                break;
            case "GREEN":
                label.setText("You chose Green");
                break;
            case "BLUE":
                label.setText("You chose Blue");
                break;
        }
    }

    public static void main(String[] args) {
        new ActionCommandDemo();
    }
}

