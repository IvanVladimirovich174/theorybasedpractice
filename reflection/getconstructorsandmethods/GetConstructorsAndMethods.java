package reflection.getconstructorsandmethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GetConstructorsAndMethods {
    public static void main(String[] args) {

        Class<Test> cls = Test.class;

        // .getDeclaredConstructor() method
        System.out.println("Get declared constructor:");

        Constructor<Test> constructor;

        try {
            constructor = cls.getDeclaredConstructor(int.class, String.class);
            System.out.println(constructor);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        // .newInstance()
        System.out.println("Create instance of class with help of reflection:");

        Test test;

        try {
            test = constructor.newInstance(123, "Test string");
            System.out.println(test);

            System.out.println("Values of fields:");
            System.out.println(test.a);
            System.out.println(test.b);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        // get parameters of constructor
        System.out.println("Get parameters of constructor:");

        for (Constructor<?> clsIter : cls.getConstructors()) {
            Class<?>[] parametersOfConstructor = clsIter.getParameterTypes();
            for (Class<?> parameter : parametersOfConstructor) {
                System.out.println(parameter.getName());
            }
        }

        System.out.println();

        // .getMethod()
        try {
            Method method = cls.getMethod("printHelloWorld");
            System.out.println("Get method by name: " + method.getName());

            // invoke .printHelloWorld() method
            System.out.println("Invoke .printHelloWorld() method:");
            method.invoke(test);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        // print all public methods of class and superclasses
        System.out.println("Print all public methods of class " +
                "and superclasses");

        Arrays.stream(cls.getMethods()).forEach(i -> {
            System.out.println("Method name " + i.getName() + " " + i.getDeclaringClass().getName());
        });

        System.out.println();

        // print all methods of class
        System.out.println("Print all methods of class");

        Arrays.stream(cls.getDeclaredMethods()).forEach(i -> {
            System.out.println("Method name " + i.getName() + " " + i.getDeclaringClass().getName());
        });

        System.out.println();
    }
}