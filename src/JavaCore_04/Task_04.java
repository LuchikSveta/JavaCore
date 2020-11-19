package JavaCore_04;

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        int[] num = new int[n];
        int sum = 0, ind = 0, s;

        for (int i = 0; i < n; i++) {
            num[i] = rand.nextInt(10001);
        }
        for (int i = 0; i < n - 2; i++) {
            s = num[i] + num[i + 1] + num[i + 2];
            if (s > sum) {
                sum = s;
                ind = i;
            }
        }
        System.out.println("Максимальная сумма тройки: " + sum);
        System.out.println("Индекс первого элемента тройки: " + ind);
    }
}
