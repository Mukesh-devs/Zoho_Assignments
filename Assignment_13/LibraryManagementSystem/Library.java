import Library.Book.Book;
import Library.Members.Member;
import Library.Transactions.Transaction;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "The Alchemist", "Paulo Coelho");
        Member member1 = new Member("M001", "Alice");

        Transaction t1 = new Transaction(member1, book1);
        System.out.println(book1.bookDetails());;
        System.out.println(member1.memberDetails());
        t1.issueBook();
        t1.issueBook();
        t1.returnBook();
        t1.issueBook();
    }
}