package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperatorTest1 = new UnaryOperator<>() {
            @Override
            public Integer apply(Integer number) {
                return 2 * number;
            }
        };

        System.out.println(unaryOperatorTest1.apply(25));

        UnaryOperator<Integer> unaryOperatorTest2 = (Integer number) -> {
            return 2 * number;
        };

        System.out.println(unaryOperatorTest2.apply(25));

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("1");
        listOfStrings.add("2");
        listOfStrings.add("3");

        UnaryOperator<String> unaryOperator = (String string) -> (string + "_" + string);

        listOfStrings.replaceAll(unaryOperator);
        System.out.println(listOfStrings);

        listOfStrings.forEach(s -> System.out.println("item= " + s));
    }
}