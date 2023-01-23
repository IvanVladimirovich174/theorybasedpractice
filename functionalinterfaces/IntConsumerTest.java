package functionalinterfaces;

import java.util.function.IntConsumer;

public class IntConsumerTest {
    public static void main(String[] args) {
        IntConsumer intConsumerTest1 = new IntConsumer() {
            @Override
            public void accept(int number) {
                System.out.println(2 * number);
            }
        };

        intConsumerTest1.accept(25);

        IntConsumer intConsumerTest2 = (int number) -> System.out.println(2 * number);

        intConsumerTest2.accept(25);
    }
}