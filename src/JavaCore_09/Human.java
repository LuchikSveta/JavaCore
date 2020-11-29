package JavaCore_09;

public class Human {
    private String name;

    public Human (String name) { this.name = name; }
    void setName (String name) { this.name = name; }
    String getName () { return name; }

    void  printInfo() {
        System.out.printf("Этот человек с именем %s \n", getName().toUpperCase());
    }
}
