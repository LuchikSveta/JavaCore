package JavaCore_02;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа a и b:");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
