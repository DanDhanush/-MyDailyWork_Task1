import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.println("Your score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}