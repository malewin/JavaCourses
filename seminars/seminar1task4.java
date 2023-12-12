package seminars;

import java.util.Random;

/**
 * seminar1task4
 */
public class seminar1task4 {

    public static void main(String[] args) {
        int[] array = new int [] {1,1,0,1,1,1,1,1,1};
        //int[] arr = new int[6];
        int count = 0;
        int max = 0;
        for (int i : array) {
            if (i == 1) count++;
            else {
                if (count > max) max = count;
                count = 0;
            }
        }
        if (count > max) max = count;
        System.out.println(max);
        
    }
}