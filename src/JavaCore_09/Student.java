package JavaCore_09;

public class Student extends Human{
    private String group;

    public Student (String name, String group) {
        super(name);
        this.group = group;
    }

    void setGroup (String group) { this.group = group; }
    String getGroup () { return group; }

    void  printInfo() {
        super.printInfo();
        System.out.printf("Этот студент с именем %s \n", getName().toUpperCase());
    }
}
