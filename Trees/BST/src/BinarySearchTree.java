import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class BinarySearchTree {

  private TreeNode root;

  void insert(int key) throws IllegalArgumentException {
    TreeNode newNode = new TreeNode(key);
    if (root == null) {
      root = newNode;
      return;
    }
    TreeNode itr = root;
    TreeNode prev = null;
    while (itr != null) {
      prev = itr;
      if (key < itr.data) {
        itr = itr.leftChild;
      } else if (key > itr.data) {
        itr = itr.rightChild;
      } else {
        throw new IllegalArgumentException("Duplicate element");
      }
    }
    newNode.parent = prev;
    if (key < prev.data) {
      prev.leftChild = newNode;
    } else {
      prev.rightChild = newNode;
    }
  }


  // Delete has 3 cases
  TreeNode delete(int key) throws IllegalArgumentException {
    if (root == null) {
      throw new IllegalArgumentException("Tree is empty");
    }
    TreeNode itr = root;
    TreeNode prev = null;
    while (itr != null) {
      prev = itr;
      if (key == itr.data) {
        break;
      } else if (key < itr.data) {
        itr = itr.leftChild;
      } else {
        itr = itr.rightChild;
      }

      if (key < prev.data) {
        // TO DO
      }
    }
    throw new IllegalArgumentException("No element found");
  }


  boolean search(int key) {
    if (root == null) {
      return false;
    }
    if (root.data == key) {
      return true;
    }
    TreeNode itr = root;
    while (itr != null) {
      if (itr.data == key) {
        return true;
      } else if (key < itr.data) {
        itr = itr.leftChild;
      } else {
        itr = itr.rightChild;
      }
    }
    return false;
  }

  private void preRecurHelper(TreeNode node) {
    if (node != null) {
      System.out.printf("%d ", node.data);
      preRecurHelper(node.leftChild);
      preRecurHelper(node.rightChild);
    }
  }

  void preOrderRecur() {
    if (root == null) {
      throw new IllegalArgumentException("Tree is empty");
    }
    preRecurHelper(root);
    System.out.println();
  }

  /**
   * Iterative DFS traversals
   */
  void inorderIterative() {
    if (root == null) {
      throw new IllegalArgumentException(" Tree is empty");
    }
    TreeNode curr = root;
    Stack<TreeNode> stk = new Stack<>();
    while (!stk.isEmpty() || curr != null) {
      while (curr != null) {
        stk.push(curr);
        curr = curr.leftChild;
      }
      curr = stk.pop();
      System.out.printf("%d ", curr.data);
      curr = curr.rightChild;
    }
    System.out.println();
  }

  void preOrderIterative(){
    if (root == null) {
      throw new IllegalArgumentException(" Tree is empty");
    }
    Stack<TreeNode> stk = new Stack<>();
    stk.push(root);
    TreeNode curr = root;
    while(!stk.isEmpty()){
      curr = stk.pop();
      System.out.printf("%d ", curr.data);
      if(curr.rightChild != null){
        stk.push(curr.rightChild);
      }
      if (curr.leftChild!=null){
        stk.push(curr.leftChild);
      }
    }
    System.out.println();
  }


  void printBFS(){
    if (root == null) {
      throw new IllegalArgumentException(" Tree is empty");
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    TreeNode curr = root;
    while(!q.isEmpty()){
      curr = q.remove();
      System.out.printf("%d ",curr.data);
      if(curr.leftChild!=null){
        q.add(curr.leftChild);
      }
      if(curr.rightChild!=null){
        q.add(curr.rightChild);
      }
    }
    System.out.println();

  }

}
