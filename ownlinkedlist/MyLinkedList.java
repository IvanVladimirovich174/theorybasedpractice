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

    public int get(int index) {
        Node node = this.head;

        for (int i = 0; i < index; ++i) {
            node = node.next;
        }

        return node.value;
    }

    public void addAtHead(int value) {
        Node node = new Node(value, this.head);

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

    public void addAtIndex(int index, int value) {
        if (index < 0 || index > this.size) {
            return;
        }

        if (index == 0) {
            addAtHead(value);
            return;
        }

        if (index == this.size) {
            addAtTail(value);
            return;
        }

        Node node = this.head;
        for (int i = 0; i < index - 1; ++i) {
            node = node.next;
        }

        Node newNode = new Node(value, node.next);
        node.next = newNode;
        ++size;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            --size;
            return;
        }

        Node node = head;
        for (int i = 0; i < size - 1; ++i) {
            node = node.next;
        }

        if (index == size - 1) {
            node.next = null;
        } else {
            node.next = node.next.next;
        }
        --size;
    }
}