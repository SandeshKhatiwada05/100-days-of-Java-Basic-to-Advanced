// Day 15: Java Class Practice – Random Number Game with Loops and Class Methods

import java.util.Random;
import java.util.Scanner;

// Game class to handle user and computer input
class Game {
    private final Scanner sc = new Scanner(System.in);
    private final Random random = new Random();

    // Method to take user input with validation
    public int getUserInput() {
        int userInput;
        while (true) {
            System.out.print("Enter a number (positive integer): ");
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                if (userInput >= 0) break;
                else System.out.println("❌ Please enter a non-negative number.");
            } else {
                System.out.println("❌ Invalid input. Please enter a number.");
                sc.next(); // Clear invalid input
            }
        }
        return userInput;
    }

    // Method to generate computer guess between 0 and user number
    public int generateComputerGuess(int max) {
        return random.nextInt(max + 1);
    }

    // Optional: close scanner if needed
    public void closeScanner() {
        sc.close();
    }
}

public class Java_15_ScissorPaper {

    public static void main(String[] args) {
        Game game = new Game();
        int userNumber = game.getUserInput();

        int attempts = 1;
        while (true) {
            int computerGuess = game.generateComputerGuess(userNumber);

            if (computerGuess == userNumber) {
                System.out.printf("🎉 Number %d matched on attempt %d!\n", userNumber, attempts);
                break;
            } else {
                System.out.printf("❌ Attempt %d failed. Computer guessed %d\n", attempts, computerGuess);
                attempts++;
            }
        }

        game.closeScanner(); // Optional cleanup
    }
}
