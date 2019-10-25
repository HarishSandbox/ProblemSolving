public class Substring {

  public static String allSubstring(String input){

    StringBuilder res = new StringBuilder();
    for(int i =0 ; i<3; i++){
      for(int j =i ; j<3; j++){
        for(int k = i; k<=j ; k++){
          res.append(input.charAt(k));
        }
        res.append("\n");
      }
    }
    return res.toString();
  }

  public static void main(String args[]){
    System.out.println(allSubstring("abc"));
  }
}
