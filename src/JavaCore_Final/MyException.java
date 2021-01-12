package JavaCore_Final;

public class MyException extends Exception {
    private final int id;

    public MyException(int id) { this.id = id; }

    public String toString() {
        switch (this.id) {
            case 1 -> {
                return "Не удается создать корабль! Некорректное количество координат корабля!";
            }
            case 2 -> {
                return "Не удается создать корабль! Некорректная размерность координат корабля!";
            }
            case 3 -> {
                return "Не удается создать корабль! Введите коориднаты от 0 до 9!";
            }
            case 4 -> {
                return "Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (ореол корабля)!";
            }
            case 5 -> {
                return "Клетка(и) занята(ы) другим кораблем!";
            }
            case 6 -> {
                return "Корабль должен быть непрерывным!";
            }
            default -> {
                return "Ошибка!";
            }
        }
    }
}
