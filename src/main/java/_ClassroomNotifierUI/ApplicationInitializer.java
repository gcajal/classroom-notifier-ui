package _ClassroomNotifierUI;
import classroom.notifier.ClassroomNotifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ApplicationInitializer {

    public static void main(String[] args) {

        //String[] argsClass = new String[1];
        ClassroomNotifier classroom = new ClassroomNotifier(args);

        FactoryRegistrador factoryRegistrador = new FactoryRegistrador();
        factoryRegistrador.cargarRegistrador(classroom,args);

        new ListaView(classroom);
    }


}
