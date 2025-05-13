package Library.Book;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void issue() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }
    
    public String bookDetails() {
        return bookId + " - " + title + " by " + author + " (" + (isAvailable ? "Available" : "Issued") + ")";
    }
}