
import java.util.Scanner;

public class MatrixAddition {

    // Method to add two matrices
    public static double[][] addMatrix(double[][] a, double[][] b) {
        // Check if matrices have the same dimensions
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        // Create a new matrix to hold the result
        double[][] c = new double[a.length][a[0].length];

        // Add corresponding elements of the matrices
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        // Initialize two 3x3 matrices
        try ( Scanner scanner = new Scanner(System.in)) {
            // Initialize two 3x3 matrices
            double[][] matrixA = new double[3][3];
            double[][] matrixB = new double[3][3];

            // Input for first matrix
            System.out.println("Enter the elements of the first 3x3 matrix (row by row):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixA[i][j] = scanner.nextDouble();
                }
            }

            // Input for second matrix
            System.out.println("Enter the elements of the second 3x3 matrix (row by row):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrixB[i][j] = scanner.nextDouble();
                }
            }

            // Add the matrices
            double[][] resultMatrix = addMatrix(matrixA, matrixB);

            // Display the result
            System.out.println("The sum of the two matrices is:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%.2f ", resultMatrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
