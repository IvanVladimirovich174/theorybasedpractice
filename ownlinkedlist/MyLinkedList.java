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
        this.size = 0;
        this.head = null;
    }

    public void addAtHead(int value) {
        Node node = new Node(value, head);

        this.head = node;
        ++size;
    }

    public void addAtTail(int value) {
        if (this.size == 0) {
            Node node = this.head;
            for (int i = 0; i < size - 1; ++i) {
                node = node.next;
            }
            node.next = new Node(value, null);
        } else {
            this.head = new Node(value, null);
        }
        ++size;
    }
}