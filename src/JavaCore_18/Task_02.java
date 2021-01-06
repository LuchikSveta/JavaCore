package JavaCore_18;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    private static int count7(int n) {
        int k = 0;
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            k = 1;
        }
        return k + count7(n / 10);
    }
}
