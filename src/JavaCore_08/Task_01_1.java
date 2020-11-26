package JavaCore_08;

public class Task_01_1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();

        long start = System.currentTimeMillis();

        for(int i = 0; i < 2001; i++) {
            s1.append(i).append(" ");
        }
        System.out.println(s1);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        System.out.println(timeConsumedMillis);
    }
}
