package org.JSP.Frame;

import org.JSP.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class DeleteRecord extends JInternalFrame implements ActionListener {

    JLabel rollno;
    JTextField textRoll;
    JButton deletebtn;
    DBConnection dbc = new DBConnection();

    public DeleteRecord() {
        super("Delete Record", true, true, true, true); // internal frame setup

        rollno = new JLabel("Roll no: ");
        textRoll = new JTextField(10);
        deletebtn = new JButton("Delete");

        setLayout(new FlowLayout());
        add(rollno);
        add(textRoll);
        add(deletebtn);

        deletebtn.addActionListener(this);

        setSize(300, 150);
        setVisible(true);
        setClosable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deletebtn) {
            try {
                int value = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                if (value == JOptionPane.YES_OPTION) {
                    PreparedStatement pst = dbc.con.prepareStatement("DELETE FROM Studentt WHERE rollno = ?");
                    pst.setString(1, textRoll.getText());
                    int rowsAffected = pst.executeUpdate(); // how many rows were deleted?

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "No record found with that roll number");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Deletion Cancelled");
                }
            } catch (Exception exc) {
                exc.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + exc.getMessage());
            }
        }
    }

}
