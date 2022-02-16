package by.training.les_01.task_02;

import java.util.Scanner;

public class EquationArithmetic {
    private static Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        calculation();
    }

    public static void calculation(){
        System.out.println("Введите число a:");
        int a = input.nextInt();

        System.out.println("Введите число b:");
        int b = input.nextInt();

        System.out.println("Введите число c:");
        int c = input.nextInt();

        double number = ((b + (Math.sqrt(Math.pow(b,2)+4*a*c)))/2)-(Math.pow(a,3)*c)+(Math.pow(b,-2));

        System.out.println("Результат вычисления:" + number);
    }
}
