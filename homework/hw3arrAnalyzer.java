// Реализуйте метод, который принимает на вход целочисленный массив агг.
// - Создаёт список ArrayList, заполненный числами из исходого массива агг
// - Сортирует список по возрастанию и выводит на экран.
// Находит минимальное значение в списке и выводит на экран
// - Minimum is (число)
// Находит максимальное значение в списке и выводит на экран -
// Maximum is (число)
// - Находит среднее арифметическое значений списка и выводит на экран
// Average 15
// з число
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
// Integerl] arr - массив целых чисел.
package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hw3arrAnalyzer {
    public class Answer{
        public static void analyzeNumbers(Integer[] arr) {
            Arrays.sort(arr);
            List<Integer> result = Arrays.asList(arr);
            Integer min = 0;
            Integer max = 0;
            int count = 0;
            int sum = 0;
            int avg = 0;
            // result = (ArrayList<Integer>) Arrays.asList(arr);
            for (int i = 0; i < arr.length; i++) {
                count++;
                sum += arr[i];
            }
            avg = sum / count;
            max = Collections.max(result);
            min = Collections.min(result);
            System.out.println("Ваш отсортированный список:" + result);
            System.out.println("Minimum is: " + min);
            System.out.println("Maximum is: " + max);
            System.out.println("Average is: " + avg);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4,2,7,5,1,3,8,6,9};
        Answer.analyzeNumbers(arr);
    }
    
}
