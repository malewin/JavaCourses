package homework.domainsProj;


import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;


public class Domains {
    String name;
    Double mintPrice;
    Integer charAmount;
    boolean favourite=false;
    LocalDate producedDate;

    @Override
    public String toString(){
        return "{" + "Domain: " + name + ";" +
                    " mintPrice: " + mintPrice + ";" +
                    " amount of chars: " + charAmount + ";" +
                    " favourite: " + favourite + ";" +
                    " ProducedDate: " + producedDate + "}" + "\n";
    }

    public static Integer counter(String name){
        return name.length();
    }
    
    public static boolean addToFav() {
        boolean flag = false;
        while (flag == false) {
            System.out.println("Введите число 1, если хотите добавить в избранное, и 0 если пропустить: ");
            Scanner sc = new Scanner(System.in);
            int numberChoice = sc.nextInt();
            if (numberChoice == 1) {
                flag = true;
                break;
            } else {
                break;
            }
        }
        return flag;
    }

    public static LocalDate getAge(Integer month, Integer year){
        int day = 1;
        LocalDate producedDate = LocalDate.of(year, month, day);
        return producedDate;
    }

    public static String getName(Object object){
        StringBuilder domainZone = new StringBuilder(object + ".ton");
        String mix = domainZone.toString();
        return mix;

    }

    public  boolean contains(Map<String, Object> reference) {
        for (Map.Entry<String, Object> entry : reference.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            switch (key) {
                case "mintPrice":
                    if(mintPrice != (double) value){
                        return false;
                    }
                    break;
                case "charAmount":
                    if (charAmount != (int) value) {
                        return false;
                    }
                    break;
                case "Date":
                    if (!producedDate.equals((LocalDate) value)) {
                        return false;
                    }
                    break;
                case "name":
                    if (!name.equals((String) value)) {
                        return false;
                    }
                    break;
                case "favourite":
                    if (favourite != ((Boolean) value)){
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return true;
    }
}