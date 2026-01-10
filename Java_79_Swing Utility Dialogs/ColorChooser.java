package org.JSP.ColorAndFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame implements ActionListener {

    JButton btn;

    public ColorChooser(){
        btn = new JButton("Click me");
        btn.addActionListener(this);

        add(btn);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            Color color = JColorChooser.showDialog(this, "Select color of Label", Color.black);
            btn.setForeground(color);
        }
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}
