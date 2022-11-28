package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MethodsOfMapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // .size() method
        int size = map.size();
        System.out.println("Map size = " + size);

        // .isEmpty() method
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? - " + isEmpty);
        System.out.println();

        map.put(1, "First value");
        System.out.println("Map: " + map);

        size = map.size();
        isEmpty = map.isEmpty();

        System.out.println("Map size = " + size);
        System.out.println("Is map empty? - " + isEmpty);
        System.out.println();

        // .clear() method
        map.clear();

        // Fill map
        for (int i = -2; i <= 5; i++) {
            map.put(i, "Value_" + i);
        }

        System.out.println("Map: " + map);
        size = map.size();
        isEmpty = map.isEmpty();

        System.out.println("Map size = " + size);
        System.out.println("Is map empty? - " + isEmpty);
        System.out.println();

        // .containsKey() method
        System.out.println("Is Map contain key = 2? - " + map.containsKey(2));
        System.out.println("Is Map contain key = -5? - " + map.containsKey(-5));
        System.out.println();

        // .containsValue() method
        System.out.println("Is Map contain value = \"Value_2\"? - " + map.containsValue("Value_2"));
        System.out.println("Is Map contain value = \"Value_2\"? - " + map.containsValue("Value_-5"));
        System.out.println();

        // .put() method
        String result = map.put(10, "Value_10");
        System.out.println(".put() method return null, if map didn't " +
                "contained value for key: " + result);
        System.out.println("Map: " + map);
        System.out.println();

        result = map.put(4, "NEW_VALUE_4");
        System.out.println(".put() method return previous value, if map " +
                "contained value for key and will replace value: " + result);
        System.out.println("Map: " + map);
        System.out.println();

        // .remove() method
        String resultOfRemovingByKey = map.remove(4);
        System.out.println(".remove() method return deleting value:" + resultOfRemovingByKey);
        System.out.println("Map: " + map);
        System.out.println();

        resultOfRemovingByKey = map.remove(1000);
        System.out.println(".remove() method return null if there was no value for key: " +
                resultOfRemovingByKey);
        System.out.println("Map: " + map);
        System.out.println();

        map.put(4, "NEW_VALUE_4");

        boolean resulOfRemovingByKeyAndValue = map.remove(4, "NEW_VALUE_4");
        System.out.println(".remove() method with 2 parameters return true," +
                " if value was removed else return false: " + resulOfRemovingByKeyAndValue);
        System.out.println();

        map.put(4, "NEW_VALUE_4");

        resulOfRemovingByKeyAndValue = map.remove(4, "NEW_VALUE_4444");
        System.out.println(".remove() method with 2 parameters return true," +
                " if value was removed: " + resulOfRemovingByKeyAndValue);
        System.out.println();

        resulOfRemovingByKeyAndValue = map.remove(5, "NEW_VALUE_4");
        System.out.println(".remove() method with 2 parameters return false," +
                " if value wasn't removed: " + resulOfRemovingByKeyAndValue);
        System.out.println(map);
        System.out.println();

        // .replace() method with 2 parameters
        String resultOfReplaceTwoParameters = map.replace(4, "Value_4");
        System.out.println(".replace() method return removed value: " +
                resultOfReplaceTwoParameters);
        System.out.println(map);
        System.out.println();

        resultOfReplaceTwoParameters = map.replace(100, "Value_4");
        System.out.println(".replace() method return null if there was no key: " +
                resultOfReplaceTwoParameters);
        System.out.println(map);
        System.out.println();

        // .replace() method with 3 parameters
        boolean resultOfReplaceThreeParameters = map.replace(4, "Value_4", "NEW_VALUE_4");
        System.out.println(".replace() method with three parameters " +
                "return true if value was replaced: " + resultOfReplaceThreeParameters);
        System.out.println(map);
        System.out.println();

        // .keySet() method
        Set<Integer> keys = map.keySet();
        System.out.println("Set of keys: " + keys);

        // .values() method
        Collection<String> values = map.values();
        System.out.println("Collection of values: " + values);
    }
}