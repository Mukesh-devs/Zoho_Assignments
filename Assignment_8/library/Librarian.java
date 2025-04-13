package Assignment_8.library;

import java.util.List;


public class Librarian {
    String name;
    int id;
    String password;
    String searchString;

    public Librarian(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void verify_librarian() {
        System.out.println("Librarian verified: " + name);
    }

    public void search(String keyword, List<Book> books) {
        System.out.println("Searching for: " + keyword);
        for (Book book : books) {
            if (book.title.contains(keyword) || book.author.contains(keyword)) {
                System.out.println("Found: " + book.title + " by " + book.author);
            }
        }
    }
}
