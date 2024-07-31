public class DoublyLL {
    class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        head.previous = null;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        tail = tail.previous;
        tail.next = null;
    }

    public void printListF() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printListR() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }
        System.out.println("null");
    }
}
