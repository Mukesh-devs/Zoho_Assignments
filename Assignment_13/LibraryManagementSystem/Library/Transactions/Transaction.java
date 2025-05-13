package Library.Transactions;

import Library.Members.Member;
import Library.Book.Book;

public class Transaction {
    private Member member;
    private Book book;

    public Transaction(Member member, Book book) {
        this.member = member;
        this.book = book;
    }

    public void issueBook() {
        if (book.isAvailable()) {
            book.issue();
            member.memberDetails();
            System.out.println(member + " issued " + book);
        } else {
            System.out.println(book + " is already issued.");
        }
    }

    public void returnBook() {
        book.returnBook();
        System.out.println(member + " returned " + book);
    }
}
