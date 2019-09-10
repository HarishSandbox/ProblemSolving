import org.junit.Test;


public class BubbleSortTest {

  @Test
  public void bubbleSort() {
    BubbleSort ob = new BubbleSort();
//    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int arr[] = {5,4,3,2,1};
    int[] r = ob.bubbleSort(arr);
    for(int i:r){
      System.out.printf("%d ",i);
    }
  }
}