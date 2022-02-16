package by.training.les_01.task_08;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]){
        sum();
    }

    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите n:");
        int n = input.nextInt();
        int [] arr= new int[n];

        System.out.print("Введите k:");
        int k = input.nextInt();

        System.out.print("Введите значения массива:");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % k == 0 ){
                sum += arr[i];
            }
        }

        System.out.print("sum=" + sum);
    }
}
