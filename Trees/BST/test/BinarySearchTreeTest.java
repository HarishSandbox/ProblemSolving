import org.junit.Test;

public class BinarySearchTreeTest {

  @Test
  public void insert() {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(4);
    tree.insert(2);
    tree.insert(5);
    tree.insert(3);
    tree.insert(1);
//    tree.preOrderRecur();
//    System.out.println(tree.search(5));
////    System.out.println(tree.remove(5).data);
//    System.out.println(tree.search(5));
    System.out.print("Inorder: ");
    tree.inorderIterative();
   System.out.print("Preorder: ");
    tree.preOrderIterative();
    System.out.print("BFS: ");
    tree.printBFS();

  }

}