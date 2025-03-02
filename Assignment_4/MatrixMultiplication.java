package Assignment_4;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] product = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
