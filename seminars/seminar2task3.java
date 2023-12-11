// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод
// который запишет эту строку в простой текстовый файл, обработайте исключения

package seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class seminar2task3 {
    public static void main(String[] args) {
        String test = "TEST";
        writer(repeat(test));
        
    }
    public static String repeat(String str){
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stb.append(str);
        }
        return stb.toString();
    }
    public static void writer(String str) {
        File test100 = new File("test100.txt");
        try {
            FileWriter fw = new FileWriter(test100);
            fw.write(str);
            fw.flush();
        } catch (IOException e) {
            // if(test100.length() == 0){System.out.println("ERROR writing. File is made uncorrected");
            e.printStackTrace();}
        }
        
    }