package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class DefaultMethodsOfMapInterface {
    public static void main(String[] args) {

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // .getOrDefault() method
        Integer valueForAbsentKey = hashMap.getOrDefault("absentKey", -1);
        System.out.println("Returned default value: " + valueForAbsentKey);
        System.out.println();

        hashMap.put("key1", 123);
        Integer valueForPresentKey = hashMap.getOrDefault("key1", -1);
        System.out.println("Returned value by key, if key is present: " + valueForPresentKey);
        System.out.println();

        // .putIfAbsent() method
        hashMap.putIfAbsent("key1", 123);
        System.out.println("HashMap hasn't changed, because there is key1 " + hashMap);

        // .merge() method
        BiFunction<Integer, Integer, Integer> mergeFunction = (Integer oldValue, Integer newValue) -> {
            System.out.println("Insight merge function: oldValue=" + oldValue + " newValue=" + newValue);
            System.out.println();
            return oldValue + newValue;
        };

        hashMap.merge("key2", 456, mergeFunction);
        System.out.println("Put key and value if there is no collision: " + hashMap);
        System.out.println();

        hashMap.merge("key2", 544, mergeFunction);
        System.out.println("Put result of execution biFunction: " + hashMap);
        System.out.println();

        // .compute() method
        BiFunction<String, Integer, Integer> computeFunction = (String key, Integer oldValue) -> {
            System.out.println("Insight compute function: key=" + key + " oldValue=" + oldValue);
            return 2 * oldValue;
        };

        hashMap.compute("key2", computeFunction);
        System.out.println("HashMap after using .compute() method: " + hashMap);
        System.out.println();

        // .computeIfAbsent() method
        Function<String, Integer> computeIfAbsentFunction = (String key) -> {
            System.out.println("Insight computeIfAbsent function: key=" + key);
            return 375;
        };

        hashMap.computeIfAbsent("key3", computeIfAbsentFunction);
        System.out.println("HashMap after using .computeIfAbsent() method: " + hashMap);
        System.out.println();

        // .computeIfPresent() method
        BiFunction<String, Integer, Integer> computeIfPresentFunction = (String key, Integer oldValue) -> {
            System.out.println("Insight computeIfPresentFunction function: key=" + key + " oldValue=");
            return oldValue + 25;
        };

        hashMap.computeIfPresent("key3", computeIfPresentFunction);
        System.out.println("HashMap after using computeIfPresent() method: " + hashMap);
    }
}