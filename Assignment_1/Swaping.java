package Assignment_1;
public class Swaping {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before Swapping...");
        System.out.println("num1 - " + num1 + "\nnum2 - " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping...");
        System.out.println("num1 - " + num1 + "\nnum2 - " + num2);
    }
}
