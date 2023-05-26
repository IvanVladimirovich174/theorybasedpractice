package strings;

public class MethodsAndConstructorsOfStringBuilderClass {
    public static void main(String[] args) {

        // Constructor() without params
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        System.out.println("Length= " + stringBuilder.length());
        System.out.println("Is empty= " + stringBuilder.isEmpty());
        System.out.println("Capacity= " + stringBuilder.capacity());
        System.out.println();

        // Constructor() with capacity parameter
        stringBuilder = new StringBuilder(12);
        System.out.println(stringBuilder);
        System.out.println("Length= " + stringBuilder.length());
        System.out.println("Is empty= " + stringBuilder.isEmpty());
        System.out.println("Capacity= " + stringBuilder.capacity());
        System.out.println();

        // Constructor() with string parameter
        stringBuilder = new StringBuilder("Ivan ");
        System.out.println(stringBuilder);
        System.out.println("Length= " + stringBuilder.length());
        System.out.println("Is empty= " + stringBuilder.isEmpty());
        System.out.println("Capacity= " + stringBuilder.capacity());
        System.out.println();

        // .append() method with string parameter
        stringBuilder.append("Meshkov");
        System.out.println(stringBuilder);
        System.out.println("Length= " + stringBuilder.length());
        System.out.println("Is empty= " + stringBuilder.isEmpty());
        System.out.println("Capacity= " + stringBuilder.capacity());

        // .reverse() method
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println();

        // .delete() method
        System.out.println(stringBuilder.delete(4, 12));
        System.out.println();
    }
}