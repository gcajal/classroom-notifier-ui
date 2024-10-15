package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;

class InputPanel extends JPanel {
    public InputPanel() {
        setBackground(new Color(245, 245, 245));
        setLayout(new BorderLayout());

        JLabel inputLabel = new JLabel("Ingrese su Email/Celular");
        inputLabel.setFont(new Font("Arial", Font.BOLD, 14));
        inputLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(inputLabel, BorderLayout.NORTH);

        JTextField inputField = new JTextField();
        add(inputField, BorderLayout.CENTER);
    }
}
