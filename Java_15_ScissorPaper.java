// Day 15: Java Class Practice – Random Number Game with Loops and Class Methods

import java.util.Random;
import java.util.Scanner;

// Game class to handle user and computer input
class Game {
    private Scanner sc = new Scanner(System.in); // Scanner kept open as class member

    // Method to take user input
    public int userput() {
        System.out.print("Enter a number (0 to upper limit): ");
        int userinput = sc.nextInt();
        return userinput;
    }

    // Method to generate computer guess between 0 and x
    public int computerput(int x) {
        Random random = new Random();
        return random.nextInt(x + 1);
    }
}

public class Java_15_ScissorPaper {

    public static void main(String[] args) {
        Game obj = new Game();

        int userNumber = obj.userput();
        int attempts = 1;

        while (true) {
            int computerGuess = obj.computerput(userNumber);

            if (userNumber == computerGuess) {
                System.out.printf("🎉 Number %d matched on attempt %d!\n", userNumber, attempts);
                break;
            } else {
                System.out.printf("❌ Attempt %d failed. Computer guessed %d\n", attempts, computerGuess);
                attempts++;
            }
        }
    }
}
