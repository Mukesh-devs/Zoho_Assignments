package University.Course;

public class Course {
    int courseId;
    String courseName;
    int courseDurationInDays;
    String[] topics;
    boolean [] completed;
    public Course(int courseId, String courseName, int courseDurationInDays, String[] topics, boolean[] completed) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDurationInDays = courseDurationInDays;
        this.topics = topics;
        this.completed = completed;
    }

    public void describeCourse(){
        System.out.println("The Course id is: "+courseId);
        System.out.println("The Course Name is: "+courseName);
        System.out.println("The Course Duration is: "+courseDurationInDays+" days");
        System.out.println("The topics covered in this Course are: ");
        for(int i=0; i<topics.length;i++){
            System.out.println(topics[i]+" "+ (completed[i] ? " Completed":"Not Yet Completed"));
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
