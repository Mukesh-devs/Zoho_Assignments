package Assignment_8.library;

import java.util.*;

public class LibraryDatabase {
    List<Book> list_of_books = new ArrayList<>();

    public void add(Book book) {
        list_of_books.add(book);
        System.out.println("Added: " + book.title);
    }

    public void delete(Book book) {
        list_of_books.remove(book);
        System.out.println("Deleted: " + book.title);
    }

    public void update(Book oldBook, Book newBook) {
        int index = list_of_books.indexOf(oldBook);
        if (index != -1) {
            list_of_books.set(index, newBook);
            System.out.println("Updated book: " + newBook.title);
        }
    }

    public void display() {
        System.out.println("Books in Library:");
        for (Book book : list_of_books) {
            System.out.println(book.title + " by " + book.author);
        }
    }

    public void search(String title) {
        for (Book book : list_of_books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: " + book.title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
