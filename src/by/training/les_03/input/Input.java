package by.training.les_03.input;

import by.training.les_03.view.Printer;

import java.util.Scanner;

/**
 * class Input отвечает за ввод данных
 *
 * @author K.P.Tishkovskaya
 * @version 1.1 15.02.2022
 */
public class Input {
    /**
     * Метод отвечает за воод значений с клавиатуры
     * @param str - сообщение выводимое пользователю
     * @return num
     */
    public static int scannerInput(String str) {
        int num;

        Scanner input = new Scanner(System.in);
        Printer.print(str);

        num = input.nextInt();
        return num;
    }
}
