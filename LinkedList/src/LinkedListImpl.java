public class LinkedListImpl {

  Node head;

  LinkedListImpl() {
    head = null;
  }

   void addLast(Node x) {
    if (head == null) {
      head = x;
      return;
    }
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = x;
  }


  void addFirst(Node x) {
    if (head == null) {
      head = x;
      return;
    }
    x.next = head;
    head = x;
  }

  Node removeFirst(){
    if (head == null){
      throw new IllegalArgumentException("No element to remove");
    } else {
      Node temp = head;
      head = head.next;
      return temp;
    }
  }


  Node removeLast() throws IllegalArgumentException{
    if (head == null){
      throw new IllegalArgumentException("No element to remove");
    } else {
      Node temp = head;
      Node prev = null;
      while(temp.next!=null){
        prev = temp;
        temp = temp.next;
      }
      prev.next = null;
      return temp;
    }
  }


  void printList(){
    if(head == null){
      System.out.println("List is empty");
      return;
    }
    Node temp = head;
    while (temp != null){
      System.out.printf(" %d", temp.val);
      temp = temp.next;
    }

  }
}
