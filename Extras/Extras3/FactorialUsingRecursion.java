import java.util.Scanner;

public class FactorialUsingRecursion {

    // Function to take input from the user
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static void main(String[] args) {
        // Get the input from the user
        int number = getInput();

        // Calculate the factorial using recursion
        int factorial = calculateFactorial(number);

        displayResult(number, factorial);
    }
}
