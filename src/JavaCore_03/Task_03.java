package JavaCore_03;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x, y;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите делимое и делитель:");
            x = s.nextDouble();
            y = s.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);
        }
    }
}
