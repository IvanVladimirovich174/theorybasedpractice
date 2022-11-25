package collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MethodsOfNavigableSetInterface {
    public static void main(String[] args) {
        NavigableSet<Integer> treeSet = new TreeSet<>();

        // Automatically creates ascending (lexicographic) order
        for (int i = 10; i >= 1; i--) {
            treeSet.add(i);
        }

        System.out.println("TreeSet:");
        for (Integer number : treeSet) {
            System.out.print(number + " ");
        }
        System.out.println();

        // .higher() method min(elements > 5)
        Integer higherValue = treeSet.higher(5);
        System.out.println("higherValue = " + higherValue);

        // .lower() method max(elements < 5 )
        Integer lowerValue = treeSet.lower(5);
        System.out.println("lowerValue = " + lowerValue);

        // .ceiling() method min(elements >= -1)
        Integer ceilingValue = treeSet.ceiling(-1);
        System.out.println("ceilingValue = " + ceilingValue);

        // .floor() method max(elements <= 11 )
        Integer floorValue = treeSet.floor(11);
        System.out.println("floorValue = " + floorValue);


        // .subSet() method with bounds
        NavigableSet<Integer> subSet = treeSet.subSet(2, true, 10, true);
        System.out.println("SubSet [2, 10]: " + subSet);

        // .headSet() method with bounds
        NavigableSet<Integer> headSet = treeSet.headSet(5, true);
        System.out.println("HeadSet [head, 5]: " + headSet);

        // .tailSet() method with bounds
        NavigableSet<Integer> tailSet = treeSet.tailSet(5, false);
        System.out.println("TailSet (5, tail]: " + tailSet);

        // .descendingSet
        NavigableSet<Integer> reversedSet = treeSet.descendingSet();
        System.out.println("TreeSetDescending:");
        System.out.println(reversedSet);
    }
}