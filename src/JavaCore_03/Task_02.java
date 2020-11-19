package JavaCore_03;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите делимое и делитель:");
        double x = s.nextDouble(), y = s.nextDouble();
        while (y != 0) {
            System.out.println(x / y);
            System.out.println("Введите делимое и делитель:");
            x = s.nextDouble();
            y = s.nextDouble();
        }
    }
}
