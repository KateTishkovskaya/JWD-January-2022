package by.training.les_01.task_04;

public class Cords {

    public static void main (String[] args){
        region(2,3);
    }

    public static void region(int x, int y){
        if (x >= -4 && x <= 4 && y >= -3 && y <=4){
           System.out.println("true");
        }else
            System.out.println("false");
    }
}
