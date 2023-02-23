package streamtest3;

import java.util.ArrayList;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        Square s = (digit) -> digit * digit;
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.stream()
                .map(s::calculate)
                .forEach(System.out::println);
    }
}