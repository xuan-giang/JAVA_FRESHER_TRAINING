package P6_COLLECTIONS.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Nguyen Van C", 25));
        studentList.add(new Student("Nguyen Van E", 18));
        studentList.add(new Student("Nguyen Van A", 29)); // giong nhau
        studentList.add(new Student("Nguyen Van A", 20)); // giong nhau
        studentList.add(new Student("Nguyen Van B", 21));

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().compareTo(o2.getName()) != 0)
                {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(studentList, comparator);

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


}
