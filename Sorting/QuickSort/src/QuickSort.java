public class QuickSort{

  int partition(int[] A, int b, int e) {
    int pivot = A[e];
    int i = b-1;
    for (int j=b; j<e; j++) {
      if(A[j] < pivot) {
        i = i+1;
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
        swap(A,j,i);
      }
    }
    swap(A,i+1, e);
    return i+1;

  }

  private void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

  void quickSort(int[] A, int b, int e) {
    if(b<e) {
      int p = partition(A,b,e);
      quickSort(A,b,p-1);
      quickSort(A,p+1,e);
    }
  }

}