package P5_FileProcessingandExceptionHandling.Exception;

import java.io.File;
import java.io.IOException;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[ ] args) {
        /*
        - Lỗi biên dịch
        - Runtime exception
        - Logic exception
         */

        demoException1();
        demoException2();

        checkAge(5);
    }

    public static void demoException1()
    {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void demoException2()
    {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}