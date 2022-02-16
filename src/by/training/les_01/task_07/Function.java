package by.training.les_01.task_07;

import java.util.Scanner;

public class Function {
    public static void main(String args[]){
        calculation();
    }

    public static void calculation(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите а:");
        double a = input.nextDouble();
        System.out.print("Введите b:");
        double b = input.nextDouble();
        System.out.print("Введите h:");
        double h = input.nextDouble();
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) {

            y = Math.sin(i) * Math.sin(i) - Math.cos(2*i);
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
        System.out.println();
    }
}
