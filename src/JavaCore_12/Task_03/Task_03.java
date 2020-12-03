package JavaCore_12.Task_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_03 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("Imagine Dragons", 2008),
                new MusicBand("Queen", 1970),
                new MusicBand("Linkin Park", 1996),
                new MusicBand("Rammstein", 1994),
                new MusicBand("The Rolling Stones", 1962),
                new MusicBand("30 Seconds to Mars", 1998),
                new MusicBand("Little Big", 2013),
                new MusicBand("The Beatles", 1960),
                new MusicBand("AC/DC", 1973),
                new MusicBand("Pentatonix", 2011),
                new MusicBand("Arctic Monkeys", 2002),
                new MusicBand("Red Hot Chili Peppers", 1983),
                new MusicBand("Intelligency", 2013),
                new MusicBand("IOWA", 2007)));
        Collections.shuffle(bands);
        System.out.println("Все музыкальные группы:");
        for (MusicBand band : bands) {
            System.out.println("    " + band.getName());
        }
        System.out.println("Группы, основанные после 2000 года:");
        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);
        for (MusicBand band : bandsAfter2000) {
            System.out.println("    " + band.getName());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if(band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
