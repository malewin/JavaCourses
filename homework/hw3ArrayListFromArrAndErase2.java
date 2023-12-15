// Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод принимает на вход один параметр Integer[] arr - список целых чисел и возвращает список ArrayList<Integer>


package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class hw3ArrayListFromArrAndErase2 {
    
    public class Answer{
        public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
            ArrayList<Integer> result = new ArrayList<>();
            // result = (ArrayList<Integer>) Arrays.asList(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0){
                    result.add(arr[i]);
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> res = new ArrayList<>();
        res = Answer.removeEvenNumbers(arr);
        System.out.println(res);
    }

}