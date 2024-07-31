public class MainDL {
    public static void main(String args[]) {
        DoublyLL list = new DoublyLL();
        list.addFirst(55);
        list.addFirst(53);
        list.addFirst(52);
        list.addFirst(51);
        list.printListF();
        list.deleteFirst();
        list.printListR();
    }
}
