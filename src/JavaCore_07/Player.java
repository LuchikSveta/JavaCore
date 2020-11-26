package JavaCore_07;

import java.util.Random;

public class Player {
    private int stamina;
    private static int countPlayers;

    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;

    Random rand = new Random();

    public Player() {
        if (countPlayers < 6) {
            int n = 90;
            this.stamina = rand.nextInt(MAX_STAMINA - n) + n;
            countPlayers++;
        }
        else {
            info();
        }
    }

    int getStamina() { return stamina; }
    int getCountPlayers() { return countPlayers; }

    void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
        }
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    void info() {
        switch (countPlayers) {
            case 0, 1 -> System.out.printf("Команды неполные. На поле еще есть %d свободных мест. \n", 6 - countPlayers);
            case 2, 3, 4 -> System.out.printf("Команды неполные. На поле еще есть %d свободных места. \n", 6 - countPlayers);
            case 5 -> System.out.printf("Команды неполные. На поле еще есть %d свободное место. \n", 6 - countPlayers);
            case 6 -> System.out.println("На поле нет свободных мест!");
        }
    }
}
