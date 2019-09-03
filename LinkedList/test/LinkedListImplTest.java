import org.junit.Test;

public class LinkedListImplTest {

  @Test
  public void addLast() {

    System.out.println("Add last: ");
    LinkedListImpl l1 = new LinkedListImpl();
    l1.addLast(new Node(3));
    l1.addLast(new Node(4));
    l1.addLast(new Node(5));

    l1.printList();

    System.out.println("\nAdd first: ");
    LinkedListImpl l2 = new LinkedListImpl();
    l2.addFirst(new Node(3));
    l2.addFirst(new Node(4));
    l2.addFirst(new Node(5));

    l2.printList();

    System.out.printf("Remove first: %d \n",l1.removeFirst().val);
    System.out.printf("Remove Last: %d \n",l2.removeLast().val);



  }

  @Test
  public void printList() {
  }
}