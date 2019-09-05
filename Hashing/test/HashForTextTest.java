import org.junit.Test;

public class HashForTextTest {

  @Test
  public void readFromURL() throws Exception {
    HashForText obj = new HashForText(1000);
    obj.readInput("http://www.ccs.neu.edu/home/vip/teach/Algorithms/" +
            "7_hash_RBtree_simpleDS/hw_hash_RBtree/alice_in_wonderland.txt");
    obj.outputToFile("out.txt");
  }

  @Test
  public void testHash() throws Exception {
    HashForText obj = new HashForText(1000);
    obj.insert("Hello",2);
    obj.insert("Hello",5);
    obj.insert("Hell", 3);
    obj.listAllKeys();
    obj.delete("Hell");
    obj.listAllKeys();
    obj.outputToFile("sam.txt");

  }

}