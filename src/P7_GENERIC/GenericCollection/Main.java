package P7_GENERIC.GenericCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        collectionList();

        collectionSet();

        collectionMap();
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

    static void collectionMap()
    {
        Map<String, String> mapObj = new HashMap<String, String>();

        mapObj.put("NV01", "Nguyen Van A1"); // key giong nhau
        mapObj.put("NV03", "Nguyen Van A2");
        mapObj.put("NV02", "Nguyen Van A3");
        mapObj.put("NV01", "Nguyen Van B"); // key giong nhau
        mapObj.put("NV05", "Nguyen Van A5");
        mapObj.put("NV04", "Nguyen Van A4");
        mapObj.put("NV09", "Nguyen Van A9");


        Iterator<Map.Entry<String, String>> iterator = mapObj.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
