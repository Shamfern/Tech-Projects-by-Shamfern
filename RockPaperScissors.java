package exercise_3.pkg17;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            // Prompt the user for their choice
            System.out.println("Enter your choice: 0 for Scissors, 1 for Rock, 2 for Paper");
            int userChoice = scanner.nextInt();
            // Validate user input
            while (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                userChoice = scanner.nextInt();
            }   // Generate computer's choice
            int computerChoice = random.nextInt(3); // Generates 0, 1, or 2
            // Display choices
            System.out.println("You chose: " + choiceToString(userChoice));
            System.out.println("Computer chose: " + choiceToString(computerChoice));
            // Determine the outcome
            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) || // Scissors cuts Paper
                    (userChoice == 1 && computerChoice == 0) || // Rock crushes Scissors
                    (userChoice == 2 && computerChoice == 1)) { // Paper covers Rock
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            // Close the scanner
        }
    }

    // Helper method to convert choice number to string
    private static String choiceToString(int choice) {
        return switch (choice) {
            case 0 -> "Scissors";
            case 1 -> "Rock";
            case 2 -> "Paper";
            default -> "";
        };
    }
}

