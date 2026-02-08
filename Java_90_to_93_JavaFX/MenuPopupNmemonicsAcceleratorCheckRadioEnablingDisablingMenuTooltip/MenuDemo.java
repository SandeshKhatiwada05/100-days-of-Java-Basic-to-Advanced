package org.javaFX.MenuPopupNmemonicsAcceleratorCheckRadioEnablingDisablingMenuTooltip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo implements MouseListener {

    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu;
    JMenuItem newItem, openItem, exitItem;
    JCheckBoxMenuItem checkBoxItem;
    JRadioButtonMenuItem radioItem1, radioItem2;
    JPopupMenu popupMenu;
    JToolBar toolBar;

    public MenuDemo() {
        // Initialize frame
        frame = new JFrame("Menu & Toolbar Demo");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ================== 🔷 MENU BAR ==================
        menuBar = new JMenuBar();

        // 🔵 FILE MENU
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        newItem = new JMenuItem("New", new ImageIcon("new_icon.png")); // Optional icon
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        exitItem = new JMenuItem("Exit");
        exitItem.setEnabled(false);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // 🟢 EDIT MENU
        editMenu = new JMenu("Edit");

        checkBoxItem = new JCheckBoxMenuItem("Dark Mode");

        radioItem1 = new JRadioButtonMenuItem("Option A");
        radioItem2 = new JRadioButtonMenuItem("Option B");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioItem1);
        radioGroup.add(radioItem2);
        radioItem1.setSelected(true);

        editMenu.add(checkBoxItem);
        editMenu.addSeparator();
        editMenu.add(radioItem1);
        editMenu.add(radioItem2);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        // ================== 🔷 TOOLBAR ==================
        toolBar = new JToolBar();
        JButton newBtn = new JButton("New");
        newBtn.setToolTipText("Create New File (Ctrl+N)");
        JButton openBtn = new JButton("Open");
        openBtn.setToolTipText("Open File (Ctrl+O)");

        toolBar.add(newBtn);
        toolBar.add(openBtn);
        frame.add(toolBar, BorderLayout.NORTH);

        // ================== 🔷 POPUP MENU ==================
        popupMenu = new JPopupMenu();
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        // Add mouse listener to frame's content pane
        frame.getContentPane().addMouseListener(this);

        frame.setVisible(true);
    }

    // ================== 🟢 MouseListener Overrides ==================

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popupMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    // ================== 🔷 MAIN METHOD ==================
    public static void main(String[] args) {
        new MenuDemo();
    }
}

