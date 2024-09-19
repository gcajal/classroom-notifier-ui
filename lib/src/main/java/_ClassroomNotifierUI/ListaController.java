package _ClassroomNotifierUI;

import javax.swing.JLabel;
import javax.swing.Timer;


public class ListaController {

    private boolean changesDetectedVisible = false;
    private final JLabel changesLabel;

    public ListaController(JLabel changesLabel) {
        this.changesLabel = changesLabel;
    }

    public void handleTestButtonClick() {
        Timer timer = new Timer(2000, e -> {
            changesDetectedVisible = !changesDetectedVisible;
            changesLabel.setVisible(changesDetectedVisible);
        });

        timer.setRepeats(false);
        timer.start();
    }
}
