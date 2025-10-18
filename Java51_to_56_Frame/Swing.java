package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener {

    JLabel lblUser, lblpass;
    JTextField txtuser;
    JPasswordField password;
    JButton btnlogin, btnClose;

    public Swing(){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        lblUser = new JLabel("User Name");
        lblpass = new JLabel("Password");

        txtuser = new JTextField(20);
        password = new JPasswordField(20);

        btnlogin = new JButton("Login");
        btnClose = new JButton("Close");

        setLayout(null);

        add(lblUser);
        lblUser.setBounds(10,20,100,25); // (StartX, StartY, Length, Height)
        add(txtuser);
        txtuser.setBounds(150,20,150,25);
        add(lblpass);
        lblpass.setBounds(10, 55, 100, 25);
        add(password);
        password.setBounds(150, 55, 150, 25);
        add(btnlogin);
        btnlogin.setBounds(10, 90, 120, 25 );
        add(btnClose);
        btnClose.setBounds(150, 90, 120, 25);


        setTitle("Login Frame");
        setVisible(true);
//        setSize(350, 300);
        setSize(size);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        btnClose.addActionListener(this);//added event to close button
        btnlogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnClose){
            System.exit(0);
        }

        if(e.getSource()==btnlogin){
            JOptionPane.showMessageDialog(null, "You Clicked on Login");
            new MainForm();
        }
    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        new Swing();
    }

}

