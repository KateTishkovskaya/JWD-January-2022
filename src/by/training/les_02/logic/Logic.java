package by.training.les_02.logic;

import by.training.les_02.view.Printer;

import java.util.Scanner;

public class Logic {
    public static void arithmeticLogic(int n) {
        if (n >= 1000 && n <= 9999){
            int firstNum;
            int secondNum;
            int thirdNum;
            int fourNum;

            firstNum = n / 1000;
            secondNum = n / 100 % 10;
            thirdNum = n % 100 / 10;
            fourNum = n % 1000 % 10;

            if((firstNum + secondNum) == (thirdNum + fourNum)) {
                Printer.print("true");
            }else {
                Printer.print("false");
            }
        }else {
            Printer.print("Вы ввели число непраивльно");
        }
    }

    public static void squareLogic(int a, int b) {
        int calculationSquare;
        double calculationPerimeter;

        calculationSquare = (a * b) / 2;
        Printer.print("Площадь треугольника:" + calculationSquare);

        calculationPerimeter = Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+(a+b);
        Printer.print("\nПериметр треугольника:" + calculationPerimeter);
    }

    public static void minMaxLogic(int num1, int num2, int num3) {
        if (num1 >= 0){
            Printer.print("Вывод:" + Math.pow(num1,2));
        }else {
            Printer.print("Вывод:" + Math.pow(num1,4));
        }

        if (num2 >= 0){
            Printer.print("\nВывод:" + Math.pow(num2,2));
        }else {
            Printer.print("\nВывод:" + Math.pow(num2,4));
        }

        if (num3 >= 0){
            Printer.print("\nВывод:" + Math.pow(num3,2));
        }else {
            Printer.print("\nВывод:" + Math.pow(num3,4));
        }
    }

    public static void regionLogic(int x, int y){
        if (x >= -4 && x <= 4 && y >= -3 && y <=4){
            Printer.print("true");
        }else {
            Printer.print("false");
        }
    }
}
