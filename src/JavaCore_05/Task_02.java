package JavaCore_05;

public class Task_02 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2020, "White", "Lexus");
        if (bike.getYear() != 0) {
            System.out.println("Год выпуска: " + bike.getYear());
            System.out.println("Цвет: " + bike.getColor());
            System.out.println("Модель: " + bike.getModel());
        }
    }
}
