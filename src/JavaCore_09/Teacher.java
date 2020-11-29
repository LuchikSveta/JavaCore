package JavaCore_09;

public class Teacher extends Human {
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;
    }

    void setLesson(String lesson) { this.lesson = lesson; }
    String getLesson() { return lesson; }

    void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s \n", getName().toUpperCase());
    }
}
