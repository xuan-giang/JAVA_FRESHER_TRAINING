package P6_COLLECTIONS.Comparable;



import java.util.*;

public class main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Nguyen Van C", 25));
        studentList.add(new Student("Nguyen Van E", 18));
        studentList.add(new Student("Nguyen Van A", 29));
        studentList.add(new Student("Nguyen Van F", 20));
        studentList.add(new Student("Nguyen Van B", 21));

        Collections.sort(studentList);

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
