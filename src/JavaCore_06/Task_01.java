package JavaCore_06;

public class Task_01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1990);
        car1.setColor("Black");
        car1.setModel("BMW");
        if (car1.getYear() != 0) {
            car1.info();
            System.out.println("Год выпуска: " + car1.getYear());
            System.out.println("Цвет: " + car1.getColor());
            System.out.println("Модель: " + car1.getModel());
            System.out.println(car1.yearDifference(2015));
        }

        Motorbike bike = new Motorbike(2020, "White", "Lexus");
        if (bike.getYear() != 0) {
            bike.info();
            System.out.println("Год выпуска: " + bike.getYear());
            System.out.println("Цвет: " + bike.getColor());
            System.out.println("Модель: " + bike.getModel());
            System.out.println(bike.yearDifference(2005));
        }
    }
}
