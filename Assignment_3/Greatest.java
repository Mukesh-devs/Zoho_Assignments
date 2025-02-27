package Assignment_3;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1,Num2,Num3;
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();
        Num3 = sc.nextInt();

        if ( Num1 > Num2 && Num1 > Num3) {
            System.out.println("Num1 is Greatest...");
        }
        else if ( Num2 > Num3 && Num2 > Num3 ) {
            System.out.println("Num2 is Greatest...");
        }
        else {
            System.out.println("Num3 is Greatest...");
        }
    }
}
