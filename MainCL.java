public class MainCL {
    public static void main(String args[]) {
        CircularLL list = new CircularLL();
        list.addFirst(55);
        list.addFirst(53);
        list.addFirst(52);
        list.addFirst(51);
        list.addLast(56);
        list.addLast(57);
        list.display();
        list.delete(52);
        list.delete(56);
        list.display();

    }
}
