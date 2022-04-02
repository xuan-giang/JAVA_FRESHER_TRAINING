package P6_COLLECTIONS.Set.Equal_and_HashCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        Set<Student> setStudents = new LinkedHashSet<>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        // in các phần tử của set ra màn hình
        for (Student student : setStudents) {
            System.out.println(student);
        }
    }
}
