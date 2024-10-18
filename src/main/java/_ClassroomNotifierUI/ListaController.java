package _ClassroomNotifierUI;

import classroom.notifier.Adapter;
import classroom.notifier.ClassroomNotifier;
import classroom.notifier.entity.Observable;
import classroom.notifier.implement.Observer;

import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;


public class ListaController implements Observer {

    //private final JLabel changesLabel;
    private final ClassroomNotifier classroomNotifier;

    public ListaController(ClassroomNotifier classroomNotifier) {
        //this.changesLabel = changesLabel;
        this.classroomNotifier = classroomNotifier;
        //this.classroomNotifier.getAdapter().addObserver(this);
        //this.classroomNotifier.getActualizadorMaterias().addObserver(this);
    }

    public void handleTestButtonClick() {
        /*
        Timer timer = new Timer(2000, e -> {
            //changesDetectedVisible = !changesDetectedVisible;
            this.classroomNotifier.EvaluarDiferencias();
        });

        timer.setRepeats(false);
        timer.start();
        */

    }

    @Override
    public void update(Observable observable, Object o) {
        if(observable instanceof Adapter) {
            if (o instanceof ArrayList<?>) {
                List<String> result = (List<String>) o;

            }
        }

        //Map<String, String> cambios = (Map<String, String>) o;

    }

    public void actualizarNotificador(String seleccion) {
        boolean resultado = this.classroomNotifier.getNotificador().setNotificador(seleccion);
    }
}
