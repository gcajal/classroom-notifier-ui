package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;
import classroom.notifier.FactoryClassroom;

import java.io.FileNotFoundException;
import java.util.Date;

public class ClassroomUI {

    public static void main(String[] args) throws FileNotFoundException {
        DataFromFile data = new DataFromFile("stockActual.json");
        FactoryClassroom factory = new FactoryClassroom();
        ClassroomNotifier cl = factory.Inicializar(data, "build/libs");
        new ListaView(cl);
    }

}
