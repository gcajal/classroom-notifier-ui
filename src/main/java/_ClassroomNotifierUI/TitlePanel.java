package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class TitlePanel extends JPanel {
    private JLabel titleLabel;

    public TitlePanel() {
        titleLabel = new JLabel("Classroom Notifier Beta");
        titleLabel.setFont(new Font("Courier New", Font.ITALIC | Font.BOLD, 20));
        add(titleLabel);
    }
}
