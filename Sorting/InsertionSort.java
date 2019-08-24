public class InsertionSort {

  public int[] insertionSort(int[] arr){
    int j,key;
    for(int i=1; i<arr.length; i++){
      key = arr[i];
      j = i-1;
      while(j>=0 && arr[j] > key){
        arr[j+1] = arr[j];
        arr[j] = key;
        j = j -1;
      }
    }
    return arr;
  }

  public static void main(String args[]){
    int[] arr = {5,2,4,6,1,3};
    InsertionSort obj = new InsertionSort();
    int[] res = obj.insertionSort(arr);
    for(int e: res){
      System.out.printf("%d ",e);
    }
  }
}
