import java.util.HashMap;

public class seminar5task0 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
        // System.out.println(map);
        for (Integer key : map.keySet())
            if (map.get(key).equals("Иванов"))
                System.out.println(key + ", " + map.get(key));
        // System.out.println(map.values());
    }
}