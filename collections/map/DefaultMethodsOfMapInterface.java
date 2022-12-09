package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class DefaultMethodsOfMapInterface {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // .getOrDefault() method
        Integer valueForAbsentKey = hashMap.getOrDefault("absentKey", -1);
        System.out.println("Returned default value: " + valueForAbsentKey);
        System.out.println();

        hashMap.put("key1", 123);
        Integer valueForPresentKey = hashMap.getOrDefault("key1", -1);
        System.out.println("Returned value by key, if key is present: " + valueForPresentKey);
        System.out.println();

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
            return oldValue * 2;
        };

        hashMap.compute("key2", computeFunction);
        System.out.println("HashMap after using .compute() method: " + hashMap);
        System.out.println();
    }
}