//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.

package seminars;

import java.util.ArrayList;
import java.util.List;

public class seminar3sprtIntfrmArrLst {
    public static void main(String[] args) {
        List vinegret = new ArrayList<String>();
        vinegret.add("potato");
        vinegret.add(1);
        vinegret.add("beet");
        vinegret.add(7);
        vinegret.add("egg");
        vinegret.add("onion");
        vinegret.add(3);
        vinegret.add("sause");
        System.out.println(vinegret);

        for (int i = 0; i < vinegret.size(); i++) {
            if (vinegret.get(i) instanceof Integer){
                vinegret.remove(vinegret.get(i));
            }
        }
        System.out.println(vinegret);
    } 
}

