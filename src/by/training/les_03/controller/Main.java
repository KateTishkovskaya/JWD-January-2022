package by.training.les_03.controller;

import by.training.les_03.input.Input;
import by.training.les_03.logic.Logic;
import by.training.les_03.view.Printer;

/**
 * class Main - класс тестирования программы
 *
 * @author K.P.Tishkovskaya
 * @version 1.1 15.12.2022
 */
public class Main {
    public static void main(String [] args) {
        //task 1
        int number;

        number = Input.scannerInput("Введите четырёхзначное число:");
        Logic.digitCheck(number);

        //task 3
        int lengthA;
        int lenghtB;

        lengthA = Input.scannerInput("\n\nВведите длину а:");
        lenghtB = Input.scannerInput("Введите длину b:");

        Printer.print(Logic.squareCalculation(lengthA, lenghtB));
        Printer.print(Logic.perimeterCalculation(lengthA, lenghtB));

        //task 4
        int x;
        int y;

        x = Input.scannerInput("\n\nВведите x:");
        y = Input.scannerInput("Введите y:");

        Logic.belongsRegion(x,y);

        //task 5
        int num1;
        int num2;
        int num3;

        num1 = Input.scannerInput("\n\nВведите первое число:");
        Printer.print(Logic.numExponentation(num1));

        num2 = Input.scannerInput("\nВведите второе число:");
        Printer.print(Logic.numExponentation(num2));

        num3 = Input.scannerInput("\nВведите третье число:");
        Printer.print(Logic.numExponentation(num3));
    }
}
