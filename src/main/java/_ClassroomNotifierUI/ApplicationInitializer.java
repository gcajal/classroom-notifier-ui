package _ClassroomNotifierUI;
import classroom.notifier.ClassroomNotifier;


public class ApplicationInitializer {

    public static void main(String[] args) {

        ClassroomNotifier classroom = new ClassroomNotifier(args);

        new ListaView(classroom);
    }
}
