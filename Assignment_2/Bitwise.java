package Assignment_2;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NumberOne = sc.nextInt();
        int NumberTwo = sc.nextInt();
        int __And__ = NumberOne & NumberTwo;
        int __Or__ = NumberOne | NumberTwo;
        int __Xor__ = NumberOne ^ NumberTwo;
        int LeftShift = NumberOne << NumberTwo; 
        int RightShift = NumberOne >> NumberTwo;
        System.out.println("And Operator : " + __And__);
        System.out.println("Or Operator : " + __Or__); 
        System.out.println("Xor Operator : " + __Xor__); 
        System.out.println("Leftshift Operator : " + LeftShift); 
        System.out.println("Rightshift Operator : " + RightShift);
        
    }
}
