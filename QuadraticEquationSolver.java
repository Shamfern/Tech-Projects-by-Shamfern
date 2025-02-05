package exercise_3.pkg2;

import java.util.Scanner;

/**
 * QuadraticEquationSolver
 * A program to solve quadratic equations of the form ax^2 + bx + c = 0
 * based on the discriminant.
 * 
 * @author Shami
 */
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Prompt user for coefficients
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for coefficients
            System.out.println("Enter the coefficients for the quadratic equation (ax^2 + bx + c = 0):");
            // Input for coefficient 'a'
            double a;
            do {
                System.out.print("Enter a (a ≠ 0): ");
                a = scanner.nextDouble();
                if (a == 0) {
                    System.out.println("Coefficient 'a' cannot be 0. Please enter a non-zero value for a.");
                }
            } while (a == 0);
            // Input for coefficient 'b'
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            // Input for coefficient 'c'
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;
            // Determine the roots based on the discriminant
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("The equation has two roots: %.2f and %.2f%n", root1, root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.printf("The equation has one root: %.2f%n", root);
            } else {
                System.out.println("The equation has no real roots.");
            }
            // Close the scanner
        }
    }
}