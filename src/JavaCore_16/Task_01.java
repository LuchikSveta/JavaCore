package JavaCore_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        try {
            File file = new File("text");
            Scanner s = new Scanner(file);

            double sum = 0;
            int k = 0;
            while (s.hasNextLine()) {
                String[] line = s.nextLine().split(" ");
                for (String n : line) {
                    sum += Integer.parseInt(n);
                    k += 1;
                }
            }
            System.out.printf("Среднее арифметическое: " + sum / k + " ---> %.3f\n", sum / k);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
