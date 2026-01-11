package org.JSP.MouseKeyListenerMotionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerr extends JFrame implements KeyListener {

    private JTextField textField;
    private JLabel displayLabel;

    public KeyListenerr(){
        setTitle("Typed Text Display");



        textField = new JTextField(50);
        textField.addKeyListener(this);
        add(textField);


        displayLabel = new JLabel("Typed Text: ");
        add(displayLabel);

        setLayout(null);
        textField.setBounds(10, 20, 1000, 25);
        displayLabel.setBounds(10, 50, 1000, 25);

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);

        setSize(700, 700);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        displayLabel.setText("Typed Text: "+ textField.getText() + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        new KeyListenerr();
    }
}
