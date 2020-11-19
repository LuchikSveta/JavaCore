package JavaCore_02;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество этажей в доме:");
        int num = s.nextInt();
        if (num < 0) {
            System.out.println("Ошибка ввода");
        } else if (num < 5) {
            System.out.println("Малоэтажный дом");
        } else if (num < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
