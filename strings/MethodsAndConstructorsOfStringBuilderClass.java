package strings;

public class MethodsAndConstructorsOfStringBuilderClass {
    public static void main(String[] args) {

        // Constructor() without params
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        // Constructor() with capacity parameter
        stringBuilder = new StringBuilder(12);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        // Constructor() with string parameter
        stringBuilder = new StringBuilder("Ivan ");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        // .append() method with string parameter
        stringBuilder.append("Meshkov");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.reverse());
    }
}