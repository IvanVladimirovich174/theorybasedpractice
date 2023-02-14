package annotations;

public class AnnotationReflection {
    public static void writeDescription(Class<?> cls) {
        if (cls.isAnnotationPresent(ClassDescription.class)) {
            return;
        }

        ClassDescription classDescription = cls.getAnnotation(ClassDescription.class);
    }

}
