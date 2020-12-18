package JavaCore_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_02 {
    public static void main (String[] args) {
        if (parseFileToStringList() != null) {
            System.out.println(parseFileToStringList());
        }
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people");
        List<String> people = new ArrayList<>();
        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String person = s.nextLine();
                if (Integer.parseInt(person.split(" ")[1]) < 0) {
                    throw new MyException("Некорректный входной файл!");
                }
                people.add(person);
            }
            s.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
