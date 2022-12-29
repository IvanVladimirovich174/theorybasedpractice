package strings;

public class StringPool {
    public static void main(String[] args) {

        // StringPool
        String stringLiteral = "Java";

        // Rest part of heap
        String stringViaConstructor = new String("Java");

        // StringPool
        String str1 = "test";
        String str2 = "test";

        System.out.println("Is str1 == str2? " + (str1 == str2));
        System.out.println();

        // StringPool
        String str3 = "TopJava";
        String str4 = "Top" + "Java";

        System.out.println("Is str3 == str4 " + (str3 == str4));
        System.out.println();

        // Rest part of heap
        String str5 = "TopJava";
        String str6 = "Java";
        String str7 = "Top" + str6;

        System.out.println("Is str5 == str7 " + (str5 == str7));
        System.out.println();
    }
}