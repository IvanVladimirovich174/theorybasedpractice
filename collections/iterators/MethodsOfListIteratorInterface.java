package collections.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MethodsOfListIteratorInterface {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("v1");
        listOfStrings.add("v2");
        listOfStrings.add("v3");
        listOfStrings.add("v4");
        listOfStrings.add("v5");

        ListIterator<String> listIterator = listOfStrings.listIterator();

        System.out.println("Direct order:");
        while (listIterator.hasNext()) {
            String stringValue = listIterator.next();
            System.out.println("String value: " + stringValue);
        }
        System.out.println();

        System.out.println("Reverse order:");
        while (listIterator.hasPrevious()) {
            String stringValue = listIterator.previous();

            if ("v4".equals(stringValue)) {
                listIterator.remove();
                System.out.println("REMOVED string value: " + stringValue);
            } else {
                System.out.println("String value: " + stringValue);
            }
        }
    }
}