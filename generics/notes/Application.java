package generics.notes;

public class Application {
    public static void main(String[] args) {
        SimplePrinter simplePrinter = new SimplePrinter();

        simplePrinter.print(123);
        simplePrinter.print(123f);
        simplePrinter.print(123L);
        System.out.println();

        ValueHolder<String> stringHolder = new ValueHolder<>("C");

        System.out.println(stringHolder.compare("D"));
        System.out.println(stringHolder.compare("C"));
        System.out.println(stringHolder.compare("B"));
    }
}
