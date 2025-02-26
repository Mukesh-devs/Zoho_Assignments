package Assignment_2;

import java.util.Scanner;

public class Polynomial {
    public static void main(String []args) {
        double x,a,b,c;
        double x1 = 0,x2 = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double disc = Math.pow(b, 2) - 4 * a * c;

        if (disc > 0) {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and distinct: " + x1 + ", " + x2);
        } 
        else if (disc == 0) {
            x1 = -b / (2 * a);
            System.out.println("Roots are real and equal: " + x1);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " ± " + imaginaryPart + "i");
        }
    }
}
