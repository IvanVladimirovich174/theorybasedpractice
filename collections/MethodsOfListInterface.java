package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MethodsOfListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add some elements
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println();

        // Get element by index (ascending order)
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index=" + i + " element=" + list.get(i));
        }
        System.out.println();

        // Get element by index (descending order)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("index=" + i + " element=" + list.get(i));
        }
        System.out.println();

        // Add element to specific position and print
        System.out.println("Initial list:");
        System.out.println(list);

        list.add(3, 32);
        System.out.println("List after adding number 32 on 3-index position:");
        System.out.println(list);

        list.add(6, 720);
        System.out.println("List after adding number 720 on 6-index position:");
        System.out.println(list);

        // Add list to the another list
        List<Integer> anotherList = new LinkedList<>();
        anotherList.add(40);
        anotherList.add(50);

        list.addAll(anotherList);

        System.out.println("[First adding] List after adding another list:");
        System.out.println(list);

        // Add list to the another list on specific position
        list.addAll(6, anotherList);
        System.out.println("[Second adding] List after adding another list:");
        System.out.println(list);

        // Remove by index
        list.remove(3);
        System.out.println("List after removing element by 3-index:");
        System.out.println(list);

        // Using replaceAll method with help of UnaryOperator
        UnaryOperator<Integer> unaryOperator = (Integer element) -> {
            return -1 * element;
        };

        list.replaceAll(unaryOperator);

        System.out.println("List after using method unary operator:");
        System.out.println(list);

        // Using sort method with help of descending order Comparator
        Comparator<Integer> comparatorDescending = (Integer leftElement, Integer rightElement) -> {
            return rightElement.compareTo(leftElement);
        };

        list.sort(comparatorDescending);

        System.out.println("List after using descending order Comparator");
        System.out.println(list);

        // Using sort method with help of ascending order Comparator
        Comparator<Integer> comparatorAscending = (Integer leftElement, Integer rightElement) -> {
            return leftElement.compareTo(rightElement);
        };

        list.sort(comparatorAscending);

        System.out.println("List after using ascending order Comparator");
        System.out.println(list);
    }
}