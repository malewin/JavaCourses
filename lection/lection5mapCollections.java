package lection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class lection5mapCollections {
 
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<Integer, String>();
        db.putIfAbsent(1,"один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // если попросить вывести несуществующий в мэпе ключ выдаст null-ссылку
        db.remove(null); // в то же время можно положить ссылку нулевую чтоб заполнить индекс ключа а потом удалить
        System.out.println(db); 
        System.out.println(db.containsValue("один")); //true
        System.out.println(db.containsKey(1)); //true
        System.out.println(db.containsValue((1))); //false
        System.out.println(db.containsKey("один")); //false
        System.out.println(db.keySet()); // отображает множество ключей
        System.out.println(db.values()); // отображает множество значений

        Map<Integer, String> test = new HashMap<Integer, String>();
        test.put(1,"всё");
        System.out.println(test);
        test.put(2, "нормально");
        System.out.println(test);
        test.put(3, "записывается");
        System.out.println(test);
        test.putIfAbsent(4, "константа?");
        System.out.println(test);

        Map<Integer, ArrayList> tests = new HashMap<>();
        ArrayList<String> values = new ArrayList<>();
        values.add("всё");
        values.add("нормально");
        values.add("записывается");
        values.add("если");
        values.add("понять");
        tests.put(1,values);
        System.out.println(tests);

        for (var item : test.entrySet()) {
            System.out.printf("[$d: %s]\n", item.getKey(), item.getValue());
        }

        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один"); System.out.println(tMap); // treeMap добавляет ключи в правильном порядке даже если добавлены в разбросаной хронологии
        tMap.put(6, "шесть"); System.out.println(tMap); 
        tMap.put(4, "четыре"); System.out.println(tMap); 
        tMap.put(3, "три"); System.out.println(tMap); 
        tMap.put(2, "два"); System.out.println(tMap); 
        System.out.println(tMap.get(3)); // показать зачение по конкретному ключу
        System.out.println(tMap.remove(4)); // убрать связку ключ/значение по ключу (показывает значение в консоль напоследок)
        System.out.println(tMap.descendingKeySet()); // показать все ключи
        System.out.println(tMap.descendingMap()); // показать связки ключ/значение
        System.out.println(tMap.tailMap(2)); // показать связки ключ/значение от определного ключа до конца
        System.out.println(tMap.headMap(3)); // показать все связки ключ/значение от начала до ключа по ключу не включая его
        System.out.println(tMap.lastEntry()); // показывает последнюю связку
        System.out.println(tMap.firstEntry()); // показывает первую связку

        // LinkedHashMap (акцент на порядок элементов, упущение в скорости относительно HashMap)

        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}

        // HashTable (устаревший брат HashMap, нет ссылки на null)


    } 
    
}
