import org.junit.Test;

import static org.junit.Assert.*;

public class GraphAsMatrixTest {

  @Test
  public void bfs() {

    int[][] adjMatrix = {
                          {0,1,1,1,0,0,0},
                          {0,0,0,0,1,0,0},
                          {0,0,0,0,1,0,0},
                          {0,0,0,0,0,0,1},
                          {0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0},
                          {0,0,0,0,0,1,0}
                        };
    System.out.println(adjMatrix.length);
    GraphAsMatrix obj = new GraphAsMatrix();
    //obj.bfs(adjMatrix,0);
  }
}