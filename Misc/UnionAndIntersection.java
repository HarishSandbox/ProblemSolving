import java.util.ArrayList;
import java.util.List;

class UnionAndIntersection {

  /* Brute Force
  List<Integer> union(int[] a, int[] b) {
    List<Integer> c = new ArrayList<>();
    boolean flag = false;
    for (int i : a) {
      c.add(i);
    }
    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (b[i] == a[j]) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        c.add(b[i]);
      }
      flag = false;
    }
    return c;
  }

  List<Integer> intersection(int[] a, int[] b) {
    List<Integer> c = new ArrayList<>();
    for(int i=0; i<a.length; i++){
      for(int j=0; j<b.length; j++){
        if(a[i]==b[j]){
          c.add(a[i]);
          break;
        }
      }
    }
    return c;
  }
  */


  // Using Merge O(m+n)

  List<Integer> union(int[] a, int[] b) {
    List<Integer> c = new ArrayList<>();
    int i = 0, j=0;
    int m = a.length;
    int n = b.length;

    while(i<m && j<n) {
      if (a[i]<b[j]) {
        c.add(a[i++]);
      }
      else if (a[i]> b[j]){
        c.add(b[j++]);
      }

	  else {
        c.add(a[i++]);
        j++;
      }
    }
    return c;
  }

  List<Integer> intersection(int[] a, int[] b) {
    List<Integer> c = new ArrayList<>();
    int i = 0,j=0;
    int m = a.length;
    int n = b.length;

    while(i<m && j<n) {
      if (a[i]< b[j])
        i++;
      else if (a[i]> b[j])
      j++;
	  else {
        c.add(a[i++]);
        j++;
      }
    }
    return c;
  }
}