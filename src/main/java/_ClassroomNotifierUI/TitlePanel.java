package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class TitlePanel extends JPanel {
    private JLabel titleLabel;

    public TitlePanel() {
        titleLabel = new JLabel("ClassroomNotifier");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);
    }
}
