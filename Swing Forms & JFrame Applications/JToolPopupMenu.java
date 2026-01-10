package org.JSP.Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JToolPopupMenu extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu mnuro, mnure, mnuhelp;
    JMenuItem miadd, miedit, midel, miall, miindv, miabt;
    JDesktopPane desktopPane;
    JButton btnAdd, btnEdit, btnDelete, btnView, btnIndiv;


    public JToolPopupMenu() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        mb = new JMenuBar();

        desktopPane = new JDesktopPane();
        add(desktopPane);
        desktopPane.setBackground(Color.getHSBColor(263, 51, 71));

        mnuro = new JMenu("Record Operation");
        mnuro.setMnemonic(KeyEvent.VK_O);
        mnure = new JMenu("Report");
        mnure.setMnemonic(KeyEvent.VK_R);
        mnuhelp = new JMenu("Help");
        mnuhelp.setMnemonic(KeyEvent.VK_H);

        miadd = new JMenuItem("Add Record");
        //ctrl_mask : setaccelerator
        miedit = new JMenuItem("Modify Record");
        midel = new JMenuItem("Delete");

        miall = new JMenuItem("All Record");
        miindv = new JMenuItem("Search Individual");
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

        //Toolbar setup
        JToolBar toolBar = new JToolBar();


        // ADD BUTTON ICON
        ImageIcon addIconRaw = new ImageIcon("src/main/resources/Icons/add.png");
        Image addScaled = addIconRaw.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        btnAdd = new JButton(new ImageIcon(addScaled));
        btnAdd.setToolTipText("Add Record");

        // EDIT BUTTON ICON
        ImageIcon editIconRaw = new ImageIcon("src/main/resources/Icons/edit.png");
        Image editScaled = editIconRaw.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        btnEdit = new JButton(new ImageIcon(editScaled));
        btnEdit.setToolTipText("Edit Record");

        // DELETE BUTTON ICON
        ImageIcon deleteIconRaw = new ImageIcon("src/main/resources/Icons/delete.png");
        Image deleteScaled = deleteIconRaw.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        btnDelete = new JButton(new ImageIcon(deleteScaled));
        btnDelete.setToolTipText("Delete Record");

        // VIEW BUTTON ICON
        ImageIcon viewIconRaw = new ImageIcon("src/main/resources/Icons/view.png");
        Image viewScaled = viewIconRaw.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        btnView = new JButton(new ImageIcon(viewScaled));
        btnView.setToolTipText("View Record");

        // INDVIDUAL VIEW BUTTON ICON
        ImageIcon viewIndivIconRaw = new ImageIcon("src/main/resources/Icons/indiv.png");
        Image viewIndivScaled = viewIndivIconRaw.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        btnIndiv = new JButton(new ImageIcon(viewIndivScaled));
        btnIndiv.setToolTipText("View Record");


        btnAdd.addActionListener(this);
        btnEdit.addActionListener(this);
        btnDelete.addActionListener(this);
        btnView.addActionListener(this);
        btnIndiv.addActionListener(this);

        toolBar.add(btnAdd);
        toolBar.add(btnEdit);
        toolBar.add(btnDelete);
        toolBar.add(btnView);
        toolBar.add(btnIndiv);
        add(toolBar, BorderLayout.NORTH);

        setVisible(true);
//        setSize(550,500);
        setSize(size);


    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        new JToolPopupMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miadd || e.getSource() == btnAdd) {
            desktopPane.add(new AddRecord());
            desktopPane.show();
        }

        if (e.getSource() == miedit || e.getSource() == btnEdit) {
            desktopPane.add(new ModifyRecord());
            desktopPane.show();
        }

        if (e.getSource() == midel || e.getSource() == btnDelete) {
            desktopPane.add(new DeleteRecord());
            desktopPane.show();
        }

        if (e.getSource() == miall || e.getSource() == btnView) {
            desktopPane.add(new DisplayJTable());
            desktopPane.show();
        }

        if (e.getSource() == miindv || e.getSource() == btnIndiv) {
            desktopPane.add(new SingleDisplay());
            desktopPane.show();
        }
    }
}
