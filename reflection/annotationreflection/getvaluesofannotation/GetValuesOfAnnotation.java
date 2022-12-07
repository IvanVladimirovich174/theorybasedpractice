package reflection.annotationreflection.getvaluesofannotation;

public class GetValuesOfAnnotation {
    public static void printDescription(Class<?> cls) {
        if (!cls.isAnnotationPresent(ClassDescription.class)) {
            return;
        }

        ClassDescription classDescription = cls.getAnnotation(ClassDescription.class);

        System.out.println("Author: " + classDescription.author());
        System.out.println("Date: " + classDescription.date());
        System.out.println("CurrentVersion: " + classDescription.currentRevision());

        System.out.println("Reviewers: ");
        for (String reviewer : classDescription.reviewers()) {
            System.out.println("\t>" + reviewer);
        }
    }
}