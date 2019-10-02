import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSAndDFS {

  Set<Integer>[] adjList;

  BFSAndDFS(int V){
    adjList = new LinkedHashSet[V];
    for(int i=0; i<adjList.length;i++){
      adjList[i] = new LinkedHashSet<>();
    }
  }

  void addEdge(int s, int d){
    if(!adjList[s-1].contains(d)){
      adjList[s-1].add(d);
    } else {
      throw new IllegalArgumentException("Edge already present");
    }
  }

  void BFS(int source){
    Set<Integer> visited = new LinkedHashSet<>();
    Queue<Integer> q = new LinkedList<>();
    q.add(source);
    visited.add(source);
    while(!q.isEmpty()){
      int v = q.remove();
      System.out.printf("%d ", v);
      for(int i : adjList[v-1] ){
        if(!visited.contains(i)){
          q.add(i);
          visited.add(i);
        }
      }
    }
  }

  private void DFShelper(int source, Set<Integer> visited){
    visited.add(source);
    System.out.printf("%d ", source);
    for(int i: adjList[source-1]){
      if(!visited.contains(i)){
        DFShelper(i,visited);
      }
    }
  }

  void DFS(int source){
    Set<Integer> visited = new LinkedHashSet<>();
    DFShelper(source,visited);
  }

}
