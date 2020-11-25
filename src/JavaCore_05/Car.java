package JavaCore_05;

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
    public int getYear() {
        return year;
    }
    public void setColor(String colorIn) {
        color = colorIn;
    }
    public String getColor() {
        return color;
    }
    public void setModel(String modelIn) {
        model = modelIn;
    }
    public String getModel() {
        return model;
    }
}
