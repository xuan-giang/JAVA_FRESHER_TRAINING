package P2_JAVA_BASIC;

import java.util.Scanner;

public class Array {
    /*
    Khai báo:
    Cách 1: int[] a;
    Cách 2: int a[];

    Cách 1: int[] a = new int[5];
    Cách 2: int a[] = new int[5];
     */

//    int[] a = {1, 2, 3, 4, 5};
//    int[] x = new int[]{5,4,5,6};
//    String []arrName = {"Giang", "Nguyễn", "Xuân"};

    int[] a = {12,43,65,32,67,84,22,44,54,17};

    public void getArrayLength()
    {
        System.out.println("Array length = " + a.length);
    }

    public void getSumArray()
    {
        int sum = 0;
        for(int x=0; x < a.length; x++) {
            sum += a[x];
        }
        System.out.println("Sum of array = " + sum);
    }

    int[][] b = {{1, 2, 3}, {4, 5, 6} };
    public void printMatrix()
    {
        System.out.println("Matrix :");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public void findElement()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find in array: ");
        int k = sc.nextInt();

        boolean isExists = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == k)
            {
                System.out.println(k + " is exists");
                isExists = true;
            }
        }
        if(!isExists){
            System.out.println("Can not find!");
        }
    }

    public void sortArray()
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void printArray()
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.printf(a[i] + " ");
        }
    }
}
