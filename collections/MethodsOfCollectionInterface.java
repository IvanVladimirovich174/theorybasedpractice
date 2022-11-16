package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class MethodsOfCollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        // Empty ArrayList
        System.out.println("Size: " + collection.size());
        System.out.println("IsEmpty: " + collection.isEmpty());
        System.out.println();

        // ArrayList after adding element
        collection.add(10);
        System.out.println("Size after adding: " + collection.size());
        System.out.println("IsEmpty after adding? " + collection.isEmpty());
        System.out.println();

        // Add some elements and print
        collection.add(20);
        collection.add(20);
        collection.add(30);
        for (Integer element : collection) {
            System.out.println("Element: " + element);
        }
        System.out.println();

        // Remove element and print
        collection.remove(20);
        System.out.println(collection);
        System.out.println();

        // Remove non-existent element
        boolean resultOfRemoving = collection.remove(150);
        System.out.println(resultOfRemoving);
        System.out.println();

        // Clear collection
        collection.clear();
        System.out.println("List after clearing: " + collection);
        System.out.println();

        // Checking, does collection contain element?
        collection.add(10);
        collection.add(20);
        collection.add(30);

        boolean isContain = collection.contains(10);
        System.out.println("Is collection contain number 10: " + isContain);
        System.out.println();

        // Checking, does collection contain another collection?
        Collection<Integer> anotherCollection = new LinkedList<>();

        anotherCollection.add(20);
        anotherCollection.add(30);

        boolean isContainArrayListLinkedList = collection.containsAll(anotherCollection);
        System.out.println("Is collection contain another collection: " + isContainArrayListLinkedList);
        System.out.println();

        // Add one collection to the another collection
        anotherCollection.addAll(collection);
        System.out.println("Another collection after adding first collection: " + anotherCollection);
        System.out.println();

        // RemoveIf element < 30
        Predicate<Integer> removeIntegerIf = (Integer element) -> {
            return element < 30;
        };

        anotherCollection.removeIf(removeIntegerIf);
        System.out.println("Another collection after deleting with help of Predicate: " + anotherCollection);
    }
}