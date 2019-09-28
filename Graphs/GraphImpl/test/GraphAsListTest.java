import org.junit.Test;

public class GraphAsListTest {

  @Test
  public void addEdge() {
    GraphAsList g = new GraphAsList(3);
    g.addNode(1);
    g.addNode(2);
    g.addNode(3);
    g.addEdge(1,2);
    g.addEdge(1,3);
    g.addEdge(2,1);
    g.addEdge(3,1);

    g.printGraph();

  }
}