package collections.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MethodsOfNavigableMapInterface {
    public static void main(String[] args) {
        NavigableMap<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i <= 5; i++) {
            treeMap.put(i, "Value_" + i);
        }

        System.out.println("TreeMap: " + treeMap);

        // .higherKey() method min(keys > 3)
        Integer higherKey = treeMap.higherKey(3);
        System.out.println("HigherKey: " + higherKey);

        // .higherEntry() method min(keys > 3)
        Map.Entry<Integer, String> higherMapEntry = treeMap.higherEntry(3);
        System.out.println("HigherMapEntry: " + higherMapEntry);

        // .lowerKey() method max(keys < 3)
        Integer lowerKey = treeMap.lowerKey(3);
        System.out.println("LowerKey: " + lowerKey);

        // .lowerEntry() method max(keys < 3)
        Map.Entry<Integer, String> lowerMapEntry = treeMap.lowerEntry(3);
        System.out.println("LowerMapEntry: " + lowerMapEntry);

        // .ceilingKey() method min(keys >= 3)
        Integer ceilingKey = treeMap.ceilingKey(3);
        System.out.println("CeilingKey: " + ceilingKey);

        // .ceilingEntry() method min(keys >= 3)
        Map.Entry<Integer, String> ceilingMapEntry = treeMap.ceilingEntry(3);
        System.out.println("CeilingMapEntry: " + ceilingMapEntry);

        // .floorKey() method max(keys <= 3)
        Integer floorKey = treeMap.floorKey(3);
        System.out.println("FloorKey: " + floorKey);

        // .floorEntry() method max(keys <= 3)
        Map.Entry<Integer, String> floorMapEntry = treeMap.floorEntry(3);
        System.out.println("FloorMapEntry: " + floorMapEntry);

        // .subMap() method
        NavigableMap<Integer, String> subMap = treeMap.subMap(2, false, 4, false);
        System.out.println("SubMap with excluded bounds: " + subMap);

        subMap = treeMap.subMap(2, true, 4, true);
        System.out.println("SubMap with inclusive: " + subMap);

        // .headMap() method
        NavigableMap<Integer, String> headMap = treeMap.headMap(3, false);
        System.out.println("HeadMap with excluded bounds: " + headMap);

        headMap = treeMap.headMap(3, true);
        System.out.println("HeadMap with inclusive bounds: " + headMap);

        // .tailMap() method
        NavigableMap<Integer,String> tailMap = treeMap.tailMap(3,false);
        System.out.println("TailMap with excluded bounds: " + tailMap);

        tailMap = treeMap.tailMap(3,true);
        System.out.println("TailMap with inclusive bounds: " + tailMap);

        // .descendingMap() method
        NavigableMap<Integer,String> descendingTreeMap = treeMap.descendingMap();
        System.out.println("Descending treeMap: " + descendingTreeMap);
    }
}