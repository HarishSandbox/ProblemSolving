import java.util.ArrayList;
import java.util.List;

class Node {
  private String key;
  private int value;
  private int hash;
  List<Integer> pos;

  Node(String key, int value, int pos){
    this.key = key;
    this.value = value;
//    this.hash = hash;
    this.pos = new ArrayList<>();
    this.setPos(pos);
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setPos(int pos){
    this.pos.add(pos);
  }
}
