package functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicateTest1 = new BiPredicate<>() {
            @Override
            public boolean test(Integer leftNumber, Integer rightNumber) {
                return (leftNumber + rightNumber >= 7);
            }
        };

        System.out.println(biPredicateTest1.test(10, 2));
        System.out.println(biPredicateTest1.test(5, 1));
        System.out.println();

        BiPredicate<Integer, Integer> biPredicateTest2 = (Integer leftNumber, Integer rightNumber) -> (leftNumber + rightNumber >= 7);

        System.out.println(biPredicateTest2.test(10, 2));
        System.out.println(biPredicateTest2.test(5, 1));
        System.out.println();
    }
}