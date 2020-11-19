package JavaCore_04;

import java.util.Random;

public class Task_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 12, n = 8;
        int  sum, maxSum = 0, iRes = 0;
        int[][] num = new int[m][n];

        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                num[i][j] = rand.nextInt(51);
                sum += num[i][j];
            }
            if (sum > maxSum) {
                iRes = i;
                maxSum = sum;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + iRes);
    }
}
