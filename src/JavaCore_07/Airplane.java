package JavaCore_07;

public class Airplane {
    private String producer;
    private int year, length, weight, fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    int getFuel() { return fuel; }
    int getLength() { return length; }

    void info() { System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d", producer, year, length, weight, getFuel()); }
    void fillUp(int addFuel) { fuel += addFuel; }
    void setYear(int year) {
        this.year = year;
    }
    void setLength(int length) {
        this.length = length;
    }

    static void compareAirplanes(Airplane plane1, Airplane plane2) {
        if (plane1.getLength() > plane2.getLength()) {
            System.out.println("Первый самолет длиннее второго");
        }
        else {
            System.out.println("Второй самолет длиннее первого");
        }
    }
}
