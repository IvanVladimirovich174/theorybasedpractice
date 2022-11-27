package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MethodsOfMapInterface {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        // .size() method
        int size = map.size();
        System.out.println("Map size = " + size);

        // .isEmpty() method
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? - " + isEmpty);

        // .put() method
        map.put(1,"First value");
        System.out.println("Map: " + map);

        size = map.size();
        isEmpty = map.isEmpty();

        System.out.println("Map size = " + size);
        System.out.println("Is map empty? - " + isEmpty);
    }
}