package javaapplication.pkg4.pkg17;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first three letters of a month (e.g., Jan): ");
        String monthInput = scanner.next();

        // Convert the month input to lowercase for easier comparison
        String month = monthInput.toLowerCase();
        int days;

        // Determine the number of days in the specified month
        switch (month) {
            case "jan":
                days = 31;
                break;
            case "feb":
                days = (isLeapYear(year)) ? 29 : 28;
                break;
            case "mar":
                days = 31;
                break;
            case "apr":
                days = 30;
                break;
            case "may":
                days = 31;
                break;
            case "jun":
                days = 30;
                break;
            case "jul":
                days = 31;
                break;
            case "aug":
                days = 31;
                break;
            case "sep":
                days = 30;
                break;
            case "oct":
                days = 31;
                break;
            case "nov":
                days = 30;
                break;
            case "dec":
                days = 31;
                break;
            default:
                System.out.println("Incorrect month name.");
                scanner.close();
                return; // Exit if the month name is incorrect
        }

        // Display the number of days in the month
        System.out.println("Number of days in " + monthInput + " " + year + ": " + days);
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

