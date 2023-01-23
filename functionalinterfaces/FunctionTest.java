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

        Function<Integer,String> functionTest2 = (Integer number) -> {
            return String.valueOf(number);
        };
    }
}