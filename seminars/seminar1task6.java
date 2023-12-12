package seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class seminar1task6 {
    public static void main(String[] args) {
        File file = new File("task6.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            String data = "Name Surname Age\n Kate Smith 20\n Paul Green 25\n Mike Black 23";
            fileWriter.write(data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
