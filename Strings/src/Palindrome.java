public class Palindrome {

  public static boolean checkIfPalindrome(String input){
    StringBuilder res = new StringBuilder(input);
    int i =0;
    int j = res.length()-1;
    while(i<j){
      if(res.charAt(i++) != res.charAt(j--)){
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]){
    System.out.println(checkIfPalindrome("adbda"));
  }
}
