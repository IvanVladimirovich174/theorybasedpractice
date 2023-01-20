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

        // .startsWith() method
        System.out.println("Is str1 start with \"Welcome to J\"" + str1.startsWith("Welcome to J"));
        System.out.println("Is str2 start with \"Welcome to J\"" + str2.startsWith("Welcome to J"));
        System.out.println("Is str3 start with \"Welcome to J\"" + str3.startsWith("Welcome to J"));
        System.out.println("Is str4 start with \"Welcome to J\"" + str4.startsWith("Welcome to J"));
        System.out.println();

        // .endsWith() method
        System.out.println("Is str1 end with \"Welcome to J\": " + str1.endsWith("Java"));
        System.out.println("Is str2 end with \"Welcome to J\": " + str2.endsWith("Java"));
        System.out.println("Is str3 end with \"Welcome to J\": " + str3.endsWith("Java"));
        System.out.println("Is str4 end with \"Welcome to J\": " + str4.endsWith("Java"));
        System.out.println();

        // .contains() method
        System.out.println("Is str1 contain \"Java\": " + str1.contains("Java"));
        System.out.println("Is str2 contain \"Java\": " + str2.contains("Java"));
        System.out.println("Is str2 contain \"Java\": " + str3.contains("C++"));
        System.out.println("Is str2 contain \"Java\": " + str4.contains("Python"));
        System.out.println();

        // substring() method with 1 parameter
        System.out.println("Substring of str1: " + str1.substring(11));
        System.out.println("Substring of str2: " + str2.substring(11));
        System.out.println("Substring of str3: " + str3.substring(11));
        System.out.println("Substring of str4: " + str4.substring(11));
        System.out.println();

        // substring() method with 2 parameters
        System.out.println("Substring of str1: " + str1.substring(0, 11));
        System.out.println("Substring of str2: " + str2.substring(0, 11));
        System.out.println("Substring of str3: " + str3.substring(0, 11));
        System.out.println("Substring of str4: " + str4.substring(0, 11));
        System.out.println();

        // .indexOf(ch) method
        System.out.println("First index of 'J'-char at str1: " + str1.indexOf('J'));
        System.out.println("First index of 'J'-char at str2: " + str2.indexOf('J'));
        System.out.println("First index of 'J'-char at str3: " + str3.indexOf('J'));
        System.out.println("First index of 'J'-char at str4: " + str4.indexOf('J'));
        System.out.println();

        // indexOf(ch, fromIndex) method
        System.out.println("First index of 'J'-char at str1 from beginIndex 11: " + str1.indexOf('J', 11));
        System.out.println("First index of 'J'-char at str2 from beginIndex 11: " + str2.indexOf('J', 11));
        System.out.println("First index of 'J'-char at str3 from beginIndex 11: " + str3.indexOf('J', 11));
        System.out.println("First index of 'J'-char at str4 from beginIndex 11: " + str4.indexOf('J', 11));
        System.out.println();

        // indexOf(str) method
        System.out.println("First index of \"Java\" substring at str1: " + str1.indexOf("Java"));
        System.out.println("First index of \"Java\" substring at str2: " + str2.indexOf("Java"));
        System.out.println("First index of \"Java\" substring at str3: " + str3.indexOf("Java"));
        System.out.println("First index of \"Java\" substring at str4: " + str4.indexOf("Java"));
        System.out.println();

        // indexOf(str, fromIndex) method
        System.out.println("First index of \"Java\" substring at str1 from beginIndex 11: " + str1.indexOf("Java", 11));
        System.out.println("First index of \"Java\" substring at str2 from beginIndex 11: " + str2.indexOf("Java", 11));
        System.out.println("First index of \"Java\" substring at str3 from beginIndex 11: " + str3.indexOf("Java", 11));
        System.out.println("First index of \"Java\" substring at str4 from beginIndex 11: " + str4.indexOf("Java", 11));
        System.out.println();

        // lastIndexOf(ch) method
        System.out.println("Last index of 'o'-char at str1: " + str1.lastIndexOf('o'));
        System.out.println("Last index of 'o'-char at str2: " + str2.lastIndexOf('o'));
        System.out.println("Last index of 'o'-char at str3: " + str3.lastIndexOf('o'));
        System.out.println("Last index of 'o'-char at str4: " + str4.lastIndexOf('o'));
        System.out.println();

        // lastIndexOf(ch, fromIndex) method
        System.out.println("Last index of 'o'-char at str1 to upper index 4: " + str1.lastIndexOf('o', 4));
        System.out.println("Last index of 'o'-char at str2 to upper index 4: " + str2.lastIndexOf('o', 4));
        System.out.println("Last index of 'o'-char at str3 to upper index 4: " + str3.lastIndexOf('o', 4));
        System.out.println("Last index of 'o'-char at str4 to upper index 4: " + str4.lastIndexOf('o', 4));
        System.out.println();

        // lastIndexOf(str) method
        System.out.println("Last index of \"to\" substring at str1: " + str1.lastIndexOf("to"));
        System.out.println("Last index of \"to\" substring at str2: " + str2.lastIndexOf("to"));
        System.out.println("Last index of \"to\" substring at str3: " + str3.lastIndexOf("to"));
        System.out.println("Last index of \"to\" substring at str4: " + str4.lastIndexOf("to"));
        System.out.println();

        // lastIndexOf(str, fromIndex)
        System.out.println("Last index of \"to\" substring at str1 to upper index 4: " + str1.lastIndexOf("to", 8));
        System.out.println("Last index of \"to\" substring at str2 to upper index 4: " + str2.lastIndexOf("to", 8));
        System.out.println("Last index of \"to\" substring at str3 to upper index 4: " + str3.lastIndexOf("to", 8));
        System.out.println("Last index of \"to\" substring at str4 to upper index 4: " + str4.lastIndexOf("to", 8));
        System.out.println();

        // .replace(ch) method
        System.out.println("After replace 'm'-char to 'M': " + str1.replace('m', 'M'));
        System.out.println("After replace 'm'-char to 'M': " + str2.replace('m', 'M'));
        System.out.println("After replace 'm'-char to 'M': " + str3.replace('m', 'M'));
        System.out.println("After replace 'm'-char to 'M': " + str4.replace('m', 'M'));
        System.out.println();

        // .equals() method
        System.out.println("Is str1 equals str2? " + str1.equals(str2));
        System.out.println("Is str2 equals str3? " + str2.equals(str3));
        System.out.println();

        // compareTo() method
        System.out.println("The result of comparing str1 and str2: " + str1.compareTo(str2));
        System.out.println("The result of comparing str2 and str3: " + str2.compareTo(str3));
        System.out.println("The result of comparing str2 and str4: " + str2.compareTo(str4));
        System.out.println();
    }
}