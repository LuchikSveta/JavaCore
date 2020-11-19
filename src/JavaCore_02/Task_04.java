package JavaCore_02;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число x:");
        double x = s.nextDouble();
        double y;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3) {
            y = (x * x - 2) * (x + 3);
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
