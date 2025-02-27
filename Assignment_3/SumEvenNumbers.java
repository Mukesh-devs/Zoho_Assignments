package Assignment_3;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = sumOfEvenNumbers(array);
        System.out.println("Sum of even numbers: " + sum);
    }
    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                continue; 
            }
            sum += num;
        }
        return sum;
    }
}
