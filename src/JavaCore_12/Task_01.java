package JavaCore_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("BMW", "Lexus", "Mercedes", "Audi", "Nissan"));
        for (String auto: list) {
            System.out.println("  " + auto);
        }
        System.out.println();
        list.add(list.size() / 2, "Porsche");
        list.remove(0);
        for (String auto: list) {
            System.out.println("  " + auto);
        }
    }
}
