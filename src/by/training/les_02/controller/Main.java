package by.training.les_02.controller;

import by.training.les_02.input.Input;
import by.training.les_02.logic.Logic;
import by.training.les_02.view.Printer;

public class Main {
    public static void main(String[] args){
        Input input = new Input();

        //task 1
        int number = input.scannerInput("Введите четырёхзначное число:");
        Logic.arithmeticLogic(number);

        //task 3
        int a = input.scannerInput("\n\nВведите а:");
        int b = input.scannerInput("Введите b:");
        Logic.squareLogic(a,b);

        //task 4
        int x = input.scannerInput("\n\nВведите x:");
        int y = input.scannerInput("Введите y:");
        Logic.regionLogic(x, y);

        //task 5
        int num1 = input.scannerInput("\n\nВведите первое число:");
        int num2 = input.scannerInput("Введите второе число:");
        int num3 = input.scannerInput("Введите третье число:");
        Logic.minMaxLogic(num1,num2,num3);
    }
}
