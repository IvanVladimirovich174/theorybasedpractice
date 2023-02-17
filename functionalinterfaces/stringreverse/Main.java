package functionalinterfaces.stringreverse;

public class Main {
    public static void main(String[] args) {
        ReverseInterface reverseInterface = (str -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; --i) {
                result += str.charAt(i);
            }

            return result;
        });

        System.out.println(reverseInterface.reverse("ABC-DEF"));
    }
}