class SinglyLL {
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

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtIndex(int data, int idx) {

        Node temp = head;
        if (idx == 0 || head == null) {
            insertFirst(data);
            return;
        }
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Insert using recursion
    public void insertRec(int idx, int value){
         if(idx == 0){
             Node newNode = new Node(value,head);
             head = newNode;
             return;
         }
         insertRecSearch(idx,value,head);
    }
    private Node insertRecSearch(int idx, int value, Node temp){
         if(idx == 0){
             Node newNode = new Node(value,temp);
             return newNode;
         }

         temp.next = insertRecSearch(idx-1,value,temp.next);
        return temp;
    }

    public void deletionFirst() {
        head = head.next;
    }

    public void deletionLast() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void deleteAtIndex(int idx) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (idx == 0 || head == tail) {
            deletionFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void printList() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
