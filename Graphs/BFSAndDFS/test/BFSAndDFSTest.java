import org.junit.Test;

public class BFSAndDFSTest {

  @Test
  public void BFS() {
    BFSAndDFS obj = new BFSAndDFS(7);
    obj.addEdge(1,2); obj.addEdge(1,3); obj.addEdge(1,4);
    obj.addEdge(2,5);
    obj.addEdge(3,5); obj.addEdge(3,6);
    obj.addEdge(4,7);
    obj.addEdge(6,7);

    obj.BFS(1);
  }

  @Test
  public void DFS() {
    BFSAndDFS obj = new BFSAndDFS(7);
    obj.addEdge(1,2); obj.addEdge(1,3); obj.addEdge(1,4);
    obj.addEdge(2,5);
    obj.addEdge(3,5); obj.addEdge(3,6);
    obj.addEdge(4,7);
    obj.addEdge(6,7);

    obj.DFS(1);
  }

  @Test
  public void DFS1() {

    StringBuilder s = new StringBuilder("abbcccb");
    int i =0 ;
    int j = 0;
    int count = 0;
    int k =3;
    while(i<s.length() && j<s.length()){
      if(s.charAt(i) != s.charAt(j)) {
        i++;
        j = i;
        count = 0;
      } else{
        count++;
        if(count == k){
          s.delete(i,j+1);
          i=0;
          j=i;
          count =0;
        } else{
          j++;
        }


      }
    }

    System.out.println(s);


  }


  @Test
  public void DFS2() {
    System.out.println(-121%10);
  }


  }