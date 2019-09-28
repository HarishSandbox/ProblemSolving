import org.junit.Test;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionIntersectionTest {
	
  @Test
  public void unionSet() {
    UnionIntersectionUsingSet obj = new UnionIntersectionUsingSet();
    Set<Integer> a = new LinkedHashSet<>();
    a.add(1); a.add(3);a.add(2);a.add(4);a.add(8); a.add(9);a.add(0);
    Set<Integer> b = new LinkedHashSet<>();
    b.add(1); b.add(3);b.add(7);b.add(5);b.add(4); b.add(0);b.add(7);b.add(5);

    Set<Integer> res = obj.unionSet(a,b);

    Iterator<Integer> itr = res.iterator();
    while(itr.hasNext()){
      System.out.printf("%d ", itr.next());
    }
  }

  @Test
  public void intersectionSet() {
    UnionIntersectionUsingSet obj = new UnionIntersectionUsingSet();
    Set<Integer> a = new LinkedHashSet<>();
    a.add(1); a.add(3);a.add(2);a.add(4);a.add(8); a.add(9);a.add(0);
    Set<Integer> b = new LinkedHashSet<>();
    b.add(1); b.add(3);b.add(7);b.add(5);b.add(4); b.add(0);b.add(7);b.add(5);

    Set<Integer> res = obj.intersectionSet(a,b);

    Iterator<Integer> itr = res.iterator();
    while(itr.hasNext()){
      System.out.printf("%d ", itr.next());
    }
  }


  @Test
  public void differenceSet() {
    UnionIntersectionUsingSet obj = new UnionIntersectionUsingSet();
    Set<Integer> a = new LinkedHashSet<>();
    a.add(1); a.add(3);a.add(2);a.add(4);a.add(8); a.add(9);a.add(0);
    Set<Integer> b = new LinkedHashSet<>();
    b.add(1); b.add(3);b.add(7);b.add(5);b.add(4); b.add(0);b.add(7);b.add(5);

    Set<Integer> res = obj.difference(a,b);

    Iterator<Integer> itr = res.iterator();
    while(itr.hasNext()){
      System.out.printf("%d ", itr.next());
    }
  }
  
}