public class MainSL {
    public static void main(String args[]) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(55);
        list.insertFirst(54);
        list.insertFirst(53);
        list.insertFirst(51);
        list.insertLast(56);
        list.insertLast(57);
        list.printList();
        list.deletionFirst();
        list.printList();
        list.deletionLast();
        list.printList();
        list.insertAtIndex(58, 2);
        list.printList();
        list.deleteAtIndex(3);
        list.printList();
    }
}
