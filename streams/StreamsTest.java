import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

        stream1.forEach(System.out::print);
        System.out.println();


        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        stream2.filter((Integer digit) -> digit > 2)
                .forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        stream3.filter((Integer digit) -> digit > 2)
                .filter((Integer digit) -> digit >= 4)
                .forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
        stream4.map(String::valueOf)
                .forEach(System.out::print);
        System.out.println();

        List<String> list = Stream.of(1, 2, 3, 4, 5)
                .filter((Integer digit) -> digit > 2)
                .map((Integer digit) -> "str_" + digit)
                .toList();

        list.forEach(System.out::println);
    }
}