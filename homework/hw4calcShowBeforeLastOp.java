// в Обычный калькулятор без логирования добавьте возможность отменить последнюю операцию
// Отмена последней операции должна быть реализована следующим образом: если
// передан оператор "<" - калькулятор должен вывести результат предпоследней операции.

package homework;

import java.util.Scanner;
import java.util.Stack;

class Calculator {
    public int calculate(char op, int a, int b){
        if (op == '+') {
            return a + b;
        } else if (op == '-'){
            return a - b;
        } else if (op == '/'){
            return a / b;
        } else if (op == '*'){
            return a * b;
        } else {
            return (999999999);
        }
}
}
public class hw4calcShowBeforeLastOp {
    public static void main(String[] args) {
        System.out.println("Нажмите любую клавишу чтобы начать: ");
        Stack<Integer> history = new Stack<>();
        while (true && exit()) {
        System.out.println("Введите первое число: ");
        Scanner userNumber = new Scanner(System.in);
        Integer a = userNumber.nextInt();
        System.out.println("Введите оператор: ");
        Scanner userOper = new Scanner(System.in);
        char op = userOper.next().charAt(0);
        System.out.println("Введите второе число: ");
        Integer b = userNumber.nextInt();
        Calculator calculator = new Calculator();
        if (calculator.calculate(op,a,b) == 999999999){
            if (op != '<' && a !=0 && b != 0){
            System.out.println(("Некорректный оператор: " + op));
            }
            else {
                history.pop();
                System.out.println("Результат предыдущей операции: " + history.peek());
            }
        }
        else {
            history.add(calculator.calculate(op,a,b));
            System.out.println(history);
        }
        System.out.println("если хотите выйти - нажмите q, иначе нажмите чтото другое: ");
    }
    }
    public static boolean exit(){
        Scanner sc = new Scanner(System.in);
        Character exit = sc.next().charAt(0);
        if (exit == 'q'){
            return false;
        }
        else {return true;}
    }
}
