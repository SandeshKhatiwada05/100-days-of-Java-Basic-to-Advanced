package org.javaFX.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends JFrame {

    JLabel label;

    public AdapterExample() {
        setTitle("Adapter Class Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Click inside the window");
        add(label);

        // 🖱️ Use MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("You clicked at "+ e.getX()+","+e.getY());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}
