package JavaCore_05;

public class Task_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(199);
        car1.setColor("Black");
        car1.setModel("BMW");
        if (car1.getYear() != 0) {
            System.out.println("Год выпуска: " + car1.getYear());
            System.out.println("Цвет: " + car1.getColor());
            System.out.println("Модель: " + car1.getModel());
        }
    }
}
