import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/** find shortest path between two vertices **/

public class ShortestPath {

  static class Node{
    Character val;
    Set<Node> adjList;
    int dist;

    Node(Character d){
      val = d;
      adjList = new HashSet<>();
      dist = Integer.MAX_VALUE;
    }
  }


  public int findShortestPath(Node source, Node dest){
    LinkedList<Node> q = new LinkedList<>();
    q.add(source);
    source.dist = 0;
    while(!q.isEmpty()){
      Node u = q.remove();
      for(Node v : u.adjList){
        if(v.val == dest.val){
          return u.dist+1;
        }
        if(v.dist == Integer.MAX_VALUE){
          v.dist = u.dist+1;
          q.add(v);
        }
      }
    }

    return -1;

  }



}
