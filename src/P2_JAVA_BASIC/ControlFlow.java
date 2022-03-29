package P2_JAVA_BASIC;

import java.util.Random;

public class ControlFlow {

    // IF ELSE - TOÁN TỬ 3 NGÔI
    public void controlFlow1()
    {
        int number = (int) (Math.random() * 100);
        if(number % 2 == 0)
        {
            System.out.println(number + " là số chẵn");
        }else {
            System.out.println(number + " là số lẻ");
        }

        String a = (number % 2 == 0) ? "Số chẵn" : "Số lẻ";
    }


    // SWITCH CASE
    public void controlFlow2()
    {
        int max = 9;
        int min = 1;
        Random rand = new Random();
        int randomNumer = rand.nextInt((max - min) + 1) + min;

        switch (randomNumer)
        {
            case 1:
                System.out.println("Số ngẫu nhiên là 1");
                break;

            case 2:
                System.out.println("Số ngẫu nhiên là 2");
                break;

            case 3:
                System.out.println("Số ngẫu nhiên là 3");
                break;

            case 4:
                System.out.println("Số ngẫu nhiên là 4");
                break;

            case 5:
                System.out.println("Số ngẫu nhiên là 5");
                break;

            default:
                System.out.println("Số ngẫu nhiên lớn hơn 5, là " + randomNumer);
                break;
        }
    }
}
