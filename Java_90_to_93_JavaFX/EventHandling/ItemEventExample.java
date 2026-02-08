package org.javaFX.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventExample implements ItemListener {
    JCheckBox checkBox;
    JComboBox comboBox;
    JLabel label;

    public ItemEventExample() {
        JFrame frame = new JFrame("Item Event Demo");
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Make a selection");

        checkBox = new JCheckBox("I Agree");
        checkBox.addItemListener(this);

        comboBox = new JComboBox();
        comboBox.addItem("Apple");
        comboBox.addItem("Banana");
        comboBox.addItem("Mango");
        comboBox.addItemListener(this);

        frame.add(checkBox);
        frame.add(comboBox);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox) {
            if (checkBox.isSelected()) {
                label.setText("Checkbox Selected");
            } else {
                label.setText("Checkbox Unselected");
            }
        }

        if (e.getSource() == comboBox) {
            label.setText("Selected: " + comboBox.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new ItemEventExample();
    }
}
