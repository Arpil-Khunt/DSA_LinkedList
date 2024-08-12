package com.arpil;

public class DLL {
    private int size = 0;

    private class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
            this.previous = null;
            this.next = null;
            size++;
        }
    }

    private Node head;
    private Node tail;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtIdx(int data, int idx) {
        if (idx == 0) {
            insertFirst(data);
            return;
        } else if (idx == size) {
            insertLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.previous = newNode;
        newNode.previous = temp;
        temp.next = newNode;
    }

    // insert after particular node
    private Node find(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int data, int afterData) {
        Node p = find(afterData);
        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = p.next;
        newNode.previous = p;
        newNode.next.previous = newNode;
        p.next = newNode;

    }

    // deletion at first
    public void deletionFirst() {
        if (head == null) {
            System.out.println("Can't delete from empty list");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    // deletion at last
    public void deletionLast() {
        if (head == null) {
            System.out.println("Cant delete from empty list");
            return;
        } else if (head.next == null) {
            head = tail = null;
            return;
        }
        tail = tail.previous;
        tail.next = null;
        size--;
    }

    // deletion at any index
    public void deleteAtAnIdx(int idx) {
        if (idx >= size) {
            System.out.println("Index out of bound");
            return;
        } else if (idx == 0) {
            deletionFirst();
            return;
        } else if (idx == size - 1) {
            deletionLast();
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
        size--;
    }

    public void display() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(size);
    }

    public void displayReverse() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.previous;
        }
        System.out.println("null");
        System.out.println(size);
    }
}