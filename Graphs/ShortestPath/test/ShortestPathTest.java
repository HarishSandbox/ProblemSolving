import org.junit.Test;

public class ShortestPathTest {

  @Test
  public void findShortestPath() {

    ShortestPath obj = new ShortestPath();
    ShortestPath.Node a = new ShortestPath.Node('A');
    ShortestPath.Node b = new ShortestPath.Node('B');
    ShortestPath.Node c = new ShortestPath.Node('C');
    ShortestPath.Node d = new ShortestPath.Node('D');
    ShortestPath.Node e = new ShortestPath.Node('E');
    ShortestPath.Node f = new ShortestPath.Node('F');
    ShortestPath.Node g = new ShortestPath.Node('G');

    a.adjList.add(b); a.adjList.add(c);a.adjList.add(d);
    b.adjList.add(e);
    c.adjList.add(e);c.adjList.add(f);
//    d.adjList.add(g);
    f.adjList.add(g);

    System.out.println(obj.findShortestPath(a,g));
  }
}