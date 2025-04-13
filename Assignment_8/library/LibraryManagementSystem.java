package Assignment_8.library;
import java.util.*;

public class LibraryManagementSystem {
    String userType;
    String username;
    String password;

    List<User> users = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Librarian> librarians = new ArrayList<>();
    LibraryDatabase database = new LibraryDatabase();

    public void login(String username, String password) {
        System.out.println("Logging in user: " + username);
    }

    public void register(User user) {
        users.add(user);
        System.out.println("Registered user: " + user.name);
    }

    public void logout() {
        System.out.println("User logged out.");
    }
}
