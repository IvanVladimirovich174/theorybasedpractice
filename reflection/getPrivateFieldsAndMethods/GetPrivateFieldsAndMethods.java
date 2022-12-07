package reflection.getPrivateFieldsAndMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class GetPrivateFieldsAndMethods {
    public static List<String> getPrivateFieldsAndMethods(Class<?> cls) {
        List<String> privateFieldsAndMethods = new ArrayList<>();
        List<Field> privateFields = getPrivateFields(cls);
        List<Method> privateMethods = getPrivateMethods(cls);

        for (Field privateField : privateFields) {
            privateFieldsAndMethods.add(privateField.getName());
        }

        for (Method privateMethod : privateMethods) {
            privateFieldsAndMethods.add(privateMethod.getName());
        }

        return privateFieldsAndMethods;
    }

    public static List<Field> getPrivateFields(Class<?> cls) {
        List<Field> privateFields = new ArrayList<>();

        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers())) {
                privateFields.add(field);
            }
        }

        return privateFields;
    }

    private static List<Method> getPrivateMethods(Class<?> cls) {
        List<Method> privateMethods = new ArrayList<>();

        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isPrivate(method.getModifiers())) {
                privateMethods.add(method);
            }
        }

        return privateMethods;
    }
}
