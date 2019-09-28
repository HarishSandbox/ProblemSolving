import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphAsList {
  private int vertices;
  private Map<Integer, Set<Integer>> adjList;

  GraphAsList(int v){
    vertices = v;
    adjList = new HashMap();
  }

  void addNode(int v){
    if(!adjList.containsKey(v)){
      adjList.put(v, new HashSet<>());
    } else {
      throw new IllegalArgumentException("Vertex already exists");
    }

  }
  // Undirected graph
  void addEdge(int s, int d){
    if(!adjList.containsKey(s) || !adjList.containsKey(d)) {
      throw new IllegalArgumentException("Invalid source/dest vertex");
    }
    adjList.get(s).add(d);
    adjList.get(d).add(s);
  }

  void printGraph(){
    if(adjList.isEmpty()){
      throw new IllegalArgumentException("GraphAsList is empty");
    }
    for(Map.Entry<Integer, Set<Integer>> entry: adjList.entrySet()){
      Set<Integer> edgeList = entry.getValue();
      System.out.printf("Vertex %d -> \t", entry.getKey());
      for(Integer v: edgeList){
        System.out.printf("%d ",v);
      }
      System.out.println();
    }
  }
}
