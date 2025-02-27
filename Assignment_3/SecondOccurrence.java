package Assignment_3;

public class SecondOccurrence {

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 4, 2, 8, 2};
        int target = 2;
        int index = findSecondOccurrence(array, target);
        System.out.println("Second occurrence of " + target + " is at index: " + index);
    }
    public static int findSecondOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == 2) {
                    return i; 
                }
            }
        }
        return -1; 
    }

}