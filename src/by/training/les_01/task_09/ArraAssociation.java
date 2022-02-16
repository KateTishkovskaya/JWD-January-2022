package by.training.les_01.task_09;

import java.util.Arrays;
import java.util.Scanner;

public class ArraAssociation {
    public static void main(String args[]){
        association();
    }

    public static void association(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите n первого массива:");
        int n1 = input.nextInt();
        int [] arr1= new int[n1];

        System.out.print("Введите n второго массива:");
        int n2 = input.nextInt();
        int [] arr2= new int[n2];

        System.out.print("Введите k:");
        int k = input.nextInt();

        System.out.print("Введите значения первого массива:");
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Введите значения второго массива:");
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        int n3 = n1 + n2 ;
        int [] arr3= new int[n3];
        for(int i = 0; i < k; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = k; i < k + n2; i++) {
            arr3[i] = arr2[i - k];
        }
        for (int i = k + n2; i < n3; i++){
            arr3[i] = arr1[i - n2];
        }

        for (int i = 0; i < n3; i++){
            System.out.print(arr3[i]+ " ");
        }
    }
}
