package strings;

public class MethodsOfString {
    public static void main(String[] args) {
        String str1 = "Welcome to Java";
        String str2 = "Welcome to Java";
        String str3 = "Welcome to C++";
        String str4 = "Welcome to Python";

        // equals
        System.out.println("Is str1 equals str2? " + str1.equals(str2));
        System.out.println(str2.equals(str3));

        // compareTo
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
    }
}