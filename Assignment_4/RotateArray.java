package Assignment_4;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        rotateArray(arr, target);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void rotateArray(int[] arr, int target) {
        int n = arr.length;
        target = target % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, target - 1);
        reverse(arr, target, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
