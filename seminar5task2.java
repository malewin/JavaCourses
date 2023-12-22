import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class seminar5task2 {
static Map<Character,Character> openCloseBracket = Map.of('{','}','(',')','[',']','<','>');

public static void feelMap(String[] args) {

}

public static void main(String[] args) {
String s1= "a+(d*3)";
String s2 = "[a+(1*3)";
System.out.println(valid(s1));
System.out.println(valid(s2));
}


public static boolean valid(String message) {
Deque<Character> openBrackets = new ArrayDeque<>(); // ([]
for (Character sym: message.toCharArray())
if (openCloseBracket.containsKey(sym))
openBrackets.add(sym); // +( +[
else if (openCloseBracket.containsValue(sym)){
if (openBrackets.isEmpty())
return false;
char top = openBrackets.removeLast(); // top=[
if (openCloseBracket.get(top)!=sym)
return false;
}

return openBrackets.isEmpty();
}
}

