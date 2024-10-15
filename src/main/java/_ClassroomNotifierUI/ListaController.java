package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;
import classroom.notifier.MateriasActuales;
import classroom.notifier.entity.Observable;
import classroom.notifier.entity.implement.Observer;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ListaController implements Observer {

    private final JLabel changesLabel;
    private final ClassroomNotifier classroomNotifier;

    public ListaController(JLabel changesLabel, ClassroomNotifier classroomNotifier) {
        this.changesLabel = changesLabel;
        this.classroomNotifier = classroomNotifier;
        this.classroomNotifier.addObserver(this);
        this.classroomNotifier.getActualizadorMaterias().addObserver(this);
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
        if(observable instanceof MateriasActuales) {
            if (o instanceof String) {
                changesLabel.setText((String) o);//System.out.println(o);
                changesLabel.setVisible(true);
            } else if (o instanceof ArrayList<?>) {
                List<String> result = (List<String>) o;
                changesLabel.setText("Se detectaron cambios de aula:\n" + result.getFirst());
                changesLabel.setVisible(true);
            }
        }

        //Map<String, String> cambios = (Map<String, String>) o;

    }
}
