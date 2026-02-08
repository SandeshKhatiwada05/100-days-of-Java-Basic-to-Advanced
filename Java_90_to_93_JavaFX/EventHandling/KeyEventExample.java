package org.javaFX.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends JFrame implements KeyListener {

    JTextField textField;
    JLabel label;

    public KeyEventExample() {
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Press any key");
        add(label);

        textField = new JTextField(15);
        textField.addKeyListener(this); // Registering KeyListener
        add(textField);

        setVisible(true);
    }

    // Triggered when a key is typed (pressed and released)
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    // Triggered when a key is pressed down
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    // Triggered when a key is released
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
