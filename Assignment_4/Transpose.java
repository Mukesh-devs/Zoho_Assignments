package Assignment_4;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] transpose = new int[colCount][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < colCount; i++) {
            for (int j = 0; j < rowCount; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
