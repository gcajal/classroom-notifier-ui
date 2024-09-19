package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;
import classroom.notifier.entity.Observable;
import classroom.notifier.entity.Observer;

import javax.swing.JLabel;
import javax.swing.Timer;


public class ListaController implements Observer {

    private boolean changesDetectedVisible = false;
    private final JLabel changesLabel;
    private ClassroomNotifier classroomNotifier;

    public ListaController(JLabel changesLabel, ClassroomNotifier classroomNotifier) {
        this.changesLabel = changesLabel;
        this.classroomNotifier = classroomNotifier;
        this.classroomNotifier.addObserver(this);
    }

    public void handleTestButtonClick() {
        Timer timer = new Timer(2000, e -> {
            //changesDetectedVisible = !changesDetectedVisible;
            changesDetectedVisible = this.classroomNotifier.EvaluarDiferencias();;
            changesLabel.setVisible(changesDetectedVisible);
        });

        timer.setRepeats(false);
        timer.start();


    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
