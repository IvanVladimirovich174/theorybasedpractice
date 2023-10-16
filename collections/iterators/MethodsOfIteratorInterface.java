package collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodsOfIteratorInterface {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("v1");
        listOfStrings.add("v2");
        listOfStrings.add("v3");
        listOfStrings.add("v4");
        listOfStrings.add("v5");

        Iterator<String> iterator = listOfStrings.iterator();

        while (iterator.hasNext()) {
            String stringValue = iterator.next();

            if ("v3".equals(stringValue)) {
                iterator.remove();
                System.out.println("REMOVED string value: " + stringValue);
            } else {
                System.out.println("String value: " + stringValue);
            }
        }

        System.out.println("ArrayList after removing v3-string value: " + listOfStrings);

        // invoke ConcurrentModificationException
        for (String string : listOfStrings) {
            listOfStrings.remove(1);
        }
    }
}