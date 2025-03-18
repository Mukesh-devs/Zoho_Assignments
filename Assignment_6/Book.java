package Assignment_6;

public class Book {
    private String title;
    private final long ISBN;
    private String Author;
    private int price;
    public static int bookCount;

    public Book(long ISBN) {
        this.ISBN = ISBN;
        bookCount++;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return price;
    }

    public long getISBN() {
        return ISBN;
    }
    @Override
    public String toString() {
        return "Title \t: " + title + 
        "\nAuthor \t: " + Author + 
        "\nPrice \t: " + price + 
        "\nISBN \t: " + ISBN ; 
    }
}