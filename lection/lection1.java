package lection;

/**
 * lection1
 */
// public class lection1 {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//         int i = 1_23_234; // пофиг на подчеркивания, их не видит компилятор, чисто для эстетики вида
//         System.out.println(i);
//         String s ="qwer";
//         System.out.println(s.charAt(2)); //метод отображения символа по индексу

//         System.out.println(Integer.MAX_VALUE);
//         System.out.println(Integer.MIN_VALUE); // обертки
//         // присваивание: = 
//         // арифметические: *,/,+,-,%,++,--
//         // операции сравнения: <,>,==,!=, >=, <=
//         // операции логики: ||, &&, ^, !
//         // побитовые операции: <<, >>, &, |, ^
//         int a = 1;
//         var p = a-- - --a;
//         System.out.println(p);
//         var p1 = --a- --a;
//         System.out.println(p1);
//         var p2= --a- a--;
//         System.out.println(p2);
//         var p3= a-- - a--;
//         System.out.println(p3);

//         var k = 8; // 1000 -> 10000
//         System.out.println(k<<1);
//         var t = 18; // 10010 -> 1001
//         System.out.println(t>>1);

//         int y = 5;
//         int x = 2;
//         System.out.println(x | y);
//         // 010
//         // 101
//         // 111 (7)
//         String m = "qwwe1"; // 5 0...4
//         boolean d = m.length() >=  5 && m.charAt(4) == '1'; // && -быстрая коньюнкция & - может выдавать ошибку в терминал
//         System.out.println(d);
//         // двойные аперсанды && и || проверяет левую часть и дальше не идут потому что им достаточно одного
//         // одинарные & и | проверяет обе части от них
//         //массивы

//         int[] arr = new int[10];
//         System.out.println(arr.length); //10
//         arr = new int[] {1,2,3};
//         System.out.println(arr.length); //3

//         //многомерные

//         int[][] array = new int [3][5];

//         for (int j = 0; j < array.length; j++) {
//             for (int j2 = 0; j2 < array.length; j2++) {
//                 System.out.printf("%d", array[j][j2]);
//             }
//             System.out.println();
//         }

//         //аналог input (считывание строк)
        
//     }
// }
//аналог input (считывание строк)

import java.util.Scanner;
public class lection1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: "); 
        // String name = iScanner.nextLine();
        // System.out.printf("привет, %s!", name); // для строк
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // проверка на true целое ли число при вводе
        System.out.println(flag);
        int x = iScanner.nextInt(); // для целых чисел
        System.out.printf("double a: ");
        double y = iScanner.nextDouble(); // для вещественных
        System.out.printf("%d + %f = %f", x, y, x + y); // форматированный вывод
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n",a, b, c);
        System.out.printf("%d + %d = %d \n",a, b, c);
        System.out.println(res);
        // спецификаторы %d - целочисленных значений; %x - для вывода шестнадцатиречных значений
        // %f - для вывода чисел с плавающей точкой; %e - для вывода чисел в экспоненциальной форме;
        // %c - для вывода одиночного символа; %s - для вывода строковых значений
        // тернарный оператор "? :"
        int t = 1;
        int w = 2;
        int min = a < b ? a : b; // если  условие true  то return 'a', иначе return 'b'
        System.out.println(min);
        // оператор switch проверяет на истинность в case/default:

        int mounth = 2;
        String text = "";
        switch (mounth) {
            case 1:
            case 2:
            case 3:
                text = "Febr";
                break;
        
            default:
                text = "mistake";
                break;
        }
        
        
    }
}


