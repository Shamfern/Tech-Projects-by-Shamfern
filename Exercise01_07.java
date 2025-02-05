/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01_07;

/**
 *
 * @author Shami
 */
public class Exercise01_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define the values of a1, b, and c
        double a1 = 1.0; // Example value for a1
        double b = 2.0;  // Example value for b
        double c = 3.0;  // Example value for c

        // Calculate the first expression
        double result1 = (4 * a1 - 1) / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + c / b;

        // Calculate the second expression
        double result2 = (4 * a1 - 1) / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 * b;

        // Display the results
        System.out.println("Result of the first formula: " + result1);
        System.out.println("Result of the second formula: " + result2);
    }
}
