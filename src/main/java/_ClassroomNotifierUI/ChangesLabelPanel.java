package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangesLabelPanel extends JPanel {
    private JLabel changesLabel;

    public ChangesLabelPanel() {
        changesLabel = new JLabel("Se detectaron cambios de aulas");
        changesLabel.setVisible(false);
        add(changesLabel);
    }

    public JLabel getChangesLabel() {
        return changesLabel;
    }

    public void setVisible(boolean visible) {
        changesLabel.setVisible(visible);
    }
}
