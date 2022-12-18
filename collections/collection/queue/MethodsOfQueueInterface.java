package collections.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MethodsOfQueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // Add some elements and return head element
        queue.offer(10);
        /*
        AVOID: couldn't contains null element, but LinkedList can
        queue.addLast(null);
         */
        queue.offer(20);

        System.out.println("Head element ---> " + queue + " <--- Tail element");
        System.out.println("First (head) element = " + queue.element());
        System.out.println("First (head) element = " + queue.peek());
        System.out.println();

        queue.offer(30);

        System.out.println("Head element ---> " + queue + " <--- Tail element");
        System.out.println("First (head) element = " + queue.element());
        System.out.println("First (head) element = " + queue.peek());
        System.out.println();

        // Remove element
        Integer removedValue = queue.remove();
        System.out.println("Removed element = " + removedValue);
        System.out.println("Head element ---> " + queue + " <--- Tail element");
        System.out.println();

        // Clear queue
        queue.clear();

        // Add some elements and print with help of while cycle
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        Integer value;
        while ((value = queue.poll()) != null) {
            System.out.print(value + " ");
        }
        System.out.println();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while ((value = queue.peek()) != null) {
            System.out.print(value + " ");
            queue.poll();
        }
        System.out.println();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}