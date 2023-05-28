public class MyLinkedList {
    private int size;
    private Node head;

    private static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    public void addAtHead(int value) {
        Node node = new Node(value, head);
        head = node;
        ++size;
    }

    public void addAtTail(int value) {
        Node node = head;
        for (int i = 0; i < size - 1; ++i) {
            node = node.next;
        }
    }
}