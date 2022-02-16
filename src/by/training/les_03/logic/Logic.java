package by.training.les_03.logic;

import by.training.les_02.view.Printer;

/**
 * class Logic отвечает за логику программы
 *
 * @author K.P.Tishkovskaya
 * @version 1.1 15.02.2022
 */
public class Logic {
    //for task 1
    /**
     * метод проверяет, является ли число четырёхзназным
     * @param num - число, вводимое пользователем
     */
    public static void digitCheck(int num) {
        if (num >= 1000 && num <= 9999){
            digitSum(num); //если число введено верно, то выполняется метод digitSum
        } else {
            Printer.print("Вы ввели число непраивльно");
        }
    }

    /**
     * Метод, который проверяет равняется ли сумма двух первых чисел
     * сумме двух других
     * @param num - число, вводимое пользователем
     */
    public static void digitSum(int num) {
        int firstNum;
        int secondNum;
        int thirdNum;
        int fourNum;

        firstNum = num / 1000;
        secondNum = num / 100 % 10;
        thirdNum = num % 100 / 10;
        fourNum = num % 1000 % 10;

        if((firstNum + secondNum) == (thirdNum + fourNum)) {
            Printer.print("true");
        }else {
            Printer.print("false");
        }
    }

    //for task 3

    /**
     * метод, вычисляющий площадь прямоугольного треугольника
     * @param lenghtA - длина первого катета
     * @param lenghtB - длина второго катета
     * @return square
     */
    public static int squareCalculation(int lenghtA, int lenghtB) {
        int square = (lenghtA * lenghtB) / 2;

        Printer.print("Площадь треугольника:");

        return square;
    }

    /**
     * метод, вычиляющий периметр прямоугольного трегольника
     * @param lenghtA - длина первого катета
     * @param lengthB - длина второго катета
     * @return perimeter
     */
    public static double perimeterCalculation(int lenghtA, int lengthB) {
        double perimeter = Math.sqrt(Math.pow(lenghtA, 2)+Math.pow(lengthB, 2))+
                (lenghtA + lengthB);

        Printer.print("\nПериметр треугольника:");

        return perimeter;
    }

    //for task 4

    /**
     * Метод вычисляет, принадлежит ли точка заданному интервалу
     * @param x - координата x
     * @param y - координата Y
     */
    public static void belongsRegion(int x, int y) {
        if ((x >= -4) && (x <= 4) && (y >= -3) && (y <=4)){
            Printer.print("true");
        } else {
            Printer.print("false");
        }
    }

    //for task 5

    /**
     * Метод возводит во 2 степень, если число положительное и
     * в 4 стпень, если - отрицательное
     * @param number - число, вводимое пользователем
     * @return rez
     */
    public static double numExponentation(int number) {
        if (number >= 0){
            double rez;
            rez = Math.pow(number, 2);

            Printer.print("Вывод:");

            return rez;
        } else {
            double rez;
            rez = Math.pow(number, 4);
            Printer.print("Вывод:");

            return rez;
        }
    }
}
