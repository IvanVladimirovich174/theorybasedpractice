package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class MethodsOfSortedSetInterface {
    public static void main(String[] args) {
        SortedSet<Integer> treeSet = new TreeSet<>();

        // Automatically creates ascending (lexicographic) order
        for (int i = 10; i >= 1; i--) {
            treeSet.add(i);
        }

        System.out.println("TreeSet:");
        for (Integer number : treeSet) {
            System.out.print(number + " ");
        }
        System.out.println();

        // .first() and .last() methods
        Integer firstValue = treeSet.first();
        System.out.println("First value = " + firstValue);

        Integer lastValue = treeSet.last();
        System.out.println("Last value = " + lastValue);

        // .subSet() method
        SortedSet<Integer> subSet = treeSet.subSet(2, 10);
        System.out.println("SubSet [2, 10): " + subSet);

        subSet = treeSet.subSet(2, 200);
        System.out.println("SubSet [2, 200): " + subSet);

        // .headSet() method
        SortedSet<Integer> headSet = treeSet.headSet(5);
        System.out.println("HeadSet [head, 5): " + headSet);

        headSet = treeSet.headSet(-10);
        System.out.println("HeadSet [head, -10): " + headSet);

        // .tailSet() method
        SortedSet<Integer> tailSet = treeSet.tailSet(7);
        System.out.println("TailSet [7, tail]: " + tailSet);
    }
}