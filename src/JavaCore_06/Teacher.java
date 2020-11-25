package JavaCore_06;

import java.util.Random;

public class Teacher {
    private String name, subject;

    public Teacher (String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void setSubject(String subject) { this.subject = subject; }
    String getSubject() { return subject; }
     void evaluate(Student student) {
         Random rand = new Random();
         int n = rand.nextInt(3) + 2;
         String estimation = "оценка";
         switch (n) {
             case 2 -> estimation = "неудовлетворительно";
             case 3 -> estimation = "удовлетворительно";
             case 4 -> estimation = "хорошо";
             case 5 -> estimation = "отлично";
         }
         System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s", name.toUpperCase(), student.getName().toUpperCase(), subject.toUpperCase(), estimation.toUpperCase());
     }

}
