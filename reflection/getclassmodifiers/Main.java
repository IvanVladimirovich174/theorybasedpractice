package reflection.getclassmodifiers;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
Get class modifiers:
.getModifiers() method allows to find out all the modifiers
with which the class was declared.

Modifiers are representing by packaged bits.
To unpack modifiers use methods of class Modifier:
public static boolean isPublic(int mod) { }
public static boolean isPrivate(int mod) { }
public static boolean isProtected(int mod) { }
public static boolean isStatic(int mod) { }
public static boolean isFinal(int mod) { }
public static boolean isInterface(int mod) { }
public static boolean isAbstract(int mod) { }
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Modifiers of current class");
        System.out.println(Main.class.getModifiers());

        // Is current class public?
        System.out.println("Is current class public? " + Modifier.isPublic(Main.class.getModifiers()));
        System.out.println();

        // All public fields (including inherited)
        Class<?> cls = Task.class;
        System.out.println("All public fields (including inherited)");
        Arrays.stream(cls.getFields()).forEach((i) -> {
                    System.out.println("Field name: " + i.getName() + "\tType of field" + i.getType().getSimpleName());
                }
        );
        System.out.println();

        // All fields (without including inherited)
        System.out.println("All fields (without including inherited)");
        Arrays.stream(cls.getDeclaredFields()).forEach((i) -> {
                    System.out.println("Field name: " + i.getName() + "\tType of field" + i.getType().getSimpleName());
                }
        );
        System.out.println();

        // Get field
        try {
            Task task = new Task();
            Field field = cls.getField("field");
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.get(task));
            field.set(task, "UPDATE-field-value");
            System.out.println(field.get(task));
            System.out.println(Modifier.isPublic(field.getModifiers()));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // Print all fields of class, their modifiers and types
        for (Field field : Task.class.getDeclaredFields()) {
            int mod = field.getModifiers();

            if (Modifier.isPublic(mod)) {
                System.out.println("Public ");
            }

            if (Modifier.isProtected(mod)) {
                System.out.println("Protected ");
            }

            if (Modifier.isPrivate(mod)) {
                System.out.println("Private ");
            }

            if (Modifier.isStatic(mod)) {
                System.out.println("Static ");
            }

            if (Modifier.isFinal(mod)) {
                System.out.println("Final ");
            }

            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType().getSimpleName());
        }
    }
}