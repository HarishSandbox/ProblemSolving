public class Anagram {

  // All Permutation
  public void findAllAnagrams(String s,int l, int r) {

    if(l==r){
      System.out.println(s);
      return;
    }

    for(int i =l ; i<=r; i++){
      s = swap(s,l, i);
      findAllAnagrams(s,l+1,r);
      s = swap(s,l, i);  // undo swap so that the original string is used for next permutation
    }

  }

  public String swap(String s,int i, int j ){
    char[] arr = s.toCharArray();
    char temp = arr[i];
     arr[i] = arr[j];
    arr[j] = temp;
    return String.valueOf(arr);
  }


  //  When input has duplicates, Ex: "AAB"
  public char[] findAllDistinctAnagrams(String input) {

    return null;
  }


  public static void main(String args[]){
    Anagram obj = new Anagram();
    String input = "abc";
     obj.findAllAnagrams(input,0,input.length()-1);
  }
}
