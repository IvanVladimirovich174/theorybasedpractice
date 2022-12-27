package strings;

public class StringPool {
    public static void main(String[] args) {

        // StringPool
        String stringLiteral = "Java";

        // Rest part of heap
        String stringViaConstructor = new String("Java");

        String str1 = "test";
        String str2 = "test";

        System.out.println("Is str1 == str2? " + (str1 == str2));
        System.out.println();
    }
}