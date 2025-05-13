package University.Faculty;

import University.Course.Course;

public class Faculty {
    String name;
    int id;
    Course courseHandling;
    public Faculty(String name, int id, Course courseHandling) {
        this.name = name;
        this.id = id;
        this.courseHandling = courseHandling;
    }

    public void describeFaculty(){
        System.out.println("The Faculty name is: "+name);
        System.out.println("The Faculty id is: "+id);
        System.out.println("The course details this faculty handling is: ");
        courseHandling.describeCourse();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
