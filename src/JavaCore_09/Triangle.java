package JavaCore_09;

public class Triangle extends Figure {
    private int a1, a2, a3;

    public Triangle(int a1, int a2, int a3, String color) {
        super(color);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() * (perimeter() - a1) * (perimeter() - a2) * (perimeter() - a3));
    }

    @Override
    public double perimeter() {
        return a1 + a2 + a3;
    }
}
