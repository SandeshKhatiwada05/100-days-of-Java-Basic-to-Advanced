package org.javaFX.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowEventExample extends JFrame {
    public WindowEventExample() {
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JLabel label = new JLabel("Perform Window Action");
        add(label);

        // Add WindowAdapter to handle events
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

            @Override
            public void windowActivated(WindowEvent e) {
                label.setText("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                label.setText("Window Deactivated");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventExample();
    }


    /*
    Window Event	         Description
    windowOpened	         When window is first opened
    windowClosing   	     Before window is closed
    windowClosed	         After window is closed
    windowIconified	         When window is minimized
    windowDeiconified	     When window is restored
    windowActivated	         When window gains focus
    windowDeactivated	     When window loses focus
    */
}
