package JavaCore_07;

public class Task_01 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus", 2010, 200, 15000);
        Airplane plane2 = new Airplane("Boeing", 2015, 150, 10000);
        Airplane.compareAirplanes(plane1, plane2);
    }
}
