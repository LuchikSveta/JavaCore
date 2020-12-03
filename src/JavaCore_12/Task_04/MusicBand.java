package JavaCore_12.Task_04;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private List<String> participants;

    public MusicBand(String name, int year, List<String> participants) {
        this.name = name;
        this.year = year;
        this.participants = participants;
    }

    String getName() { return name; }
    int getYear() { return year; }
    List<String> getParticipants() { return participants; }

    void addParticipants(String participant) {
        this.getParticipants().add(participant);
    }

    void deleteParticipants(String participant) {
        this.getParticipants().removeIf(person -> person.equals(participant));
    }

    void transferMembers(MusicBand band1, MusicBand band2) {
        for (String participant : band1.getParticipants()) {
            band2.addParticipants(participant);
        }
        while (band1.getParticipants().size() > 0) {
            band1.deleteParticipants(band1.getParticipants().get(0));
        }
    }

    void printMembers() {
        System.out.printf("Список участников группы %s:\n", this.getName());
        for (String participant : this.getParticipants()) {
            System.out.println("    " + participant);
        }
    }
}
