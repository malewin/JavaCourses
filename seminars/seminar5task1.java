package seminars;

import java.util.HashMap;
import java.util.Map;

public class seminar5task1 {
    // 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Александр Леонидов Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class Task1 {
public static void main(String[] args) {
System.out.println(isIso("pod","bob"));
}
public static boolean isIso(String str1, String str2){
Map<Character,Character> map = new HashMap<>();
if (str1.length()!=str2.length())
return false;
else{
for (int i = 0; i < str1.length(); i++) {
if (map.containsKey(str1.charAt(i))){
if (map.get(str1.charAt(i))!=str2.charAt(i))
return false;
}
else{
if (map.containsValue(str2.charAt(i))&&!map.containsKey(str1.charAt(i)))
return false;
map.put(str1.charAt(i),str2.charAt(i));
}
}
}
return true;
// b:p
// o:o
// d:p
}

}

}
