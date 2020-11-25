package JavaCore_06;

public class Task_03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Федорова Е.В.", "Математика");
        Student student = new Student("Миронова С.С.");

        teacher.evaluate(student);
    }
}
