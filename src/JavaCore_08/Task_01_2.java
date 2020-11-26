package JavaCore_08;

public class Task_01_2 {
    public static void main(String[] args) {
        String s1 = "";

        long start = System.currentTimeMillis();

        for(int i = 0; i < 2001; i++) {
            s1 += i + " ";
        }
        System.out.println(s1);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(timeConsumedMillis);
    }
}
