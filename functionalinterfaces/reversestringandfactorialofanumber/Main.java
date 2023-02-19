package functionalinterfaces.reversestringandfactorialofanumber;

public class Main {
    public static void main(String[] args) {
        ReversableInterface<String> stringRevers = (str) -> new StringBuilder(str).reverse().toString();
        ReversableInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Reverse string: " + stringRevers.reverse("Lambda"));
        System.out.println("Reverse integer: " + factorial.reverse(5));
    }
}