import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphAsMatrix {

  void bfs(int[][] adjMatrix, int source){
    LinkedList<Integer> q = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    q.add(source);
    visited.add(source);

    while(!q.isEmpty()){
      int u = q.remove();
      System.out.printf("%d ", u);
      for(int i=0; i< adjMatrix.length ; i++){
        if(adjMatrix[u][i] == 1 && !visited.contains(i) && u!=i){
          q.add(i);
          visited.add(i);
        }
      }
    }
  }
}
