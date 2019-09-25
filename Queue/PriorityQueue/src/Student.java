public class Student {


  String name;
  int age;
  int rank;

  public Student(String name, int age, int rank ) {
    this.age = age;
    this.rank = rank;
    this.name = name;
  }



  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
