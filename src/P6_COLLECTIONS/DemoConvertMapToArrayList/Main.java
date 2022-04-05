package P6_COLLECTIONS.DemoConvertMapToArrayList;



import java.util.*;
class GFG {

    static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();


    static void convertMapToList()
    {

        ArrayList<Integer> keyList = new ArrayList<Integer>(treeMap.keySet());


        ArrayList<String> valueList = new ArrayList<String>(treeMap.values());


        System.out.println("List of keys of the given Map : " + keyList);


        System.out.println("List of values of the given Map : " + valueList);
    }


    public static void main(String args[])
    {

        treeMap.put(1, "Java");
        treeMap.put(2, "PHP");
        treeMap.put(3, "Android");
        treeMap.put(4, "C++");
        treeMap.put(5, "Js");


        System.out.println("The TreeMap is : " + treeMap);

        convertMapToList();
    }
}

