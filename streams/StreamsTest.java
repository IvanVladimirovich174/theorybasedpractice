import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
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

        List<String> listOfStrings = Stream.of(1, 2, 3, 4, 5)
                .filter((Integer digit) -> digit > 2)
                .map((Integer digit) -> "str_" + digit)
                .toList();
        listOfStrings.forEach(System.out::println);

        // ignore result os stream
        List<Integer> listOfIntegers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listOfIntegers.add(i);
        }

        System.out.println(listOfIntegers);

        List<Integer> anotherList = listOfIntegers.stream()
                .filter((Integer digit) -> (digit >= 2 && digit <= 4))
                .map((Integer digit) -> digit * 2)
                .collect(Collectors.toList());
        System.out.println(listOfIntegers);
        System.out.println(anotherList);

        //
        listOfIntegers.add(3);
        Map<Integer, Integer> map = listOfIntegers.stream()
                .filter((Integer digit) -> (digit >= 2 && digit <= 4))
                .map((Integer digit) -> digit * 2)
                .collect(Collectors.toMap(k -> k, a -> 2 * a, (oldValue, newValue) -> {
                    System.out.println("OldValue= " + oldValue);
                    System.out.println("NewValue= " + newValue);
                    return (oldValue + newValue);
                }));
        System.out.println(map);
    }
}