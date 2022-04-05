package P7_GENERIC.GenericCollection;



import P6_COLLECTIONS.List.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        collectionList();

        collectionSet();

    }

    static void collectionList()
    {
        List<Object> studentList = new ArrayList<>();

        studentList.add(new Student1<>("2019600275", "Nguyễn Xuân Giang", 20));
        studentList.add(new Student2("Nguyễn Văn A", 20));

        System.out.println(studentList.toString());
    }

    static void collectionSet()
    {
        Set<Object> setObj = new HashSet<>();

        setObj.add("1");
        setObj.add(new Student("ABC", 123));
        setObj.add("Hello world");
        setObj.add(new Student("Nguyễn Xuân Giang", 21));


        // Print set
        System.out.println("\n========= HashSet ==========");
        Iterator<Object> iterator = setObj.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


}
