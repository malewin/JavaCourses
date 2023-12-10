package homework;

import java.util.Scanner;

public class hw1trianglenumber {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner userNumber = new Scanner(System.in);
        Integer un = userNumber.nextInt();
        // System.out.println(un);
        System.out.println(triangleCounter(un));
       
    }
    static int triangleCounter(int usNumb){
        int result = 0;
        int[] tempArray = new int [usNumb+1];
        for (int index = 0; index < tempArray.length; index++) {
            result = result + index;
        }
        return result;
    }
}
