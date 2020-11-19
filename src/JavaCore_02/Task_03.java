package JavaCore_02;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа a и b:");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        int i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
