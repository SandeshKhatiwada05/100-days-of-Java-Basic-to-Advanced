package org.javaFX.DialogsFileColorChooserTreesInternalFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class SwingComponentDemo implements ActionListener {

    JFrame frame;
    JButton btnOptionDialog, btnCustomDialog, btnFileChooser, btnInternalFrame, btnTable, btnTree, btnColorChooser;
    JDesktopPane desktopPane;

    public SwingComponentDemo() {
        // Frame setup
        frame = new JFrame("Swing Components Demo");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnOptionDialog = new JButton("Option Dialog");
        btnCustomDialog = new JButton("Custom Dialog");
        btnFileChooser = new JButton("File Chooser");
        btnInternalFrame = new JButton("Internal Frame");
        btnTable = new JButton("Show Table");
        btnTree = new JButton("Show Tree");
        btnColorChooser = new JButton("Color Chooser"); // NEW BUTTON

        // Add listeners
        btnOptionDialog.addActionListener(this);
        btnCustomDialog.addActionListener(this);
        btnFileChooser.addActionListener(this);
        btnInternalFrame.addActionListener(this);
        btnTable.addActionListener(this);
        btnTree.addActionListener(this);
        btnColorChooser.addActionListener(this); // LISTENER FOR COLOR CHOOSER

        // Add buttons to panel
        buttonPanel.add(btnOptionDialog);
        buttonPanel.add(btnCustomDialog);
        buttonPanel.add(btnFileChooser);
        buttonPanel.add(btnInternalFrame);
        buttonPanel.add(btnTable);
        buttonPanel.add(btnTree);
        buttonPanel.add(btnColorChooser); // ADD BUTTON TO UI

        // DesktopPane for internal frames
        desktopPane = new JDesktopPane();

        // Add components to frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(desktopPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOptionDialog) {
            showOptionDialog();
        } else if (e.getSource() == btnCustomDialog) {
            showCustomDialog();
        } else if (e.getSource() == btnFileChooser) {
            showFileChooser();
        } else if (e.getSource() == btnInternalFrame) {
            showInternalFrame();
        } else if (e.getSource() == btnTable) {
            showTable();
        } else if (e.getSource() == btnTree) {
            showTree();
        } else if (e.getSource() == btnColorChooser) { // ADD ACTION HERE
            showColorChooser();
        }
    }

    // Option Dialog
    void showOptionDialog() {
        String[] options = {"Yes", "No", "Maybe"};
        int choice = JOptionPane.showOptionDialog(
                frame,
                "Do you like Java?",
                "Option Dialog",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        System.out.println("Selected: " + options[choice]);
    }

    // Custom Dialog
    void showCustomDialog() {
        JDialog dialog = new JDialog(frame, "Custom Dialog", true);
        dialog.setLayout(new FlowLayout());
        dialog.setSize(250, 150);
        dialog.add(new JLabel("This is a custom dialog!"));
        JButton close = new JButton("Close");
        close.addActionListener(e -> dialog.dispose());
        dialog.add(close);
        dialog.setVisible(true);
    }

    // File Chooser
    void showFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(frame);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(frame, "Selected: " + file.getAbsolutePath());
        }
    }

    // Color Chooser
    void showColorChooser() {
        Color initialColor = Color.RED;
        Color selectedColor = JColorChooser.showDialog(frame, "Pick a Color", initialColor);
        if (selectedColor != null) {
            frame.getContentPane().setBackground(selectedColor); // Set frame background
        }
    }

    // Internal Frame
    void showInternalFrame() {
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setLayout(new FlowLayout());
        internalFrame.add(new JLabel("This is an internal frame."));
        internalFrame.setVisible(true);
        desktopPane.add(internalFrame);

        try {
            internalFrame.setSelected(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Table
    void showTable() {
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Gender");
        model.addRow(new Object[]{"Sandesh", "21", "Male"});
        model.addRow(new Object[]{"Saisa", "20", "Female"});
        model.addRow(new Object[]{"Amisha", "22", "Female"});
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(300, 100));
        JOptionPane.showMessageDialog(frame, scrollPane, "Table View", JOptionPane.PLAIN_MESSAGE);
    }

    // Tree
    void showTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Subjects");
        DefaultMutableTreeNode cs = new DefaultMutableTreeNode("CS");
        cs.add(new DefaultMutableTreeNode("Java"));
        cs.add(new DefaultMutableTreeNode("Python"));
        cs.add(new DefaultMutableTreeNode("AI"));
        DefaultMutableTreeNode maths = new DefaultMutableTreeNode("Maths");
        maths.add(new DefaultMutableTreeNode("Algebra"));
        maths.add(new DefaultMutableTreeNode("Calculus"));
        root.add(cs);
        root.add(maths);
        JTree tree = new JTree(root);
        JScrollPane treeScroll = new JScrollPane(tree);
        treeScroll.setPreferredSize(new Dimension(250, 150));
        JOptionPane.showMessageDialog(frame, treeScroll, "Tree View", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        new SwingComponentDemo();
    }
}
