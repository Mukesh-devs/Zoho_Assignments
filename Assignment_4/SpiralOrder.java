package Assignment_4;

import java.util.Scanner;;
public class SpiralOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N): ");
        int N = scanner.nextInt();
        int[][] matrix = generateSpiralMatrix(N);
        printMatrix(matrix);
    }

    private static int[][] generateSpiralMatrix(int N) {
        int[][] matrix = new int[N][N];
        int value = 1;
        int top = 0, bottom = N - 1, left = 0, right = N - 1;

        while (value <= N * N) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
