import org.junit.Test;

import static org.junit.Assert.*;

public class BFSTest {

  @Test
  public void BFS() {

    BFS obj = new BFS();
    BFS.Node a = new BFS.Node('A');
    BFS.Node b = new BFS.Node('B');
    BFS.Node c = new BFS.Node('C');
    BFS.Node d = new BFS.Node('D');
    BFS.Node e = new BFS.Node('E');
    BFS.Node f = new BFS.Node('F');
    BFS.Node g = new BFS.Node('G');

    a.adjList.add(b); a.adjList.add(c);a.adjList.add(d);
    b.adjList.add(e);
    c.adjList.add(e);c.adjList.add(f);
//    d.adjList.add(g);
    f.adjList.add(g);

    System.out.println(obj.findShortestPath(a,g));


  }
}