package JavaCore_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        File file = new File("text");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner s = new Scanner(file);
            String[] line = s.nextLine().split(" ");
            int sum = 0;
            if (line.length != 10) {
                throw new MyException("Некорректный входной файл!");
            }
            for (String num : line) {
                sum += Integer.parseInt(num);
            }
            s.close();
            System.out.printf("Сумма чисел из файла: %d \n", sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
