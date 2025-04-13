package Assignment_8.student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating object using child constructor:");
        ZsgsStudent student1 = new ZsgsStudent("Mukesh", 21, "ZSGS001");

        System.out.println("\nCreating child object using parent reference:");
        Student student2 = new ZsgsStudent("Ravi", 22, "ZSGS002"); // Polymorphism
        System.out.println(student2.toString());
    }
}
