package homework;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class hw2BubbleSortingInLog {
    private static final Logger LOG = Log1.log(hw2BubbleSortingInLog.class.getName());
    public static void main(String[] args) throws IOException {
        int [] arr = new int[] {-1, -5, 9 , 3 , 0};
        String convert = Arrays.toString(BubbleSort.sort(arr));
        if (arr.length != 0){
        System.out.println(convert);
        }

    }
    
    class BubbleSort {
        public static int[] sort(int[] unsortedArray) throws IOException {
            // FileWriter in = new FileWriter("arrayLog.txt", true);
            FileHandler fl = new FileHandler("array1Log.txt", true);
            int[] mas = unsortedArray;
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;
                        
                        temp = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = temp;
                        
                        LOG.addHandler(fl);
                        LOG.log(Level.INFO, Arrays.toString(mas));
                        // in.append(Arrays.toString(mas)).append("\n");
                        // in.flush();
                    }
                }
            }
            return mas;
        }
    }
}
