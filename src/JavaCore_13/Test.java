package JavaCore_13;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("Mike");
        User u2 = new User("Kate");
        User u3 = new User("John");

        u1.sendMessage(u2, "Привет!");
        u1.sendMessage(u2, "Как дела?");

        u2.sendMessage(u1, "Привет!");
        u2.sendMessage(u1, "Все хорошо!");
        u2.sendMessage(u1, "Как твои дела?");

        u3.sendMessage(u1, "Привет!");
        u3.sendMessage(u1, "Как отпуск?");
        u3.sendMessage(u1, "Какие планы на Новый год?");

        u1.sendMessage(u3, "Привет!");
        u1.sendMessage(u3, "Отпуск шикарно! На Новый год уезжаем за город!");
        u1.sendMessage(u3, "Как ты?");

        u3.sendMessage(u1, "Все хорошо, с понедельника в отпуск!");

        MessageDatabase.showDialog(u3, u1);
    }
}
