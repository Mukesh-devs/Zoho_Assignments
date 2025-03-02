package Assignment_4;

import java.util.Scanner;

public class JaggedArray {
    private static int[][] weights;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int N = scanner.nextInt();
        weights = new int[N][];

        // Initialize the jagged array
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int numWeights = scanner.nextInt();
            weights[i] = new int[numWeights];
            System.out.println("Enter the weights for person " + (i + 1) + ": ");
            for (int j = 0; j < numWeights; j++) {
                weights[i][j] = scanner.nextInt();
            }
        }

        // Example usage of the functions
        enterWeight(1, 2, 75); // Enter weight 75 for person 2 at index 1
        System.out.println("Minimum weight of person 2: " + getMinimumWeight(2));
    }

    public static void enterWeight(int personIndex, int weightIndex, int weight) {
        if (personIndex < 1 || personIndex > weights.length || weightIndex < 0 || weightIndex >= weights[personIndex - 1].length) {
            System.out.println("Invalid index");
            return;
        }
        weights[personIndex - 1][weightIndex] = weight;
    }

    public static int getMinimumWeight(int personIndex) {
        if (personIndex < 1 || personIndex > weights.length) {
            System.out.println("Invalid person index");
            return -1;
        }
        int[] personWeights = weights[personIndex - 1];
        int minWeight = personWeights[0];
        for (int weight : personWeights) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }
        return minWeight;
    }
}
