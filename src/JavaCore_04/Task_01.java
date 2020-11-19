package JavaCore_04;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размер массива: ");
        int n = s.nextInt();
        int[] num = new int[n];
        int[] k = new int[4];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            num[i] = rand.nextInt(11);
            if (num[i] > 8) {
                k[0] += 1;
            }
            if (num[i] == 1) {
                k[1] += 1;
            }
            if (num[i] % 2 == 0) {
                k[2] += 1;
            }
            if (num[i] % 2 != 0) {
                k[3] += 1;
            }
            sum += num[i];
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(num));
        System.out.println("Длина массива: " + num.length);
        System.out.println("Количество чисел больше 8: " + k[0]);
        System.out.println("Количество чисел равных 1: " + k[1]);
        System.out.println("Количество четных чисел: " + k[2]);
        System.out.println("Количество нечетных чисел: " + k[3]);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
