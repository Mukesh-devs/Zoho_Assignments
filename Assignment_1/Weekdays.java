package Assignment_1;
import java.util.Scanner;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY, 
}

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if ( day < 8 && day > 0 ) {
            Day d = Day.values()[day-1];  
            System.out.println(d);
        }
    }
}
