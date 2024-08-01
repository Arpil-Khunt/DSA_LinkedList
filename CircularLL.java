public class CircularLL {
    class Node {
        int data;

        Node next;

        Node(int data) {
            this.data = data;

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
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        if (temp.data == data) {
            tail.next = head.next;
            return;
        }
        do {
            Node n = temp.next;
            if (n.data == data) {
                temp.next = n.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("null");
    }
}
