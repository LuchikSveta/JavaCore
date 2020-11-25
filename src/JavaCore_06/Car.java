package JavaCore_06;

public class Car {
    private int year;
    private String color, model;

    public void setYear(int yearIn) {
        if ((yearIn < 0) || (String.valueOf(Math.abs(yearIn)).length() != 4)) {
            System.out.println("Неверное значение года выпуска!");
        } else {
            year = yearIn;
        }
    }
    int getYear() {
        return year;
    }
    void setColor(String colorIn) {
        color = colorIn;
    }
    String getColor() {
        return color;
    }
    void setModel(String modelIn) {
        model = modelIn;
    }
    String getModel() {
        return model;
    }

    void info() { System.out.println("Это автомобиль"); }

    int yearDifference(int yearIn) { return Math.abs(year - yearIn); }
}
