package _ClassroomNotifierUI;
import classroom.notifier.ClassroomNotifier;
import classroom.notifier.entity.Observable;


public class ApplicationInitializer {

    public static void main(String[] args) {

        ClassroomNotifier classroom = new ClassroomNotifier(args);

        ListaView view = new ListaView(classroom);
        ListaController controller = new ListaController(view.getChangesLabel(),classroom);

        view.setController(controller);
    }
}
