package P6_COLLECTIONS.Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        - Không chứa các phần tử trùng nhau
        - Lưu các phần tử khác nhau, nhưng các phần tử không được lưu trữ theo chỉ số
            + HashSet: Thứ tự bị thay đổi
            + LinkedSet: Thứ tự thêm vào được giữ nguyên
            + TreeSet: Thứ tự tăng dần
         */

        demoHashSet();

        demoLinkedHashSet();

        demoTreeSet();
    }

    // DEMO HASHSET
    static void demoHashSet()
    {
        Set<Object> setObj = new HashSet<>();

//        setObj.add("1");
//        setObj.add(new Student("ABC", 123));
//        setObj.add("Hello world");
//        setObj.add(new Student("Nguyễn Xuân Giang", 21));

        setObj.add(21);
        setObj.add(22);
        setObj.add(7);
        setObj.add(3);
        setObj.add(4); // giong nhau
        setObj.add(9);
        setObj.add(4); // giong nhau
        setObj.add(13);

        // Print set
        System.out.println("\n========= HashSet ==========");
        Iterator<Object> iterator = setObj.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    // DEMO LINKED HASHSET
    static void demoLinkedHashSet()
    {
        Set<Object> setObj = new LinkedHashSet<>();

//        setObj.add("1");
//        setObj.add(new Student("ABC", 123));
//        setObj.add("Hello world");
//        setObj.add(new Student("Nguyễn Xuân Giang", 21));

        setObj.add(21);//
        setObj.add(22);
        setObj.add(7);
        setObj.add(3);
        setObj.add(4);
        setObj.add(9);
        setObj.add(4);
        setObj.add(13); //


        // Print set
        System.out.println("\n========= LinkedHashSet ==========");
        Iterator iterator = setObj.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    // DEMO TREESET
    static void demoTreeSet()
    {
        Set<Object> setObj = new TreeSet<>();

//        setObj.add("1");
//        setObj.add(new Student("ABC", 123));
//        setObj.add("Hello world");
//        setObj.add(new Student("Nguyễn Xuân Giang", 21));

        setObj.add(21);//
        setObj.add(22);
        setObj.add(7);
        setObj.add(3);
        setObj.add(4);
        setObj.add(9);
        setObj.add(4);
        setObj.add(13); //


        // Print set
        System.out.println("\n========= TreeSet ==========");
        Iterator iterator = setObj.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
