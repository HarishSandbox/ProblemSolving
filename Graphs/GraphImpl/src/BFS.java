import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Return the length of the shortest path between root and target node.
 */

public class BFS {

  static class Node{
    char val;
    int dist;
    Set<Node> adjList;

    Node(char d){
      val = d;
      dist = Integer.MAX_VALUE;
      adjList = new HashSet<>();
    }
  }



  int findShortestPath(Node root, Node target) {
    LinkedList<Node> q = new LinkedList<>();
    q.add(root);
    root.dist = 0;
    Node u;
    while (!q.isEmpty()){
      u = q.remove();
      System.out.printf("%c ", u.val);
      for(Node v : u.adjList){
        if(v.val == target.val){
          return u.dist+1;
        }

        // Alternatively, can use Set<Nodes> and
        // keep adding visited nodes(So that we don't visit again)
        if(v.dist == Integer.MAX_VALUE){
          v.dist = u.dist +1;
          q.add(v);
        }
      }
    }
    return -1;
  }
}
