/* Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида text:num
 * Нужно сделать сплит строки по : , сохранить text  в связный список на позицию num.
 * Если введено print : nun , вывести строку из позиции num в связном списке и удаляет её из списка
 */



package seminars;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class seminar4task2 {
    static List<String> dataList = new LinkedList<>();
    public static String prompt(){
        System.out.println("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static String run() {
        String inpMess = prompt();
        String[] splArr = inpMess.split(":");                   
        String word = splArr[0];
        int index = Integer.parseInt(splArr[1]);
        if (index>dataList.size()){
            warning(index);
        }
        if (word.equals("print") && dataList.get(index) != null){
            System.out.println(dataList.get(index));
            dataList.remove(index);
        }
        else{
            dataList.add(index, word);
        }
        return inpMess;
    }
    public static void warning(int ind){
        for (int i = 0; i < ind; i++) {
            dataList.add(null);
        }
    }
    public static void main(String[] args) {
        while (true) {
            if (run().equals("q")){
                System.exit(0);}
            run();
            }
        }
}
