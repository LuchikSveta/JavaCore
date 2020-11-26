package JavaCore_06;

public class Task_02 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2010, 200, 4000);
        plane.setYear(2005);
        plane.setLength(5);
        plane.fillUp(50);
        plane.fillUp(200);
        plane.info();
    }
}
