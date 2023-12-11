package homework;

import java.util.Scanner;

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


public class hw1calculator {
    public static void main(String[] args) {
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
            System.out.println(("Некорректный оператор: " + op));
        }
        else {
        System.out.println(calculator.calculate(op,a,b));}

    }
}    

