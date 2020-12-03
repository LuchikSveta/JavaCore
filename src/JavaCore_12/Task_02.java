package JavaCore_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 31; i += 2) {
            list.add(i);
        }
        for(int i = 300; i < 351; i += 2) {
            list.add(i);
        }
        for (Integer auto: list) {
            System.out.print(auto + " ");
        }
    }
}
