package by.training.les_01.task_10;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String args[]){
        association();
    }

    public static void association(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите n:");
        int n = input.nextInt();

        if (n % 2 == 0){

            int arr[][] = new int[n][n];

            for(int i=0;i<n;i+=2){
                for(int j=0;j<n;j++) {
                    arr[i][j]=j+1;
                }
            }

            for(int i=1;i<n;i+=2) {
                for (int j=0;j<n;j++){
                    arr[i][j]=n-j;
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) {
                    System.out.print(arr[i][j] +"\t");
                }
                System.out.println();
            }
        }else
            System.out.print("Введено нечётное число");
    }
}
