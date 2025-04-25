package _ClassroomNotifierUI;
import classroom.notifier.ClassroomNotifier;
import classroom.notifier.FactoryClassroom;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;


public class ApplicationInitializer {

    public static void main(String[] args) {

        System.out.println(new Date().toString());
        //String[] argsClass = new String[1];

        //ClassroomNotifier classroom = ClassroomNotifier.getInstance(args);
        ClassroomNotifier classroom = new ClassroomNotifier();
        //FactoryClassroom classroom = new FactoryClassroom().Inicializar("","build/libs");
        //FactoryRegistrador factoryRegistrador = new FactoryRegistrador();
        //factoryRegistrador.cargarRegistrador(classroom,args);

        new ListaView(classroom);
    }


}
