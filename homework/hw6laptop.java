package homework;

import java.util.*;

public class hw6laptop {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops();
        laptop1.model = "Lenovo";
        laptop1.color = "blue";
        laptop1.os = "Windows7";
        laptop1.ram = 2;
        laptop1.ssd = 128;
        laptop1.price = 40000;
        laptop1.category = "ForWorking";

        Laptops laptop2 = new Laptops();
        laptop2.model = "HP";
        laptop2.color = "gray";
        laptop2.os = "Windows10";
        laptop2.ram = 4;
        laptop2.ssd = 512;
        laptop2.price = 70000;
        laptop2.category = "MediaCreating";

        Laptops laptop3 = new Laptops();
        laptop3.model = "MacBook";
        laptop3.color = "white";
        laptop3.os = "MacOS";
        laptop3.ram = 8;
        laptop3.ssd = 1024;
        laptop3.price = 240000;
        laptop3.category = "Professional";

        Laptops laptop4 = new Laptops();
        laptop4.model = "ASUS";
        laptop4.color = "white";
        laptop4.os = "Windows10";
        laptop4.ram = 16;
        laptop4.ssd = 4096;
        laptop4.price = 450000;
        laptop4.category = "Gaming";

        Laptops laptop5 = new Laptops();
        laptop5.model = "Xiaomi";
        laptop5.color = "gray";
        laptop5.os = "Android";
        laptop5.ram = 8;
        laptop5.ssd = 2048;
        laptop5.price = 220000;
        laptop5.category = "MediaCreating";



        Set<Laptops> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);


        System.out.println(laptops);
        createFilter(laptops);
    }

    private static void createFilter(Set<Laptops> laptops){
        Map<String, Object> reference = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean search = true;

        while (search) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Категория\n6 - Цена\n7 - Поиск");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Введите объём RAM: ");
                    int ramFilter = scanner.nextInt();
                    reference.put("ram", ramFilter);
                    break;
                case 2:
                    System.out.println("Введите объём SSD: ");
                    int ssdFilter = scanner.nextInt();
                    reference.put("ssd", ssdFilter);
                    break;
                case 3:
                    System.out.println("Введите ОС: ");
                    String osFilter = scanner.next();
                    reference.put("os", osFilter);
                    break;
                case 4:
                    System.out.println("Введите цвет: ");
                    String colorFilter = scanner.next();
                    reference.put("color", colorFilter);
                    break;
                case 5:
                    System.out.println("Введите категорию: ");
                    String categoryFilter = scanner.next();
                    reference.put("category", categoryFilter);
                    break;
                case 6:
                    System.out.println("Введите цену: ");
                    int priceFilter = scanner.nextInt();
                    reference.put("price", priceFilter); 
                    break; 
                case 7:
                    printFiltered(laptops, reference);
                    search = false;
                    break;

                default:
                    System.out.println("Что-то не то ввели!");
                    return;
            }

        }
    }

    static void printFiltered(Set<Laptops> laptops, Map<String, Object> reference){
        for (Laptops laptop: laptops) {
            boolean matchesFilter = laptop.contains(reference);

            if (matchesFilter) System.out.println(laptop);
        }
    }

}