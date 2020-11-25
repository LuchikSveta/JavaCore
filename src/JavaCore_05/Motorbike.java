package JavaCore_05;

public class Motorbike {
    private int year;
    private String color, model;

    public Motorbike() {
        this.year = 2010;
        this.color = "Black";
        this.model = "BMW";
    }

    public Motorbike(int year, String color, String model) {
        if ((year < 0) || (String.valueOf(Math.abs(year)).length() != 4)) {
            System.out.println("Неверное значение года выпуска!");
        } else {
            this.year = year;
        }
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
