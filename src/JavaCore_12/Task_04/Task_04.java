package JavaCore_12.Task_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task_04 {
    public static void main(String[] args) {
        List<String> participants1 = new ArrayList<>(Arrays.asList("Дэн Рейнольдс", "Уэйн Сермон", "Бен МакКи", "Дэниэл Плацман"));
        List<String> participants2 = new ArrayList<>(Arrays.asList("Алекс Тёрнер", "Джейми Кук", "Мэтт Хелдерс", "Ник О’Мэлли"));

        MusicBand band1 = new MusicBand("Imagine Dragons", 2008, participants1);
        MusicBand band2 = new MusicBand("Arctic Monkeys", 2002, participants2);

        band1.printMembers();
        band2.printMembers();
        band1.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
