package by.training.les_01.task_06;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String args[]){
        sum();
    }

    public static void sum(){
        Scanner input = new Scanner(System.in);
        int [] arr= new int[3];

        System.out.print("Введите 3 числа:");
        for(int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < 3; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int max = arr[0];
        for (int i=0; i<3; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        int rez = min + max;
        System.out.print("rez=" + rez);
    }
}
