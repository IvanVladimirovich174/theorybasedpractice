package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();

        // Empty ArrayList
        System.out.println("Size: " + list.size());
        System.out.println("IsEmpty: " + list.isEmpty());
        System.out.println();

        // ArrayList after adding element
        list.add(10);
        System.out.println("Size after adding: " + list.size());
        System.out.println("IsEmpty after adding? " + list.isEmpty());
        System.out.println();

        // Add some elements and print
        list.add(20);
        list.add(20);
        list.add(30);
        for (Integer element : list) {
            System.out.println("Element: " + element);
        }
        System.out.println();

        // Remove element and print
        list.remove(20);
        System.out.println(list);
        System.out.println();

        // Remove non-existent element
        boolean resultOfRemoving = list.remove(150);
        System.out.println(resultOfRemoving);
        System.out.println();

        // Clear collection
        list.clear();
        System.out.println("List after clearing: " + list );
        System.out.println();

        // Add elements and print
        list.add(10);
        list.add(20);
        list.add(30);

        boolean isContain = list.contains(10);
        System.out.println("Is collection contain number 10: " + isContain);
        System.out.println();
    }
}
