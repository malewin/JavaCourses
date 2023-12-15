package seminars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class seminar3ArrayListSort {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        Random random = new Random();
        int n = 10;

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(10)); 
        }
        System.out.println(list);
        Collections.reverse(list); // класс Collections  содержит много методов для преобразования коллекций
        System.out.println(list);
        list.sort(null); // от меньшего к большему
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // от большего к меньшему
        System.out.println(list);
        
    }
}