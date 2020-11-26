package JavaCore_07;

public class Task_01 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Аэрофлот", 2010, 200, 50);
        Airplane plane2 = new Airplane("S7", 2015, 210, 50);
        Airplane.compareAirplanes(plane1, plane2);
    }
}
