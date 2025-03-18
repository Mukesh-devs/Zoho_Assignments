package Assignment_7;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BookCons book = new BookCons("Let us C", "Yeswant", 450, 3456789);
        System.out.println(book);

        EmployeeCons emp = new EmployeeCons("Ram", "abc@gmail.com", "2345678234", "Devops");
        System.out.println(emp);

        MovieCons movie1 = new MovieCons("Goat", "Action", "Vp", (short) 9, 148, LocalDate.of(2024, 7, 16), Arrays.asList("Vijay","Meenakshi"));
        System.out.println(movie1);
    }
}
