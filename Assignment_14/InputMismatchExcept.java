import java.util.InputMismatchException;
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Enter Your Mobile Number: ");
            long number = scan.nextLong();
            System.out.println("Your Mobile Number is: "+ number);
        }catch(InputMismatchException e){
            System.out.println("Invalid Number!");
        }

    }
}
