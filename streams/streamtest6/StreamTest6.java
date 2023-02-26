package streamtest6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest6 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Nikita", "Ivan", "Ivan", "Nikita", "Anna", "Anna");
        Set<String> uniqueNames = new HashSet<>(names);

        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName + ":" + Collections.frequency(names, uniqueName));
        }
        System.out.println();

        Map<String, Long> frequencyMap = names
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
    }
}