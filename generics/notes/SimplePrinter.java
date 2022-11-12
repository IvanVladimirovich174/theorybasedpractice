package generics.notes;

public class SimplePrinter {
    public <T> void print(T digit) {
        System.out.println("> " + digit);
    }
}
