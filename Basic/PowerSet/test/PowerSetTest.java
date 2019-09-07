import org.junit.Test;

public class PowerSetTest {

  @Test
  public void powerSetRecursive() {
    PowerSet obj = new PowerSet();
    obj.powerSetRecursive("abc", "" , 0);
  }

  @Test
  public void powerSetIterative() {
    PowerSet obj = new PowerSet();
    obj.powerSetIterative(new int[] {1,2,3});

  }
}