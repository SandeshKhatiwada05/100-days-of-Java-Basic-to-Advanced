package org.javaFX.EventHandling;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventExample implements FocusListener {
    JTextField field1, field2;
    JLabel label1, label2;

    public FocusEventExample() {
        JFrame frame = new JFrame("Focus Event Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("This field shows focus gained");
        label2 = new JLabel("This field shows focus lost");
        frame.add(label1);
        frame.add(label2);

        field1 = new JTextField(10);
        field2 = new JTextField(10);

        field1.addFocusListener(this);
        field2.addFocusListener(this);

        frame.add(field1);
        frame.add(field2);

        frame.setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == field1) {
            label1.setText("Field 1 gained focus");
        } else if (e.getSource() == field2) {
            label1.setText("Field 2 gained focus");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == field1) {
            label2.setText("Field 1 lost focus");
        } else if (e.getSource() == field2) {
            label2.setText("Field 2 lost focus");
        }
    }

    public static void main(String[] args) {
        new FocusEventExample();
    }
}
