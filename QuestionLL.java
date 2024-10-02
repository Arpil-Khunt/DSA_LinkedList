public class QuestionLL{
  //remove duplicate using iteration
    public void removeDuplicates(){
         Node node = head;

         while(node.next != null){
             if(node.data == node.next.data){
                 node.next = node.next.next;
             }else{
                 node = node.next;
             }

         }
         tail = node;
         tail.next = null;
    }

  //remove duplicate from sorted ll using recursion

    public void removeDuplicateSortedLL(){
         removeElement(head);
    }
    private void removeElement(Node temp){
         if(temp == null){
             return;
         }
         if(temp.next != null && temp.data == temp.next.data){
             removeElement(temp.next);
             temp.next = temp.next.next;
         }
         removeElement(temp.next);
    }
  //merge two Sorted LinkedList
    public static void mergeLL(SinglyLL list1, SinglyLL list2){
         Node f = list1.head;
         Node s = list2.head;
        SinglyLL ans = new SinglyLL();
        while(f != null && s != null){
            if(f.data <= s.data){
               ans.insertLast(f.data);
               f = f.next;
            }else{
                ans.insertLast(s.data);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.data);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.data);
            s = s.next;
        }
        ans.printList();
    }
}
