package Assignment_8.library;

public class Book {
    String title;
    String author;
    String ISBN;
    String publication;
    boolean reserved;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
        this.reserved = false;
    }

    public void show_duedt() {
        System.out.println("Due Date: 20-Apr-2025");
    }

    public void reservation_status() {
        System.out.println(reserved ? "Reserved" : "Available");
    }

    public void feedback(String feedback) {
        System.out.println("Feedback received: " + feedback);
    }

    public void book_request() {
        if (!reserved) {
            reserved = true;
            System.out.println("Book has been reserved.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void renew_info() {
        System.out.println("Renewed. New due date: 30-Apr-2025");
    }
}
