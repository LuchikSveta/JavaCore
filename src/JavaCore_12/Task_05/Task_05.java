package JavaCore_12.Task_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Imagine Dragons", 2008,
                new ArrayList<>(Arrays.asList(new MusicArtist("Дэн Рейнольдс", 30),
                        new MusicArtist("Уэйн Сермон", 36),
                        new MusicArtist("Бен МакКи", 35),
                        new MusicArtist("Дэниэл Плацман", 34))));
        MusicBand band2 = new MusicBand("Arctic Monkeys", 2002,
                new ArrayList<>(Arrays.asList(new MusicArtist("Алекс Тёрнер", 34),
                        new MusicArtist("Джейми Кук", 35),
                        new MusicArtist("Мэтт Хелдерс", 34),
                        new MusicArtist("Ник О’Мэлли", 35))));

        band1.printMembers();
        band2.printMembers();
        band1.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
