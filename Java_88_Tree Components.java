package org.JSP.Tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.*;

public class TreeExample extends JFrame {

    JTree tree;
    DefaultMutableTreeNode child1;

    public TreeExample() {
        setTitle("Tree Node Click Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        // Build Tree Nodes
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode parent1 = new DefaultMutableTreeNode("Parent1");
        DefaultMutableTreeNode parent2 = new DefaultMutableTreeNode("Parent2");

        child1 = new DefaultMutableTreeNode("Click me");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child2");

        parent1.add(child1);
        parent2.add(child2);
        root.add(parent1);
        root.add(parent2);

        // Create tree and put in scroll pane
        tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollPane);

        // Add listener for node selection
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

                if (selectedNode != null && selectedNode.equals(child1)) {
                    JOptionPane.showMessageDialog(TreeExample.this, "You clicked on 'Click me'!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}
