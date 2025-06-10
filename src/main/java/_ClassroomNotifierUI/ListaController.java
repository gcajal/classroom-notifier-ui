package _ClassroomNotifierUI;


import classroom.notifier.aplicacion.ClassroomNotifier;

public class ListaController{

    private final ClassroomNotifier classroomNotifier;

    public ListaController(ClassroomNotifier classroomNotifier) {
        this.classroomNotifier = classroomNotifier;
    }


    public void actualizarNotificador(String seleccion) {

         this.classroomNotifier.addCurrentObservers(seleccion);
    }

    public void eliminarNotificador(String seleccion){

        this.classroomNotifier.deleteCurrentObserver(seleccion);
    }
}
