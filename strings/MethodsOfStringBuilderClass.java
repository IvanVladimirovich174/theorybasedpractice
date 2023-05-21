package strings;

public class MethodsOfStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        stringBuilder = new StringBuilder(12);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());

        stringBuilder = new StringBuilder("Ivan Meshkov");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.isEmpty());
    }
}