package JavaCore_08;

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
    void fillUp(int addFuel) { fuel += addFuel; }
    void setYear(int year) {
        this.year = year;
    }
    void setLength(int length) {
        this.length = length;
    }

    public String toString () {
        return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + getFuel();
    }
}
