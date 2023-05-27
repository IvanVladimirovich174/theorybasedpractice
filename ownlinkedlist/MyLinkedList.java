public class MyLinkedList {
    private int size;
    private Node head;

    private static class Node {
        int value;
        Node next;

        Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}