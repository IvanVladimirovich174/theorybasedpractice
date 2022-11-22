package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MethodsOfSetInterface {
    public static void main(String[] args) {

        // HashSet
        Set<Integer> hashSet = new HashSet<>();

        // No order
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(-1);

        System.out.println("HashSet: " + hashSet);

        // Add method
        boolean result = hashSet.add(20);
        System.out.println(result);

        System.out.println(hashSet);

        // Contains method
        System.out.println("Is hashSet contain number 10: " + hashSet.contains(10));
        System.out.println("Is hashSet contain number 10: " + hashSet.contains(11));
        System.out.println();

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Keep adding order
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(-1);

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // Automatically creates ascending (lexicographic) order
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(-1);

        System.out.println("TreeSet: " + treeSet);
    }
}