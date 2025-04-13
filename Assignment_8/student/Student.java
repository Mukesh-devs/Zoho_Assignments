package Assignment_8.student;

public class Student {
    private String student_name;
    private int age;

    Student( String stu_name, int age) {
        this.student_name = stu_name;
        this.age = age;
    }

    public String getStudentname() {
        return student_name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Student name : " + getStudentname() +
        "\nAge : " + getAge() ;
    }
}
