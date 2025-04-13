package Assignment_8.library;

public class Student extends User {
    String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }
}
