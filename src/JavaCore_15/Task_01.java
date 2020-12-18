package JavaCore_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        try {
            File file = new File("shoes.csv");
            Scanner s = new Scanner(file);
            PrintWriter pw = new PrintWriter("missing_shoes.txt");

            while (s.hasNextLine()) {
                String[] line = s.nextLine().split(";");
                if (Integer.parseInt(line[2]) == 0) {
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }
            }
            pw.close();
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
