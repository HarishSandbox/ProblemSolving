import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

  @Test
  public void getName() {

    int[] a = {4,5,7,2,3};
    int i =0;
    int j = a.length -1;
    int temp;
    while(i<j){
      temp = a[j];
      a[j--] = a[i];
      a[i++] = temp;
    }

    for(int each: a){
      System.out.printf("%d ", each);
    }
  }


  @Test
  public void rotateArray() {

    int[] a = {4,5,7,2,3};
    int k = 3;
    int i =0;
    int j = a.length - k;
    int temp;
    while(i< (a.length-k) && j< a.length){
      temp = a[i];
      a[i]= a[j];
      a[i+k] = temp;
       i++;j++;
    }

    for(int each: a){
      System.out.printf("%d ", each);
    }
  }
}