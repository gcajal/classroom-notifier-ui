package _ClassroomNotifierUI;
import classroom.notifier.ClassroomNotifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


public class ApplicationInitializer {

    public static void main(String[] args) {

        System.out.println(new Date().toString());
        //String[] argsClass = new String[1];

        //ClassroomNotifier classroom = ClassroomNotifier.getInstance(args);
        ClassroomNotifier classroom = new ClassroomNotifier(args);

        //FactoryRegistrador factoryRegistrador = new FactoryRegistrador();
        //factoryRegistrador.cargarRegistrador(classroom,args);

        new ListaView(classroom);
    }


}
