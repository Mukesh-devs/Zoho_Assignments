package Assignment_6;

public class Main {
    public static void main(String[] args) {
        // Creating a Book1 object
        Book book1 = new Book(123456789);
        book1.setTitle("Java Complete Reference");
        book1.setAuthor("James Gosling");
        book1.setPrice(1200);

        System.out.println(book1.showBook());
        
        // Creating a Book2 object
        Book book2 = new Book(123456789);
        book2.setTitle("Java Complete Reference");
        book2.setAuthor("James Gosling");
        book2.setPrice(1200);
        
        System.out.println(book2.showBook());


        System.out.println("Book count : " + Book.bookCount);
    }
}
