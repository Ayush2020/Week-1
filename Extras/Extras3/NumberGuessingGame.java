import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess between low and high
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getFeedback() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Is the guess (high, low, or correct)? ");
        return sc.nextLine().toLowerCase();
    }

    // Method to play the number guessing game
    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Please think of a number between 1 and 100, and I will try to guess it.");

        do {
            guess = generateGuess(low, high);
            System.out.println("I guess: " + guess);

            feedback = getFeedback();
            attempts++;

            // Adjust the guess based on the feedback
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Hooray! I guessed your number in " + attempts + " attempts.");
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }

        } while (!feedback.equals("correct"));
    }

    public static void main(String[] args) {
        // Start the game
        playGame();
    }
}
