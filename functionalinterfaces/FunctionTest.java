package functionalinterfaces;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, String> functionTest1 = new Function<>() {
            @Override
            public String apply(Integer number) {
                return String.valueOf(number);
            }
        };

        System.out.println("Result: " + functionTest1.apply(35));

        Function<Integer, String> functionTest2 = String::valueOf;

        System.out.println("Result: " + functionTest2.apply(35));
    }
}