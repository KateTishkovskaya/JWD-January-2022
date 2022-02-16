package by.training.les_01.task_05;

import java.util.Scanner;

public class Nums {
    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        exponentiation();
    }

    public static void exponentiation(){
        System.out.print("Введите первое число:");
        int num1 = input.nextInt();

        if (num1 >= 0){
            System.out.println("Вывод:" + Math.pow(num1,2));
        }else
            System.out.println("Вывод:" + Math.pow(num1,4));


        System.out.print("Введите второе число:");
        int num2 = input.nextInt();

        if (num2 >= 0){
            System.out.println("Вывод:" + Math.pow(num2,2));
        }else
            System.out.println("Вывод:" + Math.pow(num2,4));


        System.out.print("Введите третье число:");
        int num3 = input.nextInt();

        if (num3 >= 0){
            System.out.println("Вывод:" + Math.pow(num3,2));
        }else
            System.out.println("Вывод:" + Math.pow(num3,4));
    }
}
