package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameLogin extends Frame implements ActionListener {

    Label lblUser, lblpass;
    TextField txtuser, txtpass;
    Button btnlogin, btnClose;

    public FrameLogin(){
        lblUser = new Label("User Name");
        lblpass = new Label("Password");

        txtuser = new TextField(20);
        txtpass = new TextField(20);
//        txtpass.setEchoChar('*');  // Optional: hide password input

        btnlogin = new Button("Login");
        btnClose = new Button("Close");

        setLayout(new FlowLayout());

        add(lblUser); add(txtuser);
        add(lblpass); add(txtpass);
        add(btnlogin); add(btnClose);

        setTitle("Login Frame");
        setVisible(true);
        setSize(350, 300);

        btnClose.addActionListener(this);//added event to close button
        btnlogin.addActionListener(this);
    }


    public static void main(String[] args) {
        new FrameLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnClose){
            System.exit(0);
        }

        if(e.getSource()==btnlogin){
            JOptionPane.showMessageDialog(null, "Login Button Clicked");
        }
    }
}
