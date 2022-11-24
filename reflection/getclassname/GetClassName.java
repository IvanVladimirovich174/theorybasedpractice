package reflection.getclassname;

public class GetClassName {
    public static void main(String[] args) {
        printClassName(int.class, "int.class (primitives)");
        printClassName(String.class, "String.class");
        printClassName(java.util.HashMap.class, "HashMap");
        printClassName(new String[]{"A", "B", null}.getClass(), "StringArray");
        printClassName(new java.io.Serializable() {
        }.getClass(), "Serializable");
    }

    public static void printClassName(Class<?> cls, String lable) {
        System.out.println(lable + ":");
        System.out.println("getName:\t\t\t\t\t" + cls.getName());
        System.out.println("getSimpleName:\t\t\t\t" + cls.getSimpleName());
        System.out.println("getCanonicalName:\t\t\t" + cls.getCanonicalName());
        System.out.println("getTypeName:\t\t\t\t" + cls.getCanonicalName());
        System.out.println();
    }
}