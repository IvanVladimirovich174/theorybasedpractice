package strings;

public class MethodsOfStringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Ivan Meshkov");
        System.out.println(stringBuilder);

        stringBuilder = new StringBuilder(12);
        System.out.println(stringBuilder.isEmpty());


    }
}
