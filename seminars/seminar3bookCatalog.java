 // каталог товаров книжного магазина сохранён в виде двумерного списка List<ListArray<String>> так,
 // что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг
 // Напишите метод для заполнения данной структуры


package seminars;

import java.util.ArrayList;
import java.util.List;

public class seminar3bookCatalog {
    static List<ArrayList<String>> shopBook = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> povest = new ArrayList<>();
        povest.add(0, "Повесть: ");
        povest.add("Временных лет");
        povest.add("Полесские робинзоны");

        ArrayList<String> roman = new ArrayList<>();
        roman.add(0, "Роман: ");
        roman.add("Атлант");
        roman.add("Шантарам");

        addBooks(povest);
        addBooks(roman);

        System.out.println(shopBook);
    }
    static void addBooks(ArrayList<String> books){
        shopBook.add(books);

    }
}
