import java.util.Stack;

public class BinaryDecimal {

  int[] decimalToBinary(int n) {
    if (n==1)
      return new int[] {1};
    if (n==0)
      return new int[] {0};
    Stack<Integer> stk = new Stack<>();
    while (n>1) {
      stk.push(n%2);
      n = n/2;
    }
    int[] res = new int[stk.size()+1];
    int i =1;
    while(!stk.isEmpty()){
      res[i] = stk.pop();
      i+=1;
    }
    res[0] = n==1 ? 1 : 0;
    return res;
  }

  int binaryToDecimal(int[] bin) {

      int dec=0;
      for(int i = bin.length-1; i>-1; i--) {
        dec += bin[i]*Math.pow(2,bin.length-1-i);

      }
      return dec;

  }
}
