package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;
import classroom.notifier.entity.Observable;
import classroom.notifier.entity.Observer;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.util.Map;


public class ListaController implements Observer {

    private final JLabel changesLabel;
    private final ClassroomNotifier classroomNotifier;

    public ListaController(JLabel changesLabel, ClassroomNotifier classroomNotifier) {
        this.changesLabel = changesLabel;
        this.classroomNotifier = classroomNotifier;
        this.classroomNotifier.addObserver(this);
    }

    public void handleTestButtonClick() {
        Timer timer = new Timer(2000, e -> {
            //changesDetectedVisible = !changesDetectedVisible;
            this.classroomNotifier.EvaluarDiferencias();
        });

        timer.setRepeats(false);
        timer.start();


    }

    @Override
    public void update(Observable observable, Object o) {
        Map<String, String> cambios = (Map<String, String>) o;
        changesLabel.setVisible(true);
    }
}
