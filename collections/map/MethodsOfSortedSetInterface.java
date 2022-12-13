package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MethodsOfSortedSetInterface {
    public static void main(String[] args) {

        // TreeMap
        SortedMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i <= 5; i++) {
            treeMap.put(i,"Value_" + i);
        }

        System.out.println("TreeMap: " + treeMap);

        // .firstKey() method
        System.out.println("FirstKey: " + treeMap.firstKey());

        // .lastKey() method
        System.out.println("LastKey: " + treeMap.lastKey());
    }
}