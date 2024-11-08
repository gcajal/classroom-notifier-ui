package _ClassroomNotifierUI;

import classroom.notifier.Adapter;
import classroom.notifier.ClassroomNotifier;
import classroom.notifier.entity.Observable;
import classroom.notifier.implement.Observer;

import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;


public class ListaController{

    //private final JLabel changesLabel;
    private final ClassroomNotifier classroomNotifier;

    public ListaController(ClassroomNotifier classroomNotifier) {
        this.classroomNotifier = classroomNotifier;
    }


    public void actualizarNotificador(String seleccion) {
        boolean resultado = this.classroomNotifier.getNotificador().setNotificador(seleccion);
    }
}
