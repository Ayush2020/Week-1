import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert the number to a string to easily access each digit
        String numberStr = Long.toString(number);

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop through each digit in the number and count its frequency
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = digitChar - '0';  // Convert the char to an integer
            frequency[digit]++;  // Increase the frequency of the digit
        }

        // Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
