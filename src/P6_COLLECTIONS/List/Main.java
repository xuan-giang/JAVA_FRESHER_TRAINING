package P6_COLLECTIONS.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //demoArrayList();

        demoLinkList();
    }

    // ARRAYLIST
    public static void demoArrayList()
    {
        /*
        - Là một mảng động để lưu trữ các phần tử
        - Các phần tử có thể trùng nhau
        - Có thể duyệt bằng For hoặc Iterator
        - Better for storing and accessing data
         */

        List<Object> listObj = new ArrayList<>();

        listObj.add(1);
        listObj.add("Beautiful Cat");
        listObj.add("Ha Noi University Of Industry - Major: Information System");
        listObj.add(new Student("Nguyen Xuan Giang", 20));
        listObj.add(new Student("ABC", 123));

        System.out.println(listObj.size());

        System.out.println("\n----------------------------------------------");
        System.out.println("Print ArrayList: ");
        for (int i = 0; i < listObj.size(); i++) {
            System.out.println(listObj.get(i));
        }

        System.out.println("\n----------------------------------------------");
        listObj.set(0, new Student("Giang", 19));
        System.out.println("Print New ArrayList: ");
        for (Object obj : listObj) {
            System.out.println(obj);
        }


        // REMOVE ELEMENT
        listObj.remove("Beautiful Cat");
        listObj.remove(listObj.size()-1); // remove last element
        listObj.remove(new Student("ABC", 123));


        // DEMO ITERATOR
        System.out.println("\n----------------------------------------------");
        System.out.println("Demo Iterator - After remove elements: ");

        if(!listObj.isEmpty())
        {
            Iterator<Object> iterator = listObj.listIterator();
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }else{
            System.out.println("List is empty!");
        }

        // REMOVE ALL
        listObj.clear();

    }

    //  LINKEDLIST
    public static void demoLinkList()
    {
        /*
        - Lưu các phần tử bằng Doubly Linked List
        - implement List & DeQueue
        - Better for manipulating (update, delete)
         */
        List<Object> listObj = new LinkedList<>();

        listObj.add(1);
        listObj.add("Beautiful Cat");
        listObj.add("Ha Noi University Of Industry - Major: Information System");
        listObj.add(new Student("Nguyen Xuan Giang", 20));
        listObj.add(new Student("ABC", 123));

        System.out.println(listObj.size());

        System.out.println("\n----------------------------------------------");
        System.out.println("Print ArrayList: ");
        for (int i = 0; i < listObj.size(); i++) {
            System.out.println(listObj.get(i));
        }

        System.out.println("\n----------------------------------------------");
        listObj.set(0, new Student("Giang", 19));
        System.out.println("Print New ArrayList: ");
        for (Object obj : listObj) {
            System.out.println(obj);
        }


        // REMOVE ELEMENT
        listObj.remove("Beautiful Cat");
        listObj.remove(listObj.size()-1); // remove last element
        listObj.remove(new Student("ABC", 123));


        // REMOVE ALL
        listObj.clear();
    }
}
