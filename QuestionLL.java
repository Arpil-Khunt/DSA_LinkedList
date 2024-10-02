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
}
