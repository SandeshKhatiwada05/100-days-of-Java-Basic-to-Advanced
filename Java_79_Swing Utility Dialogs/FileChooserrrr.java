package org.JSP.ColorAndFileChooser;

import javax.swing.*;
import java.io.File;

public class FileChooserrrr {
    public FileChooserrrr() {
        JFrame frame = new JFrame(); // Needed for dialog parent
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // You can hide it later

        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(frame); // Use frame as parent

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            JOptionPane.showMessageDialog(frame, "Selected file: " + selectedFile.getName());
        } else {
            System.out.println("No file selected.");
        }

        frame.dispose(); // Close the frame after use
    }

    public static void main(String[] args) {
        new FileChooserrrr();
    }
}
