package exercise02_21;

import java.util.Scanner;

public class Exercise02_21 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the investment amount
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        // Prompt the user for the annual interest rate in percentage
        System.out.print("Enter the annual interest rate (e.g., 3.25 for 3.25%): ");
        double annualInterestRate = input.nextDouble();

        // Prompt the user for the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate the future investment value using the formula
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // Display the future investment value rounded to two decimal places
        System.out.printf("Future investment value is $%.2f%n", futureInvestmentValue);

        // Close the Scanner
        input.close();
    }
}

