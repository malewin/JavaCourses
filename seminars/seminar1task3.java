package seminars;

import java.time.LocalTime;
import java.util.Scanner;

public class seminar1task3 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String name = sc.next();
        //System.currentTimeMillis()
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(18, 0))){
            System.out.println("Добрый день " + name);
        }
        else {
            System.out.println("Добрый вечер " + name);
        }
    }
    
}
