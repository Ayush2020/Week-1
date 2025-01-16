import java.util.Scanner;

public class GcdLcmCalculator {

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // Base case: If one of the numbers is 0, return the other number
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD of a and b is the same as GCD of b and a % b
        return calculateGCD(b, a % b);
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        // Use the formula for LCM
        return (a * b) / calculateGCD(a, b);
    }

    // Function to get the input from the user
    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    // Function to display the result
    public static void displayResult(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }

    public static void main(String[] args) {
        // Get the two numbers from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        displayResult(gcd, lcm);
    }
}
