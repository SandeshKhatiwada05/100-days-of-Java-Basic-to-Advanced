package org.JSP.MouseKeyListenerMotionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDemo extends JFrame implements MouseListener, MouseMotionListener {

    JLabel lblmessage;
    JButton btn;

    public MouseDemo() {
        lblmessage = new JLabel("Mouse Demo");
        btn = new JButton("Click Me");  // Initialize the button

        setLayout(new FlowLayout());    // Add a layout manager (important!)
        add(lblmessage);
        add(btn);

        btn.addMouseListener(this);
        btn.addMouseMotionListener(this);

        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // good practice
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        lblmessage.setText("Mouse was clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lblmessage.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {  // This checks for platform-specific popup trigger (usually right-click)
            JPopupMenu popup = new JPopupMenu();

            JMenuItem item1 = new JMenuItem("Option 1");
            JMenuItem item2 = new JMenuItem("Option 2");
            JMenuItem item3 = new JMenuItem("Exit");

            // Add action listeners for menu items if needed
            item1.addActionListener(ae -> lblmessage.setText("Option 1 selected"));
            item2.addActionListener(ae -> lblmessage.setText("Option 2 selected"));
            item3.addActionListener(ae -> System.exit(0));  // Exit app on "Exit"

            popup.add(item1);
            popup.add(item2);
            popup.addSeparator();
            popup.add(item3);

            // Show popup menu at mouse location relative to the source component
            popup.show(e.getComponent(), e.getX(), e.getY());
        }

        lblmessage.setText("Mouse released");
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        lblmessage.setText("Mouse Motion Detected");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lblmessage.setText("Thankyou for coming here!");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        lblmessage.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseDemo();
    }
}
