package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Titulo extends JPanel {
    private JLabel tituloLabel;

    public Titulo() {
        tituloLabel = new JLabel("Classroom Notifier Beta");
        tituloLabel.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
        add(tituloLabel);
    }
}
