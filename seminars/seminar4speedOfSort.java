package seminars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class seminar4speedOfSort {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов к добавлению в массивы: ");
        Scanner sc = new Scanner(System.in);
        Long amount = sc.nextLong();
        System.out.println("Время добавления " + amount + " количества элементов в ArrayList равно = " + addToArrayLst(amount) + "ms");
        System.out.println("Время добавления " + amount + " количества элементов в LinkedList равно = " + addToLinkedList(amount) + "ms");
    }
    public static long addToArrayLst(long amount){
        List<Integer> lst = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            lst.add(1);
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
    }
    public static long addToLinkedList(long amount){
        List<Integer> lst = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            lst.add(1);
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;
}
}
