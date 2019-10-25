public class Reverse {

  public static char[] rev(String input) {
    char[] arr = input.toCharArray();
    int i = 0, j = arr.length-1;
    char temp;
    while (i < j) {
      temp = arr[i];
      arr[i++] = arr[j];
      arr[j--] = temp;
    }
      return arr;
  }

  public static int revANumber(int input) {
    int rev = 0;
    while(input > 0 ){
      int rem = input % 10;
      rev = (rev*10) + rem;
      input = input/10;
    }
    return rev;
  }

  public static void main(String args[]){
    System.out.println("String reversal");
    char[] arr = rev("abcd");
    for(char c : arr){
      System.out.printf("%c", c);
    }
    System.out.println();

    System.out.println("Number reversal");
    System.out.println(revANumber(1234));
  }
}
