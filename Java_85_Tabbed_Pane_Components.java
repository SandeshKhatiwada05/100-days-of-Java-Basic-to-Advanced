package org.JSP.TabbedPane;

import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo extends JFrame {
    JTabbedPane jtb;

    public TabbedPaneDemo(){
        jtb = new JTabbedPane();
        jtb.addTab("Register", new RegisterPanel());
        jtb.addTab("Login", new LoginPanel());
        add(jtb);
        setVisible(true);
        setSize(600,600);
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}


class LoginPanel extends JPanel {
    JLabel lblUser, lblPass;
    JTextField txtUser, txtPass;
    JButton btnLogin;

    public LoginPanel(){
        lblUser = new JLabel("Name ");
        lblPass = new JLabel("Password ");

        txtUser = new JTextField(50);
        txtPass = new JTextField(50);

        btnLogin = new JButton("Login");

        add(lblUser);   add(txtUser);
        add(lblPass);   add(txtPass);
        add(btnLogin);
        setLayout(new FlowLayout());
    }
}

class RegisterPanel extends JPanel {
    JLabel lblUser, lblPass, lblAge;
    JTextField txtUser, txtPass, txtAge;
    JButton btnLogin;

    public RegisterPanel(){
        lblUser = new JLabel("Name ");
        lblPass = new JLabel("Password ");
        lblAge = new JLabel("Age ");

        txtUser = new JTextField(50);
        txtPass = new JTextField(50);
        txtAge = new JTextField(30);

        btnLogin = new JButton("Register");

        add(lblUser);   add(txtUser);
        add(lblPass);   add(txtPass);
        add(lblAge);    add(txtAge);
        add(btnLogin);
        setLayout(new FlowLayout());
    }
}