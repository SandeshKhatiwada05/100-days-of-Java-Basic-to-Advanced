package org.JSP.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu mnuro, mnure, mnuhelp;
    JMenuItem miadd, miedit, midel, miall, miindv, miabt;
    JDesktopPane desktopPane;


    public MainForm(){
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        mb = new JMenuBar();

        desktopPane = new JDesktopPane();
        add(desktopPane);
        desktopPane.setBackground(Color.getHSBColor(263, 51, 71));

        mnuro = new JMenu("Record Operation");
        mnure = new JMenu("Report");
        mnuhelp = new JMenu("Help");

        miadd = new JMenuItem("Add Record");
        miedit = new JMenuItem("Modify Record");
        midel = new JMenuItem("Delete");

        miall = new JMenuItem("All Record");
        miindv =  new JMenuItem("Search Individual");
        miabt = new JMenuItem("About Application");

        setJMenuBar(mb);
        mb.add(mnuro);
        mb.add(mnure);
        mb.add(mnuhelp);

        mnuro.add(miadd);
        miadd.addActionListener(this);
        miedit.addActionListener(this);
        mnuro.add(miedit);
        mnuro.add(midel);
        midel.addActionListener(this);

        mnure.add(miall);
        miall.addActionListener(this);
        mnure.add(miindv);
        miindv.addActionListener(this);

        mnuhelp.add(miabt);

        setVisible(true);
//        setSize(550,500);
        setSize(size);


    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
         new MainForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miadd){
            desktopPane.add(new AddRecord());
            desktopPane.show();
        }

        if(e.getSource()==miedit){
            desktopPane.add(new ModifyRecord());
            desktopPane.show();
        }

        if(e.getSource()==midel){
            desktopPane.add(new DeleteRecord());
            desktopPane.show();
        }

        if(e.getSource()==miall){
            desktopPane.add(new DisplayJTable());
            desktopPane.show();
        }

        if(e.getSource()==miindv){
            desktopPane.add(new SingleDisplay());
            desktopPane.show();
        }
    }
}
