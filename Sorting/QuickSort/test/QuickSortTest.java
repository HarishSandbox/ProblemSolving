import org.junit.Test;

public class QuickSortTest {

  @Test
  public void quickSort() {

    int[] A = {2, 7, 5, 3,8,4, 9,0};
    QuickSort obj = new QuickSort();
    obj.quickSort(A,0,A.length-1);
    for(int e: A) {
      System.out.printf("%d ", e);
    }
  }
}