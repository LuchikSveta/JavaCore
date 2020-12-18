package JavaCore_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            File file1 = new File("file1.txt");
            PrintWriter pw1 = new PrintWriter(file1);
            File file2 = new File("file2.txt");
            PrintWriter pw2 = new PrintWriter(file2);

            Scanner s1 = new Scanner(file1);
            Scanner s2 = new Scanner(file2);

            for (int i = 0; i < 1000; i++) {
                pw1.println(rand.nextInt(101));
            }
            pw1.close();

            for (int i = 0; i < 50; i++) {
                int k = 20, sum = 0;
                while (k > 0) {
                    sum += Integer.parseInt(s1.nextLine());
                    k--;
                }
                pw2.println(sum / 20.0);
            }
            pw2.close();
            s1.close();
            s2.close();
            printResult(file2);
        } catch (IOException e) {
            System.out.println("Ошибка при создании файлов!");
        }
    }

    public static void printResult(File file) {
        try {
            Scanner s = new Scanner(file);
            double sum = 0;

            while (s.hasNextLine()) {
                sum += Double.parseDouble(s.nextLine());
            }
            System.out.printf("Сумма средних: %d", (long)sum);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
