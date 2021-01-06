package JavaCore_18;

public class Task_01 {
    public static void main(String[] args) {
        int[] num = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(num, num.length - 1));
    }

    private static int recursionSum(int[] n, int k) {
        if (k < 0) {
            return 0;
        }
        return n[k] + recursionSum(n, k-1);
    }
}
