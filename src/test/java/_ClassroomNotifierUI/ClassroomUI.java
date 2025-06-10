package _ClassroomNotifierUI;



import classroom.notifier.aplicacion.ClassroomNotifier;
import classroom.notifier.inicializacion.FactoryClassroom;
//import org.classroomNotifier.init.LoggerFactory;
//import org.classroomNotifier.logger.Logger;

import java.io.FileNotFoundException;

public class ClassroomUI {

    public static void main(String[] args) throws FileNotFoundException {

        //LoggerFactory loggerFactory = LoggerFactory.getInstance("log.txt");
       // Logger logger = loggerFactory.createLogger();

        DataFromFile data = new DataFromFile("stockActual.json");
        FactoryClassroom factory = new FactoryClassroom();

        ClassroomNotifier cl = factory.crear(data, "build/libs");
       // cl.addObserver(logger);
       // cl.addCurrentObservers(logger.getClass().getSimpleName());
        ListaView listaView = new ListaView(cl);
        listaView.init();
    }
}
