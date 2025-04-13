package Assignment_8.library;

public class Staff extends User {
    String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }
}
