package Frame;

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
        mnuro.add(miedit);
        mnuro.add(midel);

        mnure.add(miall);
        mnure.add(miindv);

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
    }
}
