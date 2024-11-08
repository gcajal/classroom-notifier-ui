package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelAvisoMateria extends JPanel {
    private JLabel labelCambioMateria;

    public PanelAvisoMateria() {
        labelCambioMateria = new JLabel("Se detectaron cambios de aulas");
        labelCambioMateria.setVisible(false);
        add(labelCambioMateria);
    }

    public JLabel getPanel() {
        return labelCambioMateria;
    }

    public void setVisible(boolean visible) {
        labelCambioMateria.setVisible(visible);
    }
}
