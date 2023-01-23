package functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumerTest1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumerTest1.accept("Test Consumer<T> interface");

        Consumer<String> consumerTest2 = System.out::println;

        consumerTest2.accept("Test Consumer<T> interface");
    }
}