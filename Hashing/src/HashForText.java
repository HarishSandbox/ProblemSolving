import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class HashForText {

  private List<Node>[] hashTable;
  private int mSize;

  HashForText(int mSize){
    this.mSize = mSize;
    hashTable = new ArrayList[mSize+1];
  }

  int hashFunction(String key){
    int hash = 7;
    for (int i = 0; i < key.length(); i++) {
      hash = hash*31 + key.charAt(i);
      hash = hash % mSize + 1;
//      System.out.println(hash);
    }
    return hash;
  }

  public void readInput(String inputURL) {
    URL url;
    try {
      url = new URL(inputURL);
    } catch (MalformedURLException e) {
      throw new IllegalArgumentException("Unable to read from URL - " + e.getMessage());
    }

    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
      String str;
      int count =0;
      while ((str = br.readLine()) != null) {
        String[] word = str.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
        for (int i = 0; i < word.length; i++) {
          insert(word[i],count++);
//          System.out.printf("%s\n", word[i]);
        }
      }
    } catch (IOException e) {
      throw new IllegalArgumentException(e.getMessage());
    }
  }

  void outputToFile(String fileName) throws Exception{
    String str = listAllKeys();

    File file = new File(fileName);
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write(str);
    fileWriter.flush();
    fileWriter.close();
  }

  void insert(String key, int position) {
    List<Node> node = findKey(key);
    if(node!=null && node.size()==1){
      node.get(0).setValue(node.get(0).getValue()+1);
      node.get(0).setPos(position);
    } else {
      List<Node> entry = new ArrayList<>();
      entry.add(new Node(key, 1, position));
      hashTable[hashFunction(key)] = entry;
    }
  }

  void delete(String key){
    List<Node> node = findKey(key);
    if(node!= null){
      System.out.printf("\nRemoved entry %s:%d\n", node.get(0).getKey(),
              node.get(0).getValue());
      hashTable[hashFunction(key)] = null;
     }
  }

  void increaseKey(String key) {
    List<Node> node = findKey(key);
    if (node != null && node.size() == 1) {
      node.get(0).setValue(node.get(0).getValue() + 1);
    } else {
      throw new IllegalArgumentException("Key not found");
    }
  }

  List<Node> findKey(String key){
    int hashCode = hashFunction(key);
      return hashTable[hashCode];
  }


  String listAllKeys(){
    int count = 0;
    StringBuilder output = new StringBuilder();
    for(List<Node> entry : hashTable){
      if(entry!= null) {
        count++;
        output.append("\nKey: ").append(entry.get(0).getKey()).append("\tValue(Count): ")
                .append(entry.get(0).getValue());
        for (Integer pos : entry.get(0).pos) {
          output.append("\nPosition: ").append(pos);
        }
      }
    }
    output.append("\nmSize: ").append(count);
    return output.toString().substring(1);
  }
}
