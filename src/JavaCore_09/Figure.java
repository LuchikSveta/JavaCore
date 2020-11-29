package JavaCore_09;

public abstract class Figure {
    private String color;

    public Figure(String color) { this.color = color; }
    void setColor(String color) { this.color = color; }
    String getColor() { return color; }

    public abstract double area();
    public abstract double perimeter();
}
