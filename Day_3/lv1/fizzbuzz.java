import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        // Create a sc object to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit if input is not a positive integer
        }

        // Create a String array to store the results
        String[] results = new String[number];

        // Loop through numbers from 1 to the user-entered number
        for (int i = 1; i <= number; i++) {
            // Check if the number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            }
            // Check if the number is a multiple of 3
            else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            }
            // Check if the number is a multiple of 5
            else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            }
            // Otherwise, store the number itself
            else {
                results[i - 1] = Integer.toString(i);
            }
        }

        // Display the results in the specified format
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
    }
}
