import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Function to generate and print the Fibonacci sequence up to n terms
    public static void generateFibonacci(int n) {
        // First two Fibonacci numbers
        int a = 0, b = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence up to " + n + " terms: ");

        // Handle the case where n is 1
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // Handle the case where n is 2
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Generate Fibonacci sequence for n > 2
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = sc.nextInt();

        // Call the function to generate and print the Fibonacci sequence
        generateFibonacci(terms);

    }
}
