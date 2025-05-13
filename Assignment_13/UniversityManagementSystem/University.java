import University.Course.Course;
import University.Faculty.Faculty;
import University.Students.Student;

public class University {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Frontend", 20, new String[]{"HTML","CSS","JAVASCRIPT"}, new boolean[3]);
        Course course2 = new Course(2, "Backend", 30, new String[]{"JAVA","SPRINGBOOT","HYBERNATE"}, new boolean[3]);
        Faculty faculty1 = new Faculty("Faculty1", 1, course1);
        Faculty faculty2 = new Faculty("Faculty2", 2, course2);

        Student student1 = new Student(1, "Student1", new Course[]{course1, course2});
        Student student2 = new Student(1, "Student2", new Course[]{course1});

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        faculty1.describeFaculty();
        faculty2.describeFaculty();
    }
}
