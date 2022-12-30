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

        System.out.println("Is str3 == str4? " + (str3 == str4));
        System.out.println();

        // Rest part of heap
        String str5 = "TopJava";
        String str6 = "Java";
        String str7 = "Top" + str6;

        System.out.println("Is str5 == str7? " + (str5 == str7));
        System.out.println();

        // Rest part of heap
        String test1 = "Top";
        String test2 = "Java";
        String test3 = "TopJava";

        String testConcat1 = test1.concat(test2);
        System.out.println("Is testConcat1 == test3? " + (testConcat1 == test3));
        System.out.println();

        // Rest part of heap
        String test4 = "Top";
        String test5 = "Java";
        String test6 = "TopJava";

        String testConcat2 = "Top".concat("Java");
        System.out.println("Is testConcat2 == test3? " + (testConcat2 == test3));
        System.out.println();
    }
}