package homework.domainsProj;

import java.security.Key;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.swing.RowFilter.Entry;

public class hw6domainsMain {
    public static void main(String[] args) {
        Stack <Object> autoFeel = new Stack<>();
        System.out.println("Введите сколько будет доменов к добавлению: ");
        Scanner cicleAmount = new Scanner(System.in);
        int cicles = cicleAmount.nextInt();
        for (int index = 0; index < cicles; index++) {
            System.out.println("Домен №" + (index +1));
            System.out.println("Введите имя домена: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
        
            System.out.println("Введите цену минта: ");
            Double price = sc.nextDouble();

            System.out.println("Дата минта месяц: ");
            int month = sc.nextInt();

            System.out.println("Дата минта, год: ");
            int year = sc.nextInt();

            autoFeel.add(name);
            autoFeel.add(price);
            autoFeel.add(year);
            autoFeel.add(month);
        }
        System.out.println(autoFeel);
        // autoFeel.reversed();
        

        Set<Domains> domains = new HashSet<>();
        
        Domains domain3 = new Domains();
        Integer month3 = (Integer) autoFeel.removeLast();
        Integer year3 = (Integer) autoFeel.removeLast();
        domain3.producedDate =Domains.getAge(month3,year3);
        System.out.println();
        Double price3 = (double) autoFeel.removeLast();
        domain3.mintPrice = price3;
        String name3 = (String) autoFeel.removeLast();
        domain3.charAmount = Domains.counter(name3);
        domain3.name = Domains.getName(name3);

        domains.add(domain3);
        System.out.println(domains);

        Domains domain2 = new Domains();
        domain2.producedDate =Domains.getAge((Integer) autoFeel.pop(),(Integer) autoFeel.pop());
        domain2.mintPrice = (double) autoFeel.pop();
        domain2.charAmount = Domains.counter((String) autoFeel.peek());
        domain2.name = Domains.getName(autoFeel.pop());
        domain2.favourite = Domains.addToFav();

        domains.add(domain2);
        System.out.println(domains);

        Domains domain1 = new Domains();
        domain1.producedDate =Domains.getAge((Integer) autoFeel.pop(),(Integer) autoFeel.pop());
        domain1.mintPrice = (double) autoFeel.pop();
        domain1.charAmount = Domains.counter((String) autoFeel.peek());
        domain1.name = Domains.getName(autoFeel.pop());
        
        domains.add(domain1);
        System.out.println(domains);
        filterOf(domains);

    }

    private static void filterOf(Set<Domains> domains){
        Map<String, Object> fltrBuffer = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean search = true;

        while (search) {
            System.out.println("Поиск домена по критерию: ");
            System.out.println("1 - Название\n2 - Цена минта\n3 - Количество символов\n4 - Фаворит\n5 - Дата создания\n6 - Подсчёт всех вложенных средств на домены(доп.опция)\n7 - Поиск");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Введите название (допишите .ton): ");
                    String domainFilter = scanner.next();
                    fltrBuffer.put("name", domainFilter);
                    break;
                case 2:
                    System.out.println("Введите цену минта: ");
                    double mintPriceFilter = scanner.nextDouble();
                    fltrBuffer.put("mintPrice", mintPriceFilter);
                    break;
                case 3:
                    System.out.println("Введите количество символов: ");
                    int charAmountFilter = scanner.nextInt();
                    fltrBuffer.put("charAmount", charAmountFilter);
                    break;
                case 4:
                    System.out.println("Это фаворит? (true/false): ");
                    boolean favouriteFilter = scanner.nextBoolean();
                    fltrBuffer.put("favourite", favouriteFilter);
                    break;
                case 5:
                    System.out.println("Дата создания: ");
                    Scanner scan = new Scanner(System.in);
                    LocalDate dateFilter = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.mm.dd");
                    System.out.println(dateFilter.format(dtf));
                    scan.close();
                    fltrBuffer.put("ProducedDate", dateFilter);
                    break;
                case 6: 
                    System.out.println("Сумма инвестиций: " + investedINFO(domains));
                    search = false;
                    break;
                    
                case 7:
                    printFiltered(domains, fltrBuffer);
                    search = false;
                    break;

                default:
                    System.out.println("Такого пункта нет в меню");
                    return;
            }

        }
    }

    static void printFiltered(Set<Domains> domains, Map<String, Object> filterBuf){
        for (Domains domain: domains) {
            boolean matchesFilter = domain.contains(filterBuf);

            if (matchesFilter) System.out.println(domain);
        }
    }

    public static Double investedINFO(Set<Domains> domains) {
        Double result = (double) 0;
        for (Domains domain : domains) {
            if (domain.mintPrice > 0){
                result += domain.mintPrice;
            }   
            }
        return result;
    }

}
