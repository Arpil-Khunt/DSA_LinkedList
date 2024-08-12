public class CLL {
    public CLL() {

    }

    private int size = 0;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    private Node head;
    private Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void delete() {
        if (head == null) {
            System.out.println("can't delter from empty list");
            return;
        }
        if (head.next == head) {
            head = tail = null;
            return;
        }
        Node temp = head;
        Node temp1 = temp.next.next;
        while (temp1 != head) {
            temp1 = temp1.next;
            temp = temp.next;
        }
        temp.next = head;
        size--;
    }

    // display the list
    public void display() {
        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("null");
        System.out.println(size);
    }
}
