// Напишите метод, который принимает на вход строку
// (String) и определяет является ли строка палиндромом (возвращает boolean значение)

package seminars;

public class seminar2task2 {
    public static void main(String[] args) {
        System.out.println(palindrom("mknkm"));
        
    }
    public static Boolean palindrom(String str) {
        StringBuilder stb = new StringBuilder(str);
        if(stb.reverse().toString().equals(str)){
            return true;
        }
        else {return false;}
    }
}
