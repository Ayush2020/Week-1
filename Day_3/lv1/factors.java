import java.util.Scanner;

class FindFactors {
    public static void main(String[] args) {
        // Create a sc object to get user input
        Scanner sc = new Scanner(System.in);

        // Take the input number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to keep track of where to store the next factor

        // Find factors and store them in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If i is a factor of number, add it to the array
                factors[index] = i;
                index++;

                // Check if array is full, and double the size if necessary
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor]; // Temporary array to hold larger size
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old elements to new array
                    factors = temp; // Point factors to the new larger array
                }
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

    }
}
