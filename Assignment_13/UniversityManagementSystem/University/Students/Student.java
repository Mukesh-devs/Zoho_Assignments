package University.Students;

import University.Course.Course;

public class Student{
    int studentId;
    String studentName;
    public Course[] coursesEnrolled;
    public Student(int studentId, String studentName, Course[] coursesEnrolled) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.coursesEnrolled = coursesEnrolled;
    }
    public void displayEnrolledCourses(){
        System.out.println("The Enrolled Courses Are: ");
        for(int i=0; i<coursesEnrolled.length; i++) coursesEnrolled[i].describeCourse();
    }
    public void displayStudentDetails(){
        System.out.println("Name: "+this.studentName);
        System.out.println("Student ID: "+this.studentId);
        displayEnrolledCourses();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
    }
}