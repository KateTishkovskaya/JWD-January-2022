package by.training.les_01.task_01;

import java.util.Scanner;

public class TrueFalse {
    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        sumArithmetic();
    }

    public static void sumArithmetic(){
        System.out.println("Введите целое четырехзначное число:");
        int n = input.nextInt();

        if (n >= 1000 && n<=9999){
            int firstNum;
            int secondNum;
            int thirdNum;
            int fourNum;

            firstNum = n / 1000;
            secondNum = n / 100 % 10;
            thirdNum = n % 100 / 10;
            fourNum = n % 1000 % 10;

            if((firstNum + secondNum) == (thirdNum + fourNum)){
                System.out.println("true");
            }else
                System.out.println("false");
        }else
            System.out.println("Вы ввели число неправильно");
    }
}
