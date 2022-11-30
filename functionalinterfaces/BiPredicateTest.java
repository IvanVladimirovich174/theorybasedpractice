package functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicateTest = (Integer leftNumber, Integer rightNumber) -> {
            return (leftNumber + rightNumber >= 7);
        };

        System.out.println(biPredicateTest.test(10, 2));
        System.out.println(biPredicateTest.test(5, 1));
    }
}