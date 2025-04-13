package Assignment_8.library;

public class User {
    String name;
    int id;
    Account account;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.account = new Account();
    }

    public void verify() {
        System.out.println("Verifying user: " + name);
    }

    public void checkAccount() {
        account.displayAccountDetails();
    }

    public void get_book_info(Book book) {
        System.out.println("Book Info -> Title: " + book.title + ", Author: " + book.author);
    }
}
