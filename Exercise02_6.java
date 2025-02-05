package exercise02_6;

import java.util.Scanner;

public class Exercise02_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Check if the number is within the valid range
        if (number < 0 || number > 1000) {
            System.out.println("The number must be between 0 and 1000.");
        } else {
            // Calculate the sum of the digits
            int sum = 0;
            int tempNumber = number;

            while (tempNumber > 0) {
                sum += tempNumber % 10;  // Extract the last digit
                tempNumber /= 10;        // Remove the last digit
            }

            // Print the result
            System.out.println("The sum of the digits in " + number + " is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}



