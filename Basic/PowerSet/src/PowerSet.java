public class PowerSet {

  void powerSetRecursive(String str, String curr, int i){
    if(i==str.length()){
      System.out.print("{");
      System.out.print(curr);
      System.out.print("}");
      System.out.println();
      return;
    }
    powerSetRecursive(str, curr+str.charAt(i), i+1);
    powerSetRecursive(str, curr, i+1);
  }

  void powerSetIterative(int[] s){
    int n = s.length;
    int maxPowerSet = (int) Math.pow(2,n);
    for(int i=0; i < maxPowerSet; i++) {
      System.out.print("{");
      for(int j=0; j<n; j++){
        if ((i & (1<<j)) > 0) {
          System.out.printf("%d ",s[j]);
        }
      }
      System.out.print("}");
      System.out.println();
    }

  }

}
