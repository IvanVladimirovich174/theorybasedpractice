package reflection;

public class GetClass {
    public static void main(String[] args) {

        // First way to get Class-object
        Class<String> stringClass1 = String.class;
        System.out.println(stringClass1);

        // Second way to get Class-object
        String string = "My string";
        Class<?> stringClass2 = string.getClass();
        System.out.println(stringClass2);

        // Third way to get Class-object
        try {
            Class<?> integerClass = Class.forName("java.lang.Integer");
            System.out.println(integerClass);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
