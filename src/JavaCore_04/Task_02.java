package JavaCore_04;

import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        int[] num = new int[n];
        int[] k = {-1, 10001, 0, 0};
        int sum = 0;

        for (int i = 0; i < n; i++) {
            num[i] = rand.nextInt(10001);
        }
        for(int i : num) {
            if (i > k[0]) {
                k[0] = i;
            }
            if (i < k[1]) {
                k[1] = i;
            }
            if (i % 10 == 0) {
                k[2] += 1;
                k[3] += i;
            }
        }
        System.out.println("Наибольший элемент массива: " + k[0]);
        System.out.println("Наименьший элемент массива: " + k[1]);
        System.out.println("Кооличество элементов массива, оканчивающихся на 0: " + k[2]);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + k[3]);
    }
}
