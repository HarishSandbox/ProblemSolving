import org.junit.Test;

public class BinaryDecimalTest {

  @Test
  public void decimalToBinary() {
    BinaryDecimal obj = new BinaryDecimal();
    int bin[] = obj.decimalToBinaryUsingStack(12);
    for(int i: bin){
      System.out.printf("%d ", i);
    }
    System.out.println();
    System.out.println(obj.decimalToBinaryUsingString(12));
  }

  @Test
  public void binaryToDecimal() {
    BinaryDecimal obj = new BinaryDecimal();
    int dec = obj.binaryToDecimal(new int[] {1,1,0,0});
    System.out.printf("%d ", dec);
  }
}