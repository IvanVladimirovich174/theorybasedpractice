package collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class MethodsOfSortedSetInterface {
    public static void main(String[] args) {

        // TreeMap
        SortedMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i <= 5; i++) {
            treeMap.put(i, "Value_" + i);
        }

        System.out.println("TreeMap: " + treeMap);

        // .firstKey() method
        System.out.println("FirstKey: " + treeMap.firstKey());

        // .lastKey() method
        System.out.println("LastKey: " + treeMap.lastKey());

        // .subMap() method
        SortedMap<Integer, String> subMap = treeMap.subMap(1, 3);
        System.out.println("SubMap: " + subMap);

        // .headMap() method
        SortedMap<Integer, String> headMap = treeMap.headMap(3);
        System.out.println("HeadMap: " + headMap);

        // .tailMap() method
        SortedMap<Integer, String> tailMap = treeMap.tailMap(3);
        System.out.println("HeadMap: " + tailMap);
    }
}