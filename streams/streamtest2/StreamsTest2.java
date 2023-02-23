package streamtest2;

import java.util.List;
import java.util.stream.Stream;

public class StreamsTest2 {
    public static void main(String[] args) {
        List<String> myPlaces = List.of("New-York", "Cairo", "Phuket", "Nepal");
        Stream<String> stringStream = myPlaces.stream();

        stringStream.forEach(i -> {
            System.out.println(i.toUpperCase());
        });
        System.out.println();

        myPlaces.stream()
                .filter((s) -> s.startsWith("N"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}