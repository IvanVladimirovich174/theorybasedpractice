package functionalinterfaces.stringreverse;

public class Main {
    public static void main(String[] args) {
        ReverseInterface reverseInterface1 = (str -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; --i) {
                result += str.charAt(i);
            }

            return result;
        });

        System.out.println(reverseInterface1.reverse("Lambda"));

        ReverseInterface reverseInterface2 = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println(reverseInterface2.reverse("Lambda"));
    }
}