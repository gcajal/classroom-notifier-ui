package _ClassroomNotifierUI;

import javax.swing.*;
import java.awt.*;

public class BotonPanel extends JPanel {
    private JButton button;

    public BotonPanel() {

        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 6));

        button = new JButton("Guardar");
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(34, 139, 34));
        button.setFocusPainted(false);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setPreferredSize(new Dimension(130, 50));

        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        add(button);
    }

    public JButton getButton() {
        return button;
    }
}
