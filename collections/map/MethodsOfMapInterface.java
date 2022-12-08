package collections.map;

import java.util.*;

public class MethodsOfMapInterface {
    public static void main(String[] args) {

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // .size() method
        int size = hashMap.size();
        System.out.println("HashMap size = " + size);

        // .isEmpty() method
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is hashMap empty? - " + isEmpty);
        System.out.println();

        hashMap.put(1, "First value");
        System.out.println("HashMap: " + hashMap);

        size = hashMap.size();
        isEmpty = hashMap.isEmpty();

        System.out.println("HashMap size = " + size);
        System.out.println("Is hashMap empty? - " + isEmpty);
        System.out.println();

        // .clear() method
        hashMap.clear();

        // Fill hashMap
        for (int i = -2; i <= 5; i++) {
            hashMap.put(i, "Value_" + i);
        }

        System.out.println("HashMap: " + hashMap);
        size = hashMap.size();
        isEmpty = hashMap.isEmpty();

        System.out.println("HashMap size = " + size);
        System.out.println("Is hashMap empty? - " + isEmpty);
        System.out.println();

        // .containsKey() method
        System.out.println("Is HashMap contain key = 2? - " + hashMap.containsKey(2));
        System.out.println("Is HashMap contain key = -5? - " + hashMap.containsKey(-5));
        System.out.println();

        // .containsValue() method
        System.out.println("Is HashMap contain value = \"Value_2\"? - " + hashMap.containsValue("Value_2"));
        System.out.println("Is HashMap contain value = \"Value_2\"? - " + hashMap.containsValue("Value_-5"));
        System.out.println();

        // .put() method
        String result = hashMap.put(10, "Value_10");
        System.out.println(".put() method return null, if hashMap didn't " +
                "contained value for key: " + result);
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        result = hashMap.put(4, "NEW_VALUE_4");
        System.out.println(".put() method return previous value, if hashMap " +
                "contained value for key and will replace value: " + result);
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        // .remove() method
        String resultOfRemovingByKey = hashMap.remove(4);
        System.out.println(".remove() method return deleting value:" + resultOfRemovingByKey);
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        resultOfRemovingByKey = hashMap.remove(1000);
        System.out.println(".remove() method return null if there was no value for key: " +
                resultOfRemovingByKey);
        System.out.println("HashMap: " + hashMap);
        System.out.println();

        hashMap.put(4, "NEW_VALUE_4");

        boolean resulOfRemovingByKeyAndValue = hashMap.remove(4, "NEW_VALUE_4");
        System.out.println(".remove() method with 2 parameters return true," +
                " if value was removed else return false: " + resulOfRemovingByKeyAndValue);
        System.out.println();

        hashMap.put(4, "NEW_VALUE_4");

        resulOfRemovingByKeyAndValue = hashMap.remove(4, "NEW_VALUE_4444");
        System.out.println(".remove() method with 2 parameters return true," +
                " if value was removed: " + resulOfRemovingByKeyAndValue);
        System.out.println();

        resulOfRemovingByKeyAndValue = hashMap.remove(5, "NEW_VALUE_4");
        System.out.println(".remove() method with 2 parameters return false," +
                " if value wasn't removed: " + resulOfRemovingByKeyAndValue);
        System.out.println(hashMap);
        System.out.println();

        // .replace() method with 2 parameters
        String resultOfReplaceTwoParameters = hashMap.replace(4, "Value_4");
        System.out.println(".replace() method return removed value: " +
                resultOfReplaceTwoParameters);
        System.out.println(hashMap);
        System.out.println();

        resultOfReplaceTwoParameters = hashMap.replace(100, "Value_4");
        System.out.println(".replace() method return null if there was no key: " +
                resultOfReplaceTwoParameters);
        System.out.println(hashMap);
        System.out.println();

        // .replace() method with 3 parameters
        boolean resultOfReplaceThreeParameters = hashMap.replace(4, "Value_4", "NEW_VALUE_4");
        System.out.println(".replace() method with three parameters " +
                "return true if value was replaced: " + resultOfReplaceThreeParameters);
        System.out.println(hashMap);
        System.out.println();

        // .keySet() method
        Set<Integer> keys = hashMap.keySet();
        System.out.println("Set of keys: " + keys);

        // .values() method
        Collection<String> values = hashMap.values();
        System.out.println("Collection of values: " + values);
        System.out.println();

        // .entrySet() method
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            if (entry.getKey().equals(4)) {
                String previouslyValue = entry.setValue("Value_4");
                System.out.println("Previously value for 4th key = " + previouslyValue);
            }
        }

        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("{" + key + ";" + value + "}");
        }

        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // keep adding order
        for (int i = 7; i >= -2; --i) {
            linkedHashMap.put(i, "Value_" + i);
        }

        System.out.println("LinkedHashMap: " + linkedHashMap);

        // .putAll() method
        hashMap.putAll(linkedHashMap);
        System.out.println("HashMap after adding: " + hashMap);
    }
}