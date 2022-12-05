package reflection.getclassandsuperclassesinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassAndSuperClassesInterfaces {
    public static List<Class<?>> getInterfaces(Class<?> cls) {
        List<Class<?>> interfaces = new ArrayList<>();

        while (cls != Object.class) {
            interfaces.addAll(Arrays.asList(cls.getInterfaces()));
            cls = cls.getSuperclass();
        }

        return interfaces;
    }
}
