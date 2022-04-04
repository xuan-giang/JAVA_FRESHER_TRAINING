package P7_GENERIC.GenericMethod;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {12, 52, 64, 55, 10, 99};
        String[] arrString = {"Java", "PHP", "Android", "C++"};

        //DEMO PRINT INT ARRAY
        printArray(arrInt);

        //DEMO PRINT STRING ARRAY
        printArray(arrString);
    }

    public static <T> void printArray(T[] arr)
    {
        System.out.println();
        for (T t : arr)
        {
            System.out.print(t + " ");
        }
    }
}
