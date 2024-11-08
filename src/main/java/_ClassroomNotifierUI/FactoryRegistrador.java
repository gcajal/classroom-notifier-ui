package _ClassroomNotifierUI;

import classroom.notifier.ClassroomNotifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryRegistrador {


    public void cargarRegistrador(ClassroomNotifier classroom, String[] args) {

        String className = "org.example.Registrador";
        if (args.length > 0)
            className = args[0];


        try {
            // Dynamically load App1Class
            Class<?> app1Class = Class.forName(className);
            Constructor<?> constructor = app1Class.getDeclaredConstructor(classroom.getClass());
            Object instance =  constructor.newInstance(classroom);

        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodException e) {
            System.out.println("App1Class could not be loaded. Skipping message print.");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
