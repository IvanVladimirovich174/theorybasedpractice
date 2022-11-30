package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicateTest1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 7;
            }
        };

        System.out.println(predicateTest1.test(10));
        System.out.println(predicateTest1.test(5));
        System.out.println();

        Predicate<Integer> predicateTest2 = (Integer number) -> {
            return number >= 7;
        };

        System.out.println(predicateTest2.test(10));
        System.out.println(predicateTest2.test(5));
        System.out.println();
    }
}