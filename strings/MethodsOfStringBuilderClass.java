package strings;

public class MethodsOfStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        stringBuilder = new StringBuilder(12);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        stringBuilder = new StringBuilder("Ivan ");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        stringBuilder.append("Meshkov");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.reverse());
    }
}