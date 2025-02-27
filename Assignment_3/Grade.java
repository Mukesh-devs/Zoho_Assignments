package Assignment_3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        if ( Marks <= 100 && Marks > 80 ) {
            System.out.println("Grade - A");
        }
        else if ( Marks <= 80 && Marks > 60 ) {
            System.out.println("Grade - B");
        }
        else if ( Marks <= 60 && Marks > 40 ) {
            System.out.println("Grade - C");
        }
        else {
            System.out.println("Grade - D");
        }
    }
}
