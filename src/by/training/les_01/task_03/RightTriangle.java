package by.training.les_01.task_03;

import java.util.Scanner;

public class RightTriangle {
    private static Scanner input = new Scanner(System.in);

    private static int a,b;

    public static void main (String[] args){
        System.out.print("Введите а:");
        a = input.nextInt();

        System.out.print("Введите b:");
        b = input.nextInt();

        square();
        perimeter();
    }

    public static void square(){
        int calculationSquare = (a * b) / 2;
        System.out.println("Площадь прямоугольного треугольника:" + calculationSquare);
    }

    public static void perimeter(){
        double calculationPerimeter = Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+(a+b);
        System.out.println("Периметр прямоугольного треугольника:" + calculationPerimeter);
    }
}
