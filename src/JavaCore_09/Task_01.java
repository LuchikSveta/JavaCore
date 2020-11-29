package JavaCore_09;

public class Task_01 {
    public static void main(String[] args) {
        Student student = new Student("Alex", "RK6-74");
        Teacher teacher = new Teacher("Frau Kiseleva", "IT");

        System.out.println(student.getGroup());
        System.out.println(teacher.getLesson());
        student.printInfo();
        teacher.printInfo();
    }
}
