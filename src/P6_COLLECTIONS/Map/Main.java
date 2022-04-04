package P6_COLLECTIONS.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        - Lưu trữ các phần tử khác nhau - đối tượng gồm (KEY - VALUE)
        - KHÔNG chứa các phần tử key giống nhau

         */
        demoHashMap();

        demoLinkedMap();

        demoTreeMap();
    }

    static void demoHashMap()
    {
        Map mapObj = new HashMap();

        mapObj.put("NV01", "Nguyen Van A1"); // key giong nhau
        mapObj.put("NV03", "Nguyen Van A2");
        mapObj.put("NV02", "Nguyen Van A3");
        mapObj.put("NV01", "Nguyen Van B"); // key giong nhau
        mapObj.put("NV05", "Nguyen Van A5");
        mapObj.put("NV04", "Nguyen Van A4");
        mapObj.put("NV09", "Nguyen Van A9");

        System.out.println("\n---- Demo HashMap: Thứ tự bị thay đổi");
        Iterator iterator = mapObj.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

    static void demoLinkedMap()
    {
        Map mapObj = new LinkedHashMap();

        mapObj.put("NV01", "Nguyen Van A1"); // key giong nhau
        mapObj.put("NV02", "Nguyen Van A2");
        mapObj.put("NV03", "Nguyen Van A3");
        mapObj.put("NV01", "Nguyen Van B"); // key giong nhau
        mapObj.put("NV05", "Nguyen Van A5");
        mapObj.put("NV04", "Nguyen Van A4");
        mapObj.put("NV09", "Nguyen Van A9");

        System.out.println("\n---- Demo LinkedMap: Thứ tự như lúc nhập vào");
        Iterator iterator = mapObj.keySet().iterator();
        while (iterator.hasNext())
        {
            Object objectKey = iterator.next();
            Object objectValue = mapObj.get(objectKey);
            System.out.println(objectKey + " - " + objectValue);
        }

    }

    static void demoTreeMap()
    {
        Map mapObj = new TreeMap();

        mapObj.put("NV01", "Nguyen Van A1"); // key giong nhau
        mapObj.put("NV02", "Nguyen Van A2");
        mapObj.put("NV03", "Nguyen Van A3");
        mapObj.put("NV01", "Nguyen Van B"); // key giong nhau
        mapObj.put("NV05", "Nguyen Van A5");
        mapObj.put("NV04", "Nguyen Van A4");
        mapObj.put("NV09", "Nguyen Van A9");

        System.out.println("\n---- Demo LinkedMap: Thứ tự sắp xếp tăng dần");
        Iterator iterator = mapObj.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }



    }

    static void demo()
    {
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();

        treeMap1.put(1, "Nguyen Van A");
        treeMap1.put(2, "Nguyen Van B");

        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        Iterator iterator = treeMap1.keySet().iterator();
        while (iterator.hasNext())
        {
            Integer objectKey = (Integer) iterator.next();
            String objectValue = treeMap1.get(objectKey);

            treeMap2.put(objectKey, objectValue);
        }

    }



}
