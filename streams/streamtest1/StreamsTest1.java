package streamtest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest1 {
    public static void main(String[] args) {

        // .of() method
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);

        stream1.forEach(System.out::print);
        System.out.println();

        // .filter() and .forEach() method
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        stream2.filter((Integer digit) -> digit > 2)
                .forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        stream3.filter((Integer digit) -> digit > 2)
                .filter((Integer digit) -> digit >= 4)
                .forEach(System.out::print);
        System.out.println();

        // .map() method
        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
        stream4.map(String::valueOf)
                .forEach(System.out::print);
        System.out.println();

        List<String> listOfStrings = Stream.of(1, 2, 3, 4, 5)
                .filter((Integer digit) -> digit > 2)
                .map((Integer digit) -> "str_" + digit)
                .toList();
        listOfStrings.forEach(System.out::println);

        // ignore result of stream
        List<Integer> listOfIntegers1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfIntegers1.add(i);
        }
        System.out.println(listOfIntegers1);

        List<Integer> anotherList = listOfIntegers1.stream()
                .filter((Integer digit) -> (digit >= 2 && digit <= 4))
                .map((Integer digit) -> digit * 2)
                .collect(Collectors.toList());
        System.out.println(listOfIntegers1);
        System.out.println(anotherList);

        listOfIntegers1.add(3);

        // merge function to resolve collisions
        Map<Integer, Integer> map1 = listOfIntegers1.stream()
                .filter((Integer digit) -> (digit >= 2 && digit <= 4))
                .map((Integer digit) -> digit * 2)
                .collect(Collectors.toMap(k -> k, a -> 2 * a, (oldValue, newValue) -> {
                    System.out.println("OldValue= " + oldValue);
                    System.out.println("NewValue= " + newValue);
                    return (oldValue + newValue);
                }));
        System.out.println("Map1: " + map1);


        List<Integer> listOfIntegers2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listOfIntegers2.add(i);
        }
        System.out.println(listOfIntegers2);

        Map<Integer, Integer> map2 = listOfIntegers2.stream()
                .collect(Collectors.toMap(k -> k % 3, a -> a, (oldValue, newValue) -> {
                    System.out.println("OldValue= " + oldValue);
                    System.out.println("NewValue= " + newValue);
                    return (oldValue + newValue);
                }));
        System.out.println("Map2: " + map2);

        // .partitioningBy() method
        Map<Boolean, List<Integer>> map3 = listOfIntegers2.stream()
                .collect(Collectors.partitioningBy((Integer digit) -> digit < 2));
        System.out.println("Map3: " + map3);

        // .groupingBy() method
        Map<Integer, List<Integer>> map4 = listOfIntegers2.stream()
                .collect(Collectors.groupingBy((Integer digit) -> digit % 3));
        System.out.println("Map4: " + map4);
    }
}