package JavaCore_03;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите город:");
        String city = s.nextLine();
        while (!city.equals("Stop")) {
            switch (city) {
                case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
                case "Берлин", "Мюнхен", "Кёльн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
            city = s.nextLine();
        }
    }
}
