// Дано четное число N (>0)  и строки с1 и с2, которые следует учитывать как 1 символ.
// Написать метод, который вернет строку длины N*2,
// которая состоит из чередующихся последовательностей с1 и с2, начиная с с1.

package seminars;

import java.util.Scanner;

public class seminar2task1 {
    
    public static void main(String[] args) {
        String c1 = "c1";
        String c2 = "c2";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число комбинаций: ");
        int n = sc.nextInt();
        System.out.println(repeat(n, c1, c2));
    }

    public static String repeat(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                result.append(c1);
            }
            else {result.append(c2);}
        }
        System.out.println(result.length());
        return result.toString();
    }
}
