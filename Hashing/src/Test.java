public class Test {

  public static void main(String args[]){
    int[][] a = { {0,1,0,0},{0,0,0,0},{0,1,0,1},{1,0,0,0}};
    int[][] res = new int[4][4];
    for (int i =0;i<4;i++){
      for (int j =0;j<4;j++){
        for (int k =0;k<4;k++) {
          if(a[i][j]==1 || (a[i][k]==1 && a[k][j]==1)){
            res[i][j] = 1;
          }
        }
      }
    }
    for (int i =0;i<4;i++){
      for (int j =0;j<4;j++){
        System.out.printf("%d ",res[i][j]);
      }
      System.out.println();
    }
  }


}
