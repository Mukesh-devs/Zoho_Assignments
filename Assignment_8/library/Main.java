package Assignment_8.library;
public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();

        Student student = new Student("Mukesh", 101, "CS-A");
        system.register(student);

        Book javaBook = new Book("OOP in Java", "Deitel", "123ABC", "Pearson");
        system.database.add(javaBook);

        student.get_book_info(javaBook);
        javaBook.book_request();
        javaBook.reservation_status();

        student.account.calculate_fine(3);
        student.checkAccount();

        Librarian librarian = new Librarian("Priya", 201, "admin123");
        librarian.verify_librarian();
        librarian.search("OOP", system.database.list_of_books);
    }
}
