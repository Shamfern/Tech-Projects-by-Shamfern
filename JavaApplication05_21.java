package javaapplication05_21;

import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for loan amount and loan period
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the loan period in years: ");
        int loanPeriodYears = scanner.nextInt();
        int loanPeriodMonths = loanPeriodYears * 12;

        // Interest rates from 5% to 8% with increments of 1/8%
        double startRate = 0.05; // 5%
        double endRate = 0.08;   // 8%
        double increment = 0.00125; // 1/8% in decimal

        System.out.printf("%-10s %-20s %-20s %-20s\n", "Rate", "Monthly Payment", "Total Payment", "Total Interest");
        
        // Loop through interest rates
        for (double annualRate = startRate; annualRate <= endRate; annualRate += increment) {
            double monthlyRate = annualRate / 12;
            double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyRate, loanPeriodMonths);
            double totalPayment = monthlyPayment * loanPeriodMonths;
            double totalInterest = totalPayment - loanAmount;

            System.out.printf("%-10.3f $%-19.2f $%-19.2f $%-19.2f\n", annualRate * 100, monthlyPayment, totalPayment, totalInterest);
        }

        scanner.close();
    }

    // Method to calculate monthly payment
    public static double calculateMonthlyPayment(double principal, double monthlyRate, int numberOfPayments) {
        if (monthlyRate == 0) {
            return principal / numberOfPayments; // No interest case
        } else {
            return principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                   (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        }
    }
}
