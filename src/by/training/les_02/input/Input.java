package by.training.les_02.input;

import by.training.les_02.view.Printer;

import java.util.Scanner;

public class Input {
    public int scannerInput(String str){
        int num;

        Printer.print(str);
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        return num;
    }
}
