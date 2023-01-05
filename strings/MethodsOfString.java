package strings;

public class MethodsOfString {
    public static void main(String[] args) {
        String str1 = "Welcome to Java";
        String str2 = "Welcome to Java";
        String str3 = "Welcome to C++";
        String str4 = "Welcome to Python";

        // .length() method
        System.out.println("Length of str1= " + str1.length());
        System.out.println("Length of str2= " + str1.length());
        System.out.println("Length of str3= " + str1.length());
        System.out.println("Length of str4= " + str1.length());
        System.out.println();

        // .charAt() method
        System.out.println("The 11th character of str1 is: " + str1.charAt(11));
        System.out.println("The 11th character of str2 is: " + str2.charAt(11));
        System.out.println("The 11th character of str3 is: " + str3.charAt(11));
        System.out.println("The 11th character of str4 is: " + str4.charAt(11));
        System.out.println();

        // .toUpperCase() method
        System.out.println("Strings to uppercase:");
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toUpperCase());
        System.out.println();

        // .toLowerCase() method
        System.out.println("Strings to lowercase:");
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str4.toLowerCase());
        System.out.println();

        // .trim() method
        String str5 = "\r\n\t\f        Java is the best programming language\t\r\f\n";
        System.out.println("str5 after trimming: " + str5.trim());

        // startsWith() method
        System.out.println("Is str1 starts with \"Welcome to J\"" + str1.startsWith("Welcome to J"));
        System.out.println("Is str2 starts with \"Welcome to J\"" + str2.startsWith("Welcome to J"));
        System.out.println("Is str3 starts with \"Welcome to J\"" + str3.startsWith("Welcome to J"));
        System.out.println("Is str4 starts with \"Welcome to J\"" + str4.startsWith("Welcome to J"));

        // equals
        System.out.println("Is str1 equals str2? " + str1.equals(str2));
        System.out.println("Is str2 equals str3? " + str2.equals(str3));
        System.out.println();

        // compareTo
        System.out.println("The result of comparing str1 and str2: " + str1.compareTo(str2));
        System.out.println("The result of comparing str2 and str3: " + str2.compareTo(str3));
        System.out.println("The result of comparing str2 and str4: " + str2.compareTo(str4));
        System.out.println();
    }
}