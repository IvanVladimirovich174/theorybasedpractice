package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class MethodsOfDequeInterface {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Add some elements use addLast method and print
        deque.addLast(10);
        /*
        AVOID: couldn't contains null element, but LinkedList can
        deque.addLast(null);
         */
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Head element ---> " + deque + " <--- Tail element");
        System.out.println();

        // Get head element
        System.out.println("Head element = " + deque.getFirst());
        System.out.println("Head element = " + deque.peekFirst());
        System.out.println();

        // Get tail element
        System.out.println("Tail element = " + deque.getLast());
        System.out.println("Tail element = " + deque.peekLast());
        System.out.println();

        // Remove first element
        deque.removeFirst();
        System.out.println("Deque after removing first element");
        System.out.println(deque);
        System.out.println();

        // Remove last element
        deque.removeLast();
        System.out.println("Deque after removing last element");
        System.out.println(deque);
        System.out.println();

        //Clear deque
        deque.clear();

        // Add some elements using addFirst method and print
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        System.out.println("Initial deque");
        System.out.println(deque);

        // Print with help of while cycle (from head to tail)
        System.out.println("Print from head ---> tail");
        while (!deque.isEmpty()) {
            System.out.print(deque.pollFirst() + " ");
        }
        System.out.println();

        // Print with help of while cycle (from tail to head)
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        System.out.println("Print from tail ---> head");
        while (!deque.isEmpty()) {
            System.out.print(deque.pollLast() + " ");
        }
        System.out.println();

        // Clear deque
        deque.clear();

        // Push method equals addFirst method
        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.addFirst(40);
        System.out.println(deque);

        // Pop method equals removeFirst method
        deque.pop();
        System.out.println(deque);
    }
}