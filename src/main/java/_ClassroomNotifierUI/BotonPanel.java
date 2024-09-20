package _ClassroomNotifierUI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class BotonPanel extends JPanel {
    private JButton testButton;

    public BotonPanel() {

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 6));
        buttonPanel.setBounds(50, 50, 90, 70);
        buttonPanel.setBorder(new LineBorder(Color.BLACK, 2));

        buttonPanel.add(Box.createVerticalGlue());

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 6));
        setPreferredSize(new Dimension(90, 70));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        testButton = new JButton("Test");
        testButton.setBackground(Color.RED);
        testButton.setForeground(Color.WHITE);
        testButton.setFocusPainted(false);
        testButton.setOpaque(true);
        testButton.setBorderPainted(false);
        testButton.setPreferredSize(new Dimension(80, 50));

        add(testButton);
    }

    public JButton getTestButton() {
        return testButton;
    }
}
