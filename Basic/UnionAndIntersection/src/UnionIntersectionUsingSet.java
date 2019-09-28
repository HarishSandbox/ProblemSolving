import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionIntersectionUsingSet {

  Set<Integer> unionSet(Set<Integer> a, Set<Integer> b){
    Iterator<Integer> itr = b.iterator();
    Set<Integer> res = new LinkedHashSet<>();
    res.addAll(a);
    while(itr.hasNext()){
      res.add(itr.next());
    }
    return res;
  }

  Set<Integer> intersectionSet(Set<Integer> a, Set<Integer> b){
    Set<Integer> res = new LinkedHashSet<>();
    Iterator<Integer> itr = a.iterator();
    while(itr.hasNext()){
      int temp = itr.next();
      if(!b.add(temp)){
        res.add(temp);
      }
    }
    return res;
  }


  Set<Integer> difference(Set<Integer> a, Set<Integer> b){
    Iterator<Integer> itr = b.iterator();
    while(itr.hasNext()){
      a.remove(itr.next());
    }
    return a;
  }
}
