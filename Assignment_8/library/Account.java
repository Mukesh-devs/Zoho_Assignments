package Assignment_8.library;

public class Account {
    int no_borrowed_books;
    int no_reserved_books;
    int no_returned_books;
    int no_lost_books;
    double fine_amount;

    public void calculate_fine(int lateDays) {
        fine_amount = lateDays * 2.0;
        System.out.println("Fine calculated: ₹" + fine_amount);
    }

    public void displayAccountDetails() {
        System.out.println("Borrowed: " + no_borrowed_books +
                ", Reserved: " + no_reserved_books +
                ", Returned: " + no_returned_books +
                ", Lost: " + no_lost_books +
                ", Fine: ₹" + fine_amount);
    }
}
