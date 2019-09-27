import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**Internal implementation of Priority Queue uses heap (max/min heap)
 * based on max/min queue. (Basically heapsort related methods)
 * An array of fixed size is used and A.heapSize is initially 0.
 */

public class PriorityQueueImpl {


  public static class RankComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
      return o1.getRank() - o2.getRank();
    }
  }

  public static class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
      return o1.getAge() - o2.getAge();
    }
  }


  public static void main(String[] args){
    Student s1 = new Student("s1", 24, 2);
    Student s2 = new Student("s2", 30, 1);
    Student s3 = new Student("s3", 20, 3);
    Student s4 = new Student("s4", 10, 4);

    List<Student> studentList = new ArrayList<>();
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    Collections.sort(studentList, new AgeComparator());

    for(Student each: studentList){
      System.out.printf("%s",each.getName());
      System.out.println();
    }

    System.out.println("----------------------");
    System.out.println();
    Queue<Student> pq = new PriorityQueue<>(new RankComparator());
    pq.add(s1);pq.add(s2);pq.add(s3);pq.add(s4);

    for(Student s: pq){
      System.out.printf("%s", s.getName());
      System.out.println();
    }

  }
}
